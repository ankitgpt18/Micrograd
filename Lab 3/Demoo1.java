package com.lab3;

public class Demoo1 {
	public static void main(String[] args) {
		Cone cn = new Cone(3.8, 5.4);
		Sphere sp = new Sphere(5.9);
		Cylinder cy = new Cylinder(2.5, 7.4);
		System.out.println("Cone:");

		cn.calcArea();
		cn.dispArea();
		cn.calcVolume();
		cn.dispVolume();
		System.out.println("Sphere:");
		sp.calcArea();
		sp.dispArea();
		sp.calcVolume();
		sp.dispVolume();
		System.out.println("Cylinder:");
		cy.calcArea();
		cy.dispArea();
		cy.calcVolume();
		cy.dispVolume();

	}
}

abstract class Figure {
	public double pi = 3.141;

	public abstract void calcArea();

	public abstract void dispArea();

	public abstract void calcVolume();

	public abstract void dispVolume();
}

class Cone extends Figure {
	private double radius;
	private double height;

	private double area;
	private double volume;

	Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;

	}

	public void calcArea() {
		area = pi * (radius * radius + radius * Math.sqrt(radius * radius + height * height));
	}

	public void dispArea() {
		System.out.println("The area of the Cone is " + area);
	}

	public void calcVolume() {
		volume = pi * radius * radius * height / 3;
	}

	public void dispVolume() {
		System.out.println("The volume of the cone is " + volume);
	}

}

class Sphere extends Figure {
	private double radius;

	private double area;
	private double volume;

	Sphere(double radius) {
		this.radius = radius;

	}

	public void calcArea() {
		area = 4 * pi * radius * radius;
	}

	public void dispArea() {
		System.out.println("The area of the Sphere is " + area);
	}

	public void calcVolume() {
		volume = 4 * pi * radius * radius * radius / 3;
	}

	public void dispVolume() {
		System.out.println("The volume of the Sphere is " + volume);
	}
}

class Cylinder extends Figure {
	private double radius;
	private double height;

	private double area;
	private double volume;

	Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;

	}

	public void calcArea() {
		area = 2 * pi * radius * (radius + height);
	}

	public void dispArea() {
		System.out.println("The area of the Cylinder is " + area);
	}

	public void calcVolume() {
		volume = pi * radius * radius * height;
	}

	public void dispVolume() {
		System.out.println("The volume of the Cylinder is " + volume);
	}
}
