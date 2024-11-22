package com.lab8;

import java.util.Scanner;

public class VowelPosition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a line: ");
		String input = scanner.nextLine();

		System.out.println("Vowels and their positions:");

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {

				System.out.println("Vowel: " + ch + ", Position: " + (i + 1));
			}
		}

		scanner.close();
	}
}
