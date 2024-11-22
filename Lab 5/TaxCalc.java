package com.lab5;

//Utopias tax accountants always use programs that compute income taxes even
//though the tax rate is a solid, never-
//changing 15%.Define the program calculate Tax which determines the tax on
//the gross pay. Define calculate NetPay
//that determines the net pay of an employee from the number of hours worked.
//Assume an hourly rate of $12.
public class TaxCalc {

	public static void main(String[] args) {
		double hourlyRate = 12.0; // Hourly rate
		double taxRate = 0.15; // Tax rate

		int hoursWorked = 40; // Example hours worked

		double grossPay = hoursWorked * hourlyRate;

		double tax = grossPay * taxRate;

		double netPay = grossPay - tax;

		// Output results
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Tax: $" + tax);
		System.out.println("Net Pay: $" + netPay);
	}
}
