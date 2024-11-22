package com.lab5;

class Fruit {
	private String name;
	private boolean isSingleFruit;
	private double price;

	// Constructor
	public Fruit(String name, boolean isSingleFruit, double price) {
		this.name = name;
		this.isSingleFruit = isSingleFruit;
		this.price = price;
	}

	public void displayFruit() {
		String type = isSingleFruit ? "Single Fruit" : "Bunch Fruit";
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		System.out.println("Price: ₹" + price);
	}
}

public class Fruitss {
	public static void main(String[] args) {

		Fruit apple = new Fruit("Apple", true, 30.0);
		Fruit banana = new Fruit("Banana", false, 50.0);

		System.out.println("Fruit 1:");
		apple.displayFruit();

		System.out.println("\nFruit 2:");
		banana.displayFruit();
	}
}
