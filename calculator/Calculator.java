package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	
	BigDecimal firstInput;
	BigDecimal secondInput;
	BigDecimal result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		// frame or window
		frmCalculator = new JFrame();
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.setSize(255, 410);
		frmCalculator.setResizable(false);
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBackground(Color.WHITE);
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmCalculator.getContentPane().setLayout(null);
		
		// calculator screen
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 230, 62);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		// BUTTONS!
		
		//button.
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(130, 325, 50, 50);
		frmCalculator.getContentPane().add(btnDot);
		
		//button0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 325, 110, 50);
		frmCalculator.getContentPane().add(btn0);
		
		//All Clear
		JButton btnAC = new JButton("AC");
		btnAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null); //erase all input
			}
		});
		btnAC.setForeground(Color.BLACK);
		btnAC.setBackground(Color.RED);
		btnAC.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAC.setBounds(10, 84, 50, 50);
		frmCalculator.getContentPane().add(btnAC);
		
		//button7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 145, 50, 50);
		frmCalculator.getContentPane().add(btn7);
		
		//button8
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(70, 145, 50, 50);
		frmCalculator.getContentPane().add(btn8);
		
		//button9
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(130, 145, 50, 50);
		frmCalculator.getContentPane().add(btn9);
		
		//button4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 206, 50, 50);
		frmCalculator.getContentPane().add(btn4);
		
		//button5
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(70, 206, 50, 50);
		frmCalculator.getContentPane().add(btn5);
		
		//button6
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(130, 206, 50, 50);
		frmCalculator.getContentPane().add(btn6);
		
		//button1
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 267, 50, 50);
		frmCalculator.getContentPane().add(btn1);
		
		//button2
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(70, 267, 50, 50);
		frmCalculator.getContentPane().add(btn2);
		
		//button3
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(130, 267, 50, 50);
		frmCalculator.getContentPane().add(btn3);
		
		//OPERATION BUTTONS!
		
		//button+/-
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BigDecimal input = new BigDecimal(String.valueOf(textField.getText()));
				input = input.negate(); // negate!
				textField.setText(String.valueOf(input));
			}
		});
		btnPlusMinus.setForeground(Color.BLACK);
		btnPlusMinus.setBackground(Color.WHITE);
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPlusMinus.setBounds(70, 84, 50, 50);
		frmCalculator.getContentPane().add(btnPlusMinus);
		
		//button%
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstInput = new BigDecimal(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPercent.setForeground(Color.BLACK);
		btnPercent.setBackground(Color.WHITE);
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPercent.setBounds(130, 84, 50, 50);
		frmCalculator.getContentPane().add(btnPercent);
		
		//button÷
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				firstInput = new BigDecimal(textField.getText());
				textField.setText("");
				operations = "÷";
			}
		});
		btnDivide.setBackground(Color.ORANGE);
		btnDivide.setForeground(Color.BLACK);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDivide.setBounds(190, 84, 50, 50);
		frmCalculator.getContentPane().add(btnDivide);
		
		//buttonX
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstInput = new BigDecimal(textField.getText());
				textField.setText("");
				operations = "X";
			}
		});
		btnX.setForeground(Color.BLACK);
		btnX.setBackground(Color.ORANGE);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBounds(190, 145, 50, 50);
		frmCalculator.getContentPane().add(btnX);
		
		//button-
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstInput = new BigDecimal(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnMinus.setForeground(Color.BLACK);
		btnMinus.setBackground(Color.ORANGE);
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(190, 206, 50, 50);
		frmCalculator.getContentPane().add(btnMinus);
		
		//button+
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstInput = new BigDecimal(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBackground(Color.ORANGE);
		btnPlus.setForeground(Color.BLACK);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlus.setBounds(190, 267, 50, 50);
		frmCalculator.getContentPane().add(btnPlus);
		
		//button=
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				secondInput = new BigDecimal(textField.getText());
				
				if (operations.equals("+")) {
					result = firstInput.add(secondInput); // add!
					answer = result.toPlainString();
					textField.setText(answer);
					
				}
				else if (operations.equals("-")) {
					result = firstInput.subtract(secondInput); // subtract!
					answer = result.toPlainString();
					textField.setText(answer);
				}
				else if (operations.equals("X")) {
					result = firstInput.multiply(secondInput); // multiply!
					answer = result.toPlainString();
					textField.setText(answer);
				}
				else if (operations.equals("÷")) {
					result = firstInput.divide(secondInput); // divide!
					answer = result.toPlainString();
					textField.setText(answer);
				}
				else if (operations.equals("%")) {
					result = firstInput.divide(new BigDecimal(100)).multiply(secondInput); // percent!
					answer = result.toPlainString();
					textField.setText(answer);
				}
				
				
			}
		});
		btnEquals.setForeground(Color.BLACK);
		btnEquals.setBackground(Color.BLUE);
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEquals.setBounds(190, 325, 50, 50);
		frmCalculator.getContentPane().add(btnEquals);
		
	}
}