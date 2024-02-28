package com.java.day5;

public class Main {
	
	// Class = starts with Upper Case
	// Variable reference = lower case
	// Methods = Camel Case = thisIsMyMethod
	
	

	public static void main(String[] args) {

		addition(2, 5);

		Revision.substraction(9, 4);

		training1();
		training2();
		training3();
		Revision.training5();
		Revision.training6();

	}

	public static void training1() {
		System.out.println("This is training1");
	}

	public static void training2() {
		System.out.println("This is training2");
	}

	public static void training3() {
		System.out.println("This is training3");

	}

	public static void addition(int m, int d) {
		int x = m + d;
		System.out.println("This is addition" + " " + x);
	}

}