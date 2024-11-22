package com.lab1;

import java.util.Scanner;

public class DigitSeperator_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the five digit number");
		int number = in.nextInt();
		DigitSeparator ds = new DigitSeparator();
		ds.digitseparationandprinting(number);
	}

}

class DigitSeparator {
//	int num;

	void digitseparationandprinting(int num) {
		int digit1 = num / 10000;
		int digit2 = (num / 1000) % 10;
		int digit3 = (num / 100) % 10;
		int digit4 = (num / 10) % 10;
		int digit5 = num % 10;
		System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
	}
}
