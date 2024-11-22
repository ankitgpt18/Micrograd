package com.lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PerfectStr {// 1 letter occurs only once
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the String ");
		String str = in.nextLine();
		System.out.println(" string is :" + str);
		boolean flag = false;
		if (!stringchecker(str)) {
			System.out.println("not perfect");
		} else {
			System.out.println("perfect");
		}
	}

	static boolean stringchecker(String s) {
		Map<Character, Integer> charfreq = new HashMap<>();
		for (char c : s.toCharArray()) {
			charfreq.put(c, charfreq.getOrDefault(c, 0) + 1);

		}
		for (Map.Entry<Character, Integer> entry : charfreq.entrySet()) {
			if (entry.getValue() > 1) {
				return false;
			}
		}

		return true;
	}
}