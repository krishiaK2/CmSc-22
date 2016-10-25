package gui;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * Created by asus pc on 10/25/2016.
 */
public class Jang extends Frame {

    // score recorder
    private int playerScore = 0;
    private int computerScore = 0;

    Random rand = new Random();

    public String piliCom() {
        int randomCom = rand.nextInt(5);
        if (randomCom == 0) {
            return "Rock";
        }
        else if (randomCom == 1) {
            return "Paper";
        }
        else if (randomCom == 2) {
            return "Scissor";
        }
        else if (randomCom == 3) {
            return "Lizard";
        } else {
            return "Spock";
        }
    }

     public String piliPlayer() {
         Checkbox cb = battle.getSelectedCheckbox();
         return cb.getLabel();
     }

    //objects
    private Label choice;
    private Label Pscore;
    private Label Cscore;
    private CheckboxGroup battle;
    private TextArea result;
    private Button go;
    private TextField scoreP;
    private TextField scoreC;

    public Jang() {

        setLayout(new FlowLayout());

        // mga labels sa frame
        choice = new Label("Your Choice:");
        Pscore = new Label("Player's Score:");
        Cscore = new Label("Computer's Score");

        // checkboxGroup sa frame
        battle = new CheckboxGroup();

        // result textarea sa frame
        result = new TextArea("Result:\n", 38, 40);

        // button sa Frame
        go = new Button("RockPaperScissorLizardSpock!");

        // TextField score sa Frame
        scoreP = new TextField("0", 1);
        scoreC = new TextField("0", 1);

        // add the objects to the frame
        add(choice);
        add(new Checkbox("Rock", battle, false));
        add(new Checkbox("Paper", battle, false));
        add(new Checkbox("Scissor", battle, false));
        add(new Checkbox("Lizard", battle, false));
        add(new Checkbox("Spock", battle, false));
        add(result);
        add(go);
        add(Pscore);
        add(scoreP);
        add(Cscore);
        add(scoreC);

        //anonymous class:
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String win = "";
                String p = piliPlayer();
                String c = piliCom();

                if ((playerScore == 5) || (computerScore == 5)) {
                    gameOver();
                } else {
                    result.append("\tPlayer chose: " + p + "\n");
                    result.append("\tComputer chose: " + c + "\n");
                    if (p.equals(c)) {
                        result.append("\n\t\tTIE!\n\n");
                    }
                    else if (((c.equals("Rock") && (p.equals("Lizard") || p.equals("Scissor"))) ||
                            (c.equals("Paper") && (p.equals("Rock") || p.equals("Spock"))) ||
                            (c.equals("Scissor") && (p).equals("Lizard") || p.equals("Paper"))) ||
                            (c.equals("Lizard") && (p.equals("Spock") || p.equals("Paper"))) ||
                            (c.equals("Spock") && (p.equals("Rock") || p.equals("Scissor")))) {
                        win = "Computer";
                        computerScore++;
                        scoreC.setText(Integer.toString(computerScore));
                        result.append("\t\n" + win + " Won this round!\n\n");
                    } else {
                        win = "Player";
                        playerScore++;
                        scoreP.setText(Integer.toString(playerScore));
                        result.append("\t\n" + win + " Won this round!\n\n");
                    }
                }
            }
        });

        // TextArea and TextField not editable
        result.setEditable(false);
        scoreP.setEditable(false);
        scoreC.setEditable(false);

        // FRAME
        setTitle("RockPaperScissorLizardSpock!");
        setSize(500, 700);
        setVisible(true);

        // close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    // SWING ni sir... sorry... :(
    public void gameOver() {

        String winner;

        if (computerScore > playerScore)
            winner = "Computer";
        else
            winner = "Player";

        int selectedOption = JOptionPane.showConfirmDialog(
                null, "GAME OVER\n" + winner + " Won",
                "\nPlay Again?", JOptionPane.YES_NO_OPTION);

        if (selectedOption == JOptionPane.NO_OPTION) {
            System.exit(ABORT); //terminates the program

        } else
            new Jang();
    }

    public static void main(String[] args) {

        new Jang();

    }

}