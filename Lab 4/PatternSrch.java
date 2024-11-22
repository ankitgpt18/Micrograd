package com.lab4;

import java.util.Scanner;

public class PatternSrch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Range from: ");
		int start = scanner.nextInt();
		System.out.print("to ");
		int end = scanner.nextInt();

		System.out.print("Enter searching pattern: ");
		String pattern = scanner.next();

		// Count the occurrences of the pattern in the specified range
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (Integer.toString(i).contains(pattern)) {
				count++;
			}
		}

		// Display the result
		System.out.println(pattern + " occurred " + count + " times");
	}
}
