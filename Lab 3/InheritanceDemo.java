package com.lab3;

public class InheritanceDemo {
	public static void main(String[] args) {
		Cone cone = new Cone(5, 10, 7);
		cone.calcArea();
		cone.calcVolume();
		cone.dispArea();
		cone.dispVolume();
	}

}

class Figure {
	protected double r;
	protected double a;
	protected double v;

	// Constructor
	public Figure(double r, double a, double v) {
		this.r = r;
		this.a = a;
		this.v = v;
	}

	public void dispArea() {
		System.out.println("Area: " + a);
	}

	public void dispVolume() {
		System.out.println("Volume is :" + v);
	}
}

class Cone extends Figure {
	private double h;
	private double s;

	public Cone(double r, double h, double s) {
		super(r, 0, 0);
		this.h = h;
		this.s = s;
	}

	public void calcArea() {
		a = Math.PI * (r * s + r * r);
		System.out.println("area of cone is " + a);
	}

	public void calcVolume() {
		v = Math.PI * h * r * r / 3;
		System.out.println("volume of cone is " + v);
	}
}
