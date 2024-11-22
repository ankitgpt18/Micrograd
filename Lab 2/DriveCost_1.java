package com.lab2;

import java.util.Scanner;

//driving cost calculator
public class DriveCost_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total kilometers driven per day: ");
		double totalKm = scanner.nextDouble();

		System.out.print("Enter the cost petrol per litre: ₹");
		double costPerLitre = scanner.nextDouble();

		System.out.print("Enter the mileage ");
		double mileage = scanner.nextDouble();

		System.out.print("Enter the tolls per day: rs.");
		double tollsPerDay = scanner.nextDouble();

		// daily driving cost
		double dailyPetrolCost = (totalKm / mileage) * costPerLitre;
		double totalDailyCost = dailyPetrolCost + tollsPerDay;

		System.out.println("Your daily driving cost is: ₹" + totalDailyCost);
	}
}
