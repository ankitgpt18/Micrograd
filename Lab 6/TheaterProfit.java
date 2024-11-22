package com.lab6;

import java.util.Scanner;

//An old-style movie theater has a simple profit program. Each customer pays $5
//per ticket. Every performance costs the theater $20, plus $.50 per attendee.Develop
//the program calculate TotalProfit that consumes the number of attendees (of a show)
//and calculates how much income the show earns.

public class TheaterProfit {

	// Method for profit calc
	public static double calculateTotalProfit(int attendees) {

		double ticketPrice = 5.0;

		double fixedCost = 20.0;

		double costPerAttendee = 0.50;

		double income = attendees * ticketPrice;

		double totalCost = fixedCost + (attendees * costPerAttendee);

		double profit = income - totalCost;

		return profit;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter total number tickets:");
		int attendees = scanner.nextInt();

		double totalProfit = calculateTotalProfit(attendees);

		System.out.println("Total profit: " + totalProfit);

		scanner.close();
	}
}
