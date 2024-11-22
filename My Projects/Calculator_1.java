package com.myself;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Calculator_1 extends JFrame implements ActionListener {
	public static void main(String[] args) {
		Calculator_1 frame = new Calculator_1();
		frame.setVisible(true);
		frame.setBackground(Color.gray);
		frame.setTitle("CALCULATOR");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	double num1, num2, result;
	String operator;

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bac, bs, bplus, bpts, bsub, bmul, bdiv, bans;
	JTextField display;
	JPanel jp1, jp2, jp3, jp4, jp5, jp6, mp;

	public Calculator_1() {
		mp = new JPanel(new GridLayout(6, 1));

		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(1, 1));
		display = new JTextField();
		display.setEditable(false);
		jp1.add(display);
		mp.add(jp1);

		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1, 3));
		bac = new JButton("AC");
		bs = new JButton("DEL");
		bans = new JButton("=");
		jp2.add(bac);
		jp2.add(bs);
		jp2.add(bans);
		mp.add(jp2);

		jp3 = new JPanel();
		jp3.setLayout(new GridLayout(1, 4));
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		bdiv = new JButton("/");
		jp3.add(b7);
		jp3.add(b8);
		jp3.add(b9);
		jp3.add(bdiv);
		mp.add(jp3);

		jp4 = new JPanel();
		jp4.setLayout(new GridLayout(1, 4));
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		bmul = new JButton("X");
		jp4.add(b4);
		jp4.add(b5);
		jp4.add(b6);
		jp4.add(bmul);
		mp.add(jp4);

		jp5 = new JPanel();
		jp5.setLayout(new GridLayout(1, 4));
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		bsub = new JButton("-");
		jp5.add(b1);
		jp5.add(b2);
		jp5.add(b3);
		jp5.add(bsub);
		mp.add(jp5);

		jp6 = new JPanel();
		jp6.setLayout(new GridLayout(1, 3));
		bpts = new JButton(".");
		b0 = new JButton("0");
		bplus = new JButton("+");
		jp6.add(bpts);
		jp6.add(b0);
		jp6.add(bplus);
		mp.add(jp6);

		add(mp);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bplus.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bac.addActionListener(this);
		bs.addActionListener(this);
		bans.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b0 || e.getSource() == b1 || e.getSource() == b2 || e.getSource() == b3
				|| e.getSource() == b4 || e.getSource() == b5 || e.getSource() == b6 || e.getSource() == b7
				|| e.getSource() == b8 || e.getSource() == b9 || e.getSource() == bpts) {
			display.setText(display.getText().concat(((JButton) e.getSource()).getText()));
		}
//        if(e.getSource()==bpts){
//            display.setText(display.getText().concat();
//        }

//        if(e.getSource()instanceof JButton){
//            JButton clickedButton = (JButton) e.getSource();
//            String buttonText = clickedButton.getText();
//
//            display.setText(display.getText().concat(buttonText));
//
//        }
		if (e.getSource() == bplus) {
			num1 = Double.parseDouble(display.getText());
			operator = "+";
			display.setText("");
		}
		if (e.getSource() == bsub) {
			num1 = Double.parseDouble(display.getText());
			operator = "-";
			display.setText("");
		}
		if (e.getSource() == bmul) {
			num1 = Double.parseDouble(display.getText());
			operator = "X";
			display.setText("");
		}
		if (e.getSource() == bdiv) {
			num1 = Double.parseDouble(display.getText());
			operator = "/";
			display.setText("");
		}
		if (e.getSource() == bans) {
			num2 = Double.parseDouble(display.getText());
			switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "X":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			}
			display.setText(String.valueOf(result));

		}
		if (e.getSource() == bac) {
			display.setText("");
		}
		if (e.getSource() == bs) {
			String str = display.getText();
			display.setText("");
			for (int i = 0; i < str.length() - 1; i++) {
				display.setText(display.getText() + str.charAt(i));
			}
		}

	}
}
