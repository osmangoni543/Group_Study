package com.java.day8.Polymorphism.MethodOverloading;

public class Example {

	public static void main(String[] args) {
		
		add();
		add(1);
		add(1,5);
		add(2, 4.0);
		add(2, 4.0, "Hi");
		add(4.0, "Hi", 2);
	}
	
	public static void main(int a) {
		System.out.println("This is an overloaded main method");
	}
	
	public static void main(String[] args, String[] args1) {
		System.out.println("This is an overloaded main method");
	}
	
	
	public static void add() {
		System.out.println("This is an addition method with no parameters");
	}
	
	public static void add(int i) {
		System.out.println("This is an addition method with no parameters");
	}
	
	public static void add(int i, int j) {
		System.out.println("This is an addition method with 2 parameters");
	}
	
	public static void add(int i, double j) {
		System.out.println("This is an addition method with 2 parameters with different data type.");
	}
	
	public static void add(int s, double j, String s1) {
		System.out.println("This is an addition method with 3 parameters");
	}
	public static void add(double j, String s1, int m) {
		System.out.println("This is an addition method with 3 parameters different orientation");
	}
	
	public static void add(double j, String s1, float m) {
		System.out.println("This is an addition method with 3 parameters different datatype");
	}
	

}
