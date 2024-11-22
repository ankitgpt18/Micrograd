package com.myself;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class TicTacToe extends JFrame {
	private final JButton[][] buttons = new JButton[3][3];
	private boolean xTurn = true; // true = X's turn, false = O's turn

	public TicTacToe() {
		setTitle("Simple Tic Tac Toe");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 3));
		initializeBoard();
		setVisible(true);
	}

	private void initializeBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				buttons[row][col] = new JButton("");
				buttons[row][col].setFont(new Font("Arial", Font.BOLD, 60));
				buttons[row][col].setFocusPainted(false);
				buttons[row][col].addActionListener(new ButtonClickListener(row, col));
				add(buttons[row][col]);
			}
		}
	}

	private class ButtonClickListener implements ActionListener {
		private final int row;
		private final int col;

		public ButtonClickListener(int row, int col) {
			this.row = row;
			this.col = col;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (!buttons[row][col].getText().equals(""))
				return; // Ignore if already marked

			buttons[row][col].setText(xTurn ? "X" : "O");
			if (checkForWin()) {
				JOptionPane.showMessageDialog(TicTacToe.this, "Player " + (xTurn ? "X" : "O") + " wins!");
				resetBoard();
			} else if (isBoardFull()) {
				JOptionPane.showMessageDialog(TicTacToe.this, "It's a draw!");
				resetBoard();
			} else {
				xTurn = !xTurn; // Switch turn
			}
		}
	}

	private boolean checkForWin() {
		for (int i = 0; i < 3; i++) {
			if (checkRow(i) || checkColumn(i))
				return true;
		}
		return checkDiagonals();
	}

	private boolean checkRow(int row) {
		return buttons[row][0].getText().equals(buttons[row][1].getText())
				&& buttons[row][0].getText().equals(buttons[row][2].getText()) && !buttons[row][0].getText().equals("");
	}

	private boolean checkColumn(int col) {
		return buttons[0][col].getText().equals(buttons[1][col].getText())
				&& buttons[0][col].getText().equals(buttons[2][col].getText()) && !buttons[0][col].getText().equals("");
	}

	private boolean checkDiagonals() {
		return (buttons[0][0].getText().equals(buttons[1][1].getText())
				&& buttons[0][0].getText().equals(buttons[2][2].getText()) && !buttons[0][0].getText().equals(""))
				|| (buttons[0][2].getText().equals(buttons[1][1].getText())
						&& buttons[0][2].getText().equals(buttons[2][0].getText())
						&& !buttons[0][2].getText().equals(""));
	}

	private boolean isBoardFull() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				if (buttons[row][col].getText().equals(""))
					return false;
			}
		}
		return true;
	}

	private void resetBoard() {
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				buttons[row][col].setText("");
			}
		}
		xTurn = true; // X starts again
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(TicTacToe::new);
	}
}
