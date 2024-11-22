package com.lab1;

import java.util.Scanner;

public class Math_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second integer: ");
		int num2 = scanner.nextInt();

		System.out.print("Enter third integer: ");
		int num3 = scanner.nextInt();

		int sum = num1 + num2 + num3;
		double average = sum / 3.0;
		int product = num1 * num2 * num3;
		int largest = Math.max(num1, Math.max(num2, num3));
		int smallest = Math.min(num1, Math.min(num2, num3));

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);
		System.out.println("Product: " + product);
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}
}
