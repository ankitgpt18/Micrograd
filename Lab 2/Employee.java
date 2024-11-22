package com.lab2;

public class Employee {
	public static void main(String[] args) {
		employeee rahul = new employeee("Rahul", "Sharma", 150000.0);
		System.out.println("The name of the employee is: " + rahul.getName());
		System.out.println("The last name of the employee is : " + rahul.getLastName());
		System.out.println("The slaary of the employee is " + rahul.getSalary());
		employeee kunal = new employeee("Kunal", "Kushwaha", 1600000);
		System.out.println("The name of the employee is: " + kunal.getName());
		System.out.println("The last name of the employee is : " + kunal.getLastName());
		System.out.println("The slaary of the employee is " + kunal.getSalary());
		rahul.HikedSalary(20);
		kunal.HikedSalary(10);
		System.out.println("The slaary of the employee is " + rahul.getSalary());
		System.out.println("The slaary of the employee is " + kunal.getSalary());

	}
}

class employeee {
	private String name;
	private String LastName;
	private double salary;

	employeee(String name, String LastName, double salary) {
		this.name = name;
		this.LastName = LastName;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String LastName) {
		this.LastName = LastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void HikedSalary(double percentage) {
		salary = (salary + percentage * (salary / 100));
	}
}
