package com.lab1;

import java.util.Scanner;

//basic math
public class BasicMath_1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Twointeger t = new Twointeger();

		while (true) {
			System.out.println("Enter first integer:");
			int a = inp.nextInt();
			System.out.println("Enter second integer:");
			int b = inp.nextInt();

			System.out.println("press:");
			System.out.println("1 for addition");
			System.out.println("2 for difference");
			System.out.println("3 for multiplication");
			System.out.println("4 for division");
			System.out.println("5 to exit");
			int op = inp.nextInt();

			switch (op) {
			case 1:
				System.out.println("Sum: " + t.Sum(a, b));
				break;
			case 2:
				System.out.println("Difference: " + t.Difference(a, b));
				break;
			case 3:
				System.out.println("Product: " + t.Product(a, b));
				break;
			case 4:

				if (t.Quotient(a, b) == -1.0) {
					System.out.println("Division by zero is not allowed.");
				} else {
					System.out.println("Quotient: " + t.Quotient(a, b));
				}
				break;
			case 5:
				System.out.println("Exiting the program.");

				return;
			default:
				System.out.println("Invalid operation. Please try again.");
			}
		}
	}
}

class Twointeger {
	int Sum(int x, int y) {
		return x + y;
	}

	int Difference(int x, int y) {
		return x - y;
	}

	int Product(int x, int y) {
		return x * y;
	}

	double Quotient(int x, int y) {
		if (y == 0) {
			return -1.0; // Indicating an error (division by zero)
		}
		return (double) x / y;
	}
}
