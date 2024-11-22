package com.lab6;

public class BankAcc {
	// deposit method
	public double deposit(double amount, double balance) {
		return balance + amount;
	}

	//
	public double withdraw(double amount, double balance) {
		if (balance >= amount) {
			return balance - amount;
		} else {
			System.out.println("Insufficient fund");
			return 0; //
		}
	}

	public static void main(String[] args) {

		BankAcc bank = new BankAcc();

		double balance = 1000.0;

		balance = bank.deposit(500, balance);
		System.out.println("Balance after deposit: " + balance);

		balance = bank.withdraw(300, balance);
		System.out.println("Balance after withdrawal: " + balance);

		balance = bank.withdraw(1500, balance);
		System.out.println("Balance after failed withdrawal: " + balance);
	}
}
