package pertemuan7;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;

	double firstnum, secondnum, result;
	String operation, answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 525, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(33, 11, 455, 62);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_7.getText();
			textField.setText(Number);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_7.setBounds(33, 84, 89, 48);
		frame.getContentPane().add(btn_7);
		
		JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_8.getText();
			textField.setText(Number);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_8.setBounds(132, 84, 89, 48);
		frame.getContentPane().add(btn_8);
		
		JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_9.getText();
			textField.setText(Number);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_9.setBounds(231, 84, 89, 48);
		frame.getContentPane().add(btn_9);
		
		JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_4.getText();
			textField.setText(Number);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_4.setBounds(33, 139, 89, 51);
		frame.getContentPane().add(btn_4);
		
		JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_5.getText();
			textField.setText(Number);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_5.setBounds(132, 139, 89, 51);
		frame.getContentPane().add(btn_5);
		
		JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_6.getText();
			textField.setText(Number);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_6.setBounds(231, 139, 89, 51);
		frame.getContentPane().add(btn_6);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_1.getText();
			textField.setText(Number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_1.setBounds(33, 201, 89, 47);
		frame.getContentPane().add(btn_1);
		
		JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_2.getText();
			textField.setText(Number);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_2.setBounds(132, 201, 89, 47);
		frame.getContentPane().add(btn_2);
		
		JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_3.getText();
			textField.setText(Number);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_3.setBounds(231, 201, 89, 47);
		frame.getContentPane().add(btn_3);
		
		JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Number = textField.getText()	+ btn_0.getText();
			textField.setText(Number);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_0.setBounds(132, 259, 89, 48);
		frame.getContentPane().add(btn_0);
		
		JButton btn_tambah = new JButton("+");
		btn_tambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "+";
			}
		});
		btn_tambah.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_tambah.setBounds(341, 84, 144, 48);
		frame.getContentPane().add(btn_tambah);
		
		JButton btn_kurang = new JButton("-");
		btn_kurang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "-";
			}
		});
		btn_kurang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_kurang.setBounds(341, 139, 144, 48);
		frame.getContentPane().add(btn_kurang);
		
		JButton btn_kali = new JButton("*");
		btn_kali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "*";
			}
		});
		btn_kali.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_kali.setBounds(341, 198, 144, 48);
		frame.getContentPane().add(btn_kali);
		
		JButton btn_bagi = new JButton("/");
		btn_bagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			firstnum = Double.parseDouble(textField.getText());
			textField.setText("");
			operation = "/";
			}
		});
		btn_bagi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_bagi.setBounds(341, 259, 144, 48);
		frame.getContentPane().add(btn_bagi);
		
		JButton btn_hasil = new JButton("=");
		btn_hasil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnum = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = firstnum + secondnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "-") {
					result = firstnum - secondnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "*") {
					result = firstnum * secondnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				} else if(operation == "/") {
					result = firstnum / secondnum;
					answer= String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btn_hasil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_hasil.setBounds(231, 259, 89, 48);
		frame.getContentPane().add(btn_hasil);
		
		JButton btn_clear = new JButton("C");
		btn_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_clear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_clear.setBounds(33, 259, 89, 48);
		frame.getContentPane().add(btn_clear);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String koma = textField.getText() + btn_dot.getText();
				textField.setText(koma);
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_dot.setBounds(33, 316, 89, 48);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_plusminus = new JButton("+/-");
		btn_plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				int intValue = (int) Math.round(ops);
				intValue = intValue * (-1);
				textField.setText(String.valueOf(intValue));
			}
		});
		btn_plusminus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_plusminus.setBounds(132, 318, 89, 48);
		frame.getContentPane().add(btn_plusminus);
		
		JButton btn_back = new JButton("<");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					back = strB.toString();
					textField.setText(back);
				}
			}
		});
		btn_back.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_back.setBounds(231, 318, 89, 48);
		frame.getContentPane().add(btn_back);
	}
}
