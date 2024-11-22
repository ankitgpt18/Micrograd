package com.lab7;

class Course {

	private String ID;
	private String description;
	private int duration; // in month
	private double fees;

	public Course(String ID, String description, int duration, double fees) {
		this.ID = ID;
		this.description = description;
		this.duration = duration;
		this.fees = fees;
	}

	public void GetData() {
		System.out.println("Course ID: " + ID);
		System.out.println("Description: " + description);
		System.out.println("Duration (months): " + duration);
		System.out.println("Fees: $" + fees);
		System.out.println("-----------------------------");
	}
}

public class CourseInfo {
	public static void main(String[] args) {

		Course[] courses = new Course[5];

		courses[0] = new Course("OP12", "OOPs", 3, 150.0);
		courses[1] = new Course("PA25", "PAI", 4, 200.0);
		courses[2] = new Course("DS35", "DSA", 2, 100.0);
		courses[3] = new Course("DE44", "DE", 6, 250.0);
		courses[4] = new Course("LS55", "LSCM", 5, 180.0);

		for (Course course : courses) {
			course.GetData();
		}
	}
}
