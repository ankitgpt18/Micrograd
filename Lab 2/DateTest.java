package com.lab2;

public class DateTest {
	public static void main(String[] args) {
		Date dt = new Date(30, 9, 2004);

		System.out.println("The day is " + dt.getDay());
		System.out.println("The month is " + dt.getMonth());
		System.out.println("The year is " + dt.getSaal());
		dt.DisplayDate(30, 9, 2004);
	}
}

class Date {
	private int month;
	private int day;
	private int saal;

	Date(int day, int month, int saal) {
		this.day = day;
		this.month = month;
		this.saal = saal;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getSaal() {
		return saal;
	}

	public void setSaal(int saal) {
		this.saal = saal;
	}

	public static void DisplayDate(int day, int month, int saal) {
		System.out.println("The date is :");
		System.out.println(day + "/" + month + "/" + saal);
	}
}
