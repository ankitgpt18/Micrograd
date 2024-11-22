package com.lab8;

import java.util.Scanner;

public class Findstr {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a line of text: ");
		String input = scanner.nextLine();

		int firstIndex = input.indexOf("the");
		int lastIndex = input.lastIndexOf("the");

		if (firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex) {

			// find btw both the
			String extractedSubstring = input.substring(firstIndex + 3, lastIndex);

			System.out.println("text btw both the:");
			System.out.println(extractedSubstring);
		} else {
			System.out.println("string 'the' does not available twice in the input");
		}

		scanner.close();
	}
}
