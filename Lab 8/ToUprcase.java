package com.lab8;

import java.util.Scanner;

public class ToUprcase {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a line of text: ");
		String input = scanner.nextLine();

		String[] words = input.split("\\s+"); // Split words by space

		StringBuilder result = new StringBuilder();

		for (String word : words) {// like while != words
			if (word.length() > 0) {

				String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
				result.append(capitalizedWord).append(" ");
			}
		}

		System.out.println("updated String: " + result.toString());

		scanner.close();
	}
}
