package com.lab7;

import java.util.Scanner;

public class InterestCalc {

	public static double finalbalance(double principal, double rate, int months) {

		double years = months / 12.0;

		double interest = principal * rate * years;

		double balance = principal + interest;

		return balance;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter initial principal amount: ");
		double principal = scanner.nextDouble();

		System.out.print("Enter annual interest rate (in percentage): ");
		double rate = scanner.nextDouble() / 100; // percent to decimal

		System.out.print("Enter the number of months: ");
		int months = scanner.nextInt();

		double balance = finalbalance(principal, rate, months);

		System.out.println("total balance after " + months + " months is: " + balance);

		scanner.close();
	}
}
