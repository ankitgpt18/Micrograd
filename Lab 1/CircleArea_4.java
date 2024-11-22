package com.lab1;

import java.util.Scanner;

public class CircleArea_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius");
		double r = in.nextDouble();
		Circle c = new Circle();
		System.out.println("diameter " + c.Diameter(r));
		System.out.println("circumference " + c.Circumference(r));
		System.out.println("area " + c.Area(r));
	}
}

class Circle {
	double radius;

	double Circumference(double radius) {
		return 2 * Math.PI * radius;
	}

	double Area(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	double Diameter(double radius) {
		return 2 * radius;
	}
}
