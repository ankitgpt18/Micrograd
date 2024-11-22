package com.myself;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class SnakeGame extends JFrame {
	private GamePanel gamePanel;

	public SnakeGame() {
		setTitle("Snake Game");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		gamePanel = new GamePanel();
		add(gamePanel);
		pack();

		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(SnakeGame::new);
	}
}

class GamePanel extends JPanel implements ActionListener {
	private final int TILE_SIZE = 10;
	private final int GRID_SIZE = 30;
	private final int SCREEN_SIZE = TILE_SIZE * GRID_SIZE;
	private final int MAX_SNAKE_LENGTH = GRID_SIZE * GRID_SIZE;

	private int[] x = new int[MAX_SNAKE_LENGTH];
	private int[] y = new int[MAX_SNAKE_LENGTH];
	private int snakeLength;
	private int foodX, foodY;
	private char direction = 'R';
	private boolean isRunning = true;

	private Timer timer;
	private Random random;

	public GamePanel() {
		setPreferredSize(new Dimension(SCREEN_SIZE, SCREEN_SIZE));
		setBackground(Color.BLACK);
		setFocusable(true);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if (direction != 'R')
						direction = 'L';
					break;
				case KeyEvent.VK_RIGHT:
					if (direction != 'L')
						direction = 'R';
					break;
				case KeyEvent.VK_UP:
					if (direction != 'D')
						direction = 'U';
					break;
				case KeyEvent.VK_DOWN:
					if (direction != 'U')
						direction = 'D';
					break;
				}
			}
		});

		random = new Random();
		startGame();
	}

	public void startGame() {
		snakeLength = 5;
		for (int i = 0; i < snakeLength; i++) {
			x[i] = 50 - i * TILE_SIZE;
			y[i] = 50;
		}
		spawnFood();

		timer = new Timer(100, this);
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (isRunning) {
			move();
			checkFoodCollision();
			checkCollisions();
		}
		repaint();
	}

	public void move() {
		for (int i = snakeLength; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		switch (direction) {
		case 'L':
			x[0] -= TILE_SIZE;
			break;
		case 'R':
			x[0] += TILE_SIZE;
			break;
		case 'U':
			y[0] -= TILE_SIZE;
			break;
		case 'D':
			y[0] += TILE_SIZE;
			break;
		}
	}

	public void checkFoodCollision() {
		if (x[0] == foodX && y[0] == foodY) {
			snakeLength++;
			spawnFood();
		}
	}

	public void spawnFood() {
		foodX = random.nextInt(GRID_SIZE) * TILE_SIZE;
		foodY = random.nextInt(GRID_SIZE) * TILE_SIZE;
	}

	public void checkCollisions() {
		for (int i = snakeLength; i > 0; i--) {
			if (x[0] == x[i] && y[0] == y[i]) {
				isRunning = false;
			}
		}
		if (x[0] < 0 || x[0] >= SCREEN_SIZE || y[0] < 0 || y[0] >= SCREEN_SIZE) {
			isRunning = false;
		}
		if (!isRunning) {
			timer.stop();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (isRunning) {
			g.setColor(Color.RED);
			g.fillRect(foodX, foodY, TILE_SIZE, TILE_SIZE);

			for (int i = 0; i < snakeLength; i++) {
				g.setColor(i == 0 ? Color.GREEN : Color.WHITE);
				g.fillRect(x[i], y[i], TILE_SIZE, TILE_SIZE);
			}
		} else {
			showGameOver(g);
		}
	}

	public void showGameOver(Graphics g) {
		String message = "Game Over";
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		FontMetrics metrics = getFontMetrics(g.getFont());
		g.drawString(message, (SCREEN_SIZE - metrics.stringWidth(message)) / 2, SCREEN_SIZE / 2);
	}
}
