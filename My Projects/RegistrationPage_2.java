package com.myself;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationPage_2 extends JFrame {

	JLabel lname, laddress, lgender, lhobbies;
	JTextField tname, taddress;
	JRadioButton male, female;
	ButtonGroup bg;
	JCheckBox c, cpp, java, python;
	JButton registration, reset;
	JPanel jp1, jp2, jp3, jp4, mp;
	JLabel resultLabel;

	// Constructor
	RegistrationPage_2() {
		mp = new JPanel(new GridLayout(6, 1));

		jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2, 2));
		lname = new JLabel("Name");
		laddress = new JLabel("Address");
		tname = new JTextField();
		taddress = new JTextField();
		jp1.add(lname);
		jp1.add(laddress);
		jp1.add(tname);
		jp1.add(taddress);
		mp.add(jp1);

		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(1, 3));
		lgender = new JLabel("Gender");
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		jp2.add(lgender);
		jp2.add(male);
		jp2.add(female);
		mp.add(jp2);

		jp3 = new JPanel();
		jp3.setLayout(new GridLayout(1, 5));
		lhobbies = new JLabel("Hobbies");
		c = new JCheckBox("C");
		cpp = new JCheckBox("C++");
		java = new JCheckBox("Java");
		python = new JCheckBox("Python");
		jp3.add(lhobbies);
		jp3.add(c);
		jp3.add(cpp);
		jp3.add(java);
		jp3.add(python);
		mp.add(jp3);

		jp4 = new JPanel();
		jp4.setLayout(new GridLayout(1, 2));
		registration = new JButton("Register");
		reset = new JButton("Reset");
		jp4.add(registration);
		jp4.add(reset);
		mp.add(jp4);

		resultLabel = new JLabel("");
		mp.add(resultLabel);

		add(mp);

		registration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String name = tname.getText();
				String address = taddress.getText();
				String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
				StringBuilder hobbies = new StringBuilder();

				if (c.isSelected())
					hobbies.append("C, ");
				if (cpp.isSelected())
					hobbies.append("C++, ");
				if (java.isSelected())
					hobbies.append("Java, ");
				if (python.isSelected())
					hobbies.append("Python, ");

				if (hobbies.length() > 0) {
					hobbies.delete(hobbies.length() - 2, hobbies.length());
				}

				resultLabel.setText("Welcome, " + name + "Address: " + address + "Gender: " + gender + "Hobbies: "
						+ hobbies.toString());
			}
		});

		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tname.setText("");
				taddress.setText("");
				bg.clearSelection();
				c.setSelected(false);
				cpp.setSelected(false);
				java.setSelected(false);
				python.setSelected(false);
				resultLabel.setText("");
			}
		});
	}

	public static void main(String[] args) {

		RegistrationPage_2 frame = new RegistrationPage_2();
		frame.setTitle("Registration Page");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
