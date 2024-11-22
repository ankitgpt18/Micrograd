package com.lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFreq {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		System.out.print("Enter the number n: ");
		int n = scanner.nextInt();

		Map<Character, Integer> charCountMap = new HashMap<>();
		for (char c : input.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > n) {
				System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
			}
		}
	}
}

//n is frequency greater than n letters
//n is frequency greater than n letters
//n is frequency greater than n letters