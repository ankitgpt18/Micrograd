package com.lab2;

import java.util.Scanner;

//doubt

class ParkingCharges {
	private static final double MINIMUM_FEE = 2.00;
	private static final double ADDITIONAL_FEE = 0.50;
	private static final double MAXIMUM_FEE = 10.00;
	private static final int FREE_HOURS = 3;

	public static double calculateCharge(int hoursParked) {
		if (hoursParked <= FREE_HOURS) {
			return MINIMUM_FEE;
		} else {
			double additionalCharge = (hoursParked - FREE_HOURS) * ADDITIONAL_FEE;
			double totalCharge = MINIMUM_FEE + additionalCharge;
			return Math.min(totalCharge, MAXIMUM_FEE);
		}
	}
}

public class ParkingChargeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of hours parked: ");
		int hoursParked = scanner.nextInt();

		double charge = ParkingCharges.calculateCharge(hoursParked);

		System.out.println("Parking charges for " + hoursParked + " hours: " + charge);
	}
}
