package com.lab1;

public class Square_6 {

	public static void main(String[] args) {
		SquaresCubes sac = new SquaresCubes();
		sac.table();
	}
}

class SquaresCubes {

	void table() {
		System.out.println("The table of the Cubes and Squares of numbers between 0 & 10 :");
		System.out.println("No.\tSquares\tCubes");
		for (int i = 0; i < 11; i++) {
			System.out.println(i + "\t " + i * i + "\t " + i * i * i);
		}
	}
}
