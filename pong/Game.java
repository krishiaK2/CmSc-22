package pong;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Created by asus pc on 10/21/2016.
 */
@SuppressWarnings("serial")
public class Game extends JPanel {

    Ball ball = new Ball(this); // initialized the object Ball
    Racquet racquet = new Racquet(this); // initialized the object Racquet for player 1
    Racquet racquet2 = new Racquet(this); // initialized the object Racquet for player 2

    int speed = 1; // initial speed P1
    int speed2 = 1; // initial speed P2
    int score = 0; // P1 score
    int score2 = 0; // P2 score

    // P1
    private int getScore() {
        return score;
    }

    // P2
    private int getScore2() {
        return score2;
    }

    private int getPlayer(){
        if (score > score2) {
            return 1;
        }
        return 2;
    }

    public Game() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // the game doesn't require our player to type anything for the program
            }

            @Override
            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e); // makes the racquet stop (see implementation from class Racquet)
                racquet2.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e); // makes the racquet move left or right (see implementation from class Racquet)
                racquet2.keyPressed(e);
            }

        });
        setFocusable(true); // allows the game to receive the focus of the keyboard
        Sound.BACK.loop(); // plays the background sound effect and loops it until the game is over


    }

    private void move() throws InterruptedException {
        ball.move(); // calls the move() implementation of the object ball from the class Ball
        racquet.move(); // calls the move() implementation of the object racquet from the class Racquet
        racquet2.move2();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // extends from a default old class Graphics (super class), CLEANS THE SCREEN BEFORE PAINTING THE NEW WORLD
        Graphics2D g2d = (Graphics2D) g; // we can use all the Graphics2D methods to draw, initialization
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); // makes the borders of the figures (ball & racquet) smoother
        ball.paint(g2d);  // calls the paint() implementation of the object ball from the class Ball
        racquet.paint1(g2d);  // calls the paint() implementation of the object racquet from the class Racquet
        racquet2.paint2(g2d);

        // player 1 score
        g2d.setColor(Color.BLACK); // set the color of the score or speed on the game , player 1
        g2d.setFont(new Font("Verdana", Font.BOLD, 10)); // sets the font of the score or speed
        g2d.drawString(String.valueOf("Player 1 score = " + getScore()), 5, 10); // draw/paint the txt in the position (5, 10)

        // player 2 score
        Graphics2D g2d2 = (Graphics2D) g;
        g2d2.setColor(Color.BLACK); // set the color of the score or speed on the game , player 2
        g2d2.setFont(new Font("Verdana", Font.BOLD, 10)); //sets the
        g2d2.drawString(String.valueOf("Player 2 score = " + getScore2()), 175, 350); // draw/paint the txt in the position (175, 350)
    }

    public void gameOver() throws InterruptedException {
        Sound.BACK.stop(); // stops the background sound effects
        Sound.GAMEOVER.play(); // plays the game over sound effects

        if ((score != 3) && (score2 != 3)) {
            JOptionPane.showMessageDialog(null, "Player 1's score is: " + score +
                            "\nPlayer 2's score is: " + score2,
                    "\nBest of 3!", JOptionPane.OK_OPTION);

            gameOn();

        } else {
            int selectedOption = JOptionPane.showConfirmDialog(
                    null, "Player " + getPlayer() + " WINS!\n\n" + "Player 1's score is: " + score +
                            "\nPlayer 2's score is: " + score2,
                    "\nPlay Again?", JOptionPane.YES_NO_OPTION);

            if (selectedOption == JOptionPane.NO_OPTION) {
                System.exit(ABORT); //terminates the program

            } else {
                score = 0; //sets the score back to zero for a new game
                score2 = 0; //sets the score back to zero for a new game
                gameOn(); // runs the game again
            }
        }
    }

    //FIXME!!! Scores won't update in the world when gameOn will be called!
    public static void gameOn() throws InterruptedException {
        JFrame frame = new JFrame("Ping Pong");//creating a window with a name Ping Pong
        Game game = new Game(); // initialization
        frame.add(game);
        frame.setSize(300, 400);//size of the window in pixel
        frame.setVisible(true); //visibility of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//assurance that the program will terminate if we close the program

        //game loop!
        while (true) {
            game.move(); //moves the ball in position x and y both increased by 1
            game.repaint(); //updates or rendering the world/game
            Thread.sleep(10); //thread which is being run must sleep for 10 milliseconds
        }
    }

    public static void main(String[] args) throws InterruptedException {

        gameOn();

    }
}