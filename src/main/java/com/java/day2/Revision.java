package com.java.day2;

import java.util.Scanner;

public class Revision { // Class - classes may represent structures for organizing code and data
						// but without the full range of features.
						// A class is a blueprint or template for creating objects or instances
						// that share common properties and behaviors.

	// Primitive Data types- int, short, long, double, boolean, char, float, byte

	// Non-primitive data types - String, Arrays, Classes, Structures, etc

	// Concatenation

	// Operators

	public static void main(String[] args) { // Main method- Execution unit

		// Write a program to swap the values of a and b.

//		int a;
//		a = 5;

		int a = 5;// Initialization
		int b = 11;
		int c; // Declaration

		c = b;
		b = a;
		a = c;

		System.out.println("a = " + a + " " + "b = " + b);

		// WAP to convert from Farenheit to Celcius
		// C=(F−32)× (9/5)

		int farenheit = 50;
		int celcius = (farenheit - 32) * (9 / 5);

		System.out.println("The conversion is: " + celcius);

		// WAP to convert from Celcius to Farenheit
		// F=C × (5/9) +32

		int cel = 100;
		int fer = cel * (5 / 9) + 32;
		System.out.println("The conversion is: " + fer);

		// https://www.simplilearn.com/best-java-programs-article

		// WAP to check if a number is even or odd

		System.out.println("Enter your number to check: ");

		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();

		if (i % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		
		scanner.close();


		// WAP to find the largest of 3 numbers
		// WAP to find the smallest of 3 numbers

		int x = 50;
		int y = 70;
		int z = 59;

		if (x > y && x > z) {
			System.out.println("x is the largest");
		} else if (y > x && y > z) {
			System.out.println("y is the largest");
		} else {
			System.out.println("z is the largest");

		}

		if (x < y && x < z) {
			System.out.println("x is the smallest");
		} else if (y < x && y < z) {
			System.out.println("y is the smallest");
		} else {
			System.out.println("z is the smallest");

		}
		
		// WAP to print the first 10 prime numbers
		// WAP to check if a word is a Palindrome.
		// WAP to print a Fibonacci series.
		
		
		
		
		
		
		
		

	}

	public static void main() {

	}

	// Methods are blocks of code that perform specific tasks and are defined within
	// classes.
	// They encapsulate functionality, allowing for code reuse, modularity, and
	// abstraction.
	// Methods typically have a name, parameters (optional), and a return type
	// (optional).
	// They can be invoked by other parts of the program to execute their defined
	// functionality.

	public void method1() {

	}

}
