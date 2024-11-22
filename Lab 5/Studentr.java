package com.lab5;

public class Studentr {

	private String name;

	public void inputName(String name) {
		this.name = name;
	}

	public String getName() {// to get private ko lene ke liye
		return name;
	}

	public String average(int mark1, int mark2, int mark3) {
		double avg = (mark1 + mark2 + mark3) / 3.0;

		if (avg > 50) {
			return "Passed";
		} else {
			return "Failed";
		}
	}

	public static void main(String[] args) {
		Studentr student = new Studentr();
		student.inputName("Vishvendra");

		System.out.println("Student Name: " + student.getName());

		int mark1 = 63, mark2 = 76, mark3 = 41;
		System.out.println("Result: " + student.average(mark1, mark2, mark3));
	}
}
