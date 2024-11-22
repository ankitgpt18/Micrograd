package com.myself;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class RockPaper extends JFrame {
	private JButton btnRock, btnPaper, btnScissors;
	private JLabel lblUserChoice, lblComputerChoice, lblResult;
	private Random random;

	public RockPaper() {
		setTitle("Rock, Paper, Scissors");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		btnRock = new JButton("Rock");
		btnPaper = new JButton("Paper");
		btnScissors = new JButton("Scissors");
		lblUserChoice = new JLabel("Your choice: ");
		lblComputerChoice = new JLabel("Computer's choice: ");
		lblResult = new JLabel("Result: ");

		add(btnRock);
		add(btnPaper);
		add(btnScissors);
		add(lblUserChoice);
		add(lblComputerChoice);
		add(lblResult);

		random = new Random();

		ActionListener buttonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String userChoice = "";

				if (e.getSource() == btnRock) {
					userChoice = "Rock";
				} else if (e.getSource() == btnPaper) {
					userChoice = "Paper";
				} else if (e.getSource() == btnScissors) {
					userChoice = "Scissors";
				}

				playGame(userChoice);
			}
		};

		btnRock.addActionListener(buttonListener);
		btnPaper.addActionListener(buttonListener);
		btnScissors.addActionListener(buttonListener);
	}

	private void playGame(String userChoice) {
		String[] choices = { "Rock", "Paper", "Scissors" };
		String computerChoice = choices[random.nextInt(3)];

		lblUserChoice.setText("Your choice: " + userChoice);
		lblComputerChoice.setText("Computer's choice: " + computerChoice);

		String result = determineWinner(userChoice, computerChoice);
		lblResult.setText("Result: " + result);
	}

	private String determineWinner(String userChoice, String computerChoice) {
		if (userChoice.equals(computerChoice)) {
			return "It's a tie!";
		} else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors"))
				|| (userChoice.equals("Scissors") && computerChoice.equals("Paper"))
				|| (userChoice.equals("Paper") && computerChoice.equals("Rock"))) {
			return "You win!";
		} else {
			return "Computer wins!";
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				RockPaper game = new RockPaper();
				game.setVisible(true);
			}
		});
	}
}
