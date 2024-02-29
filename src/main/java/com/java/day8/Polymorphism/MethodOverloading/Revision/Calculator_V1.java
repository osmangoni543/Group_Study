package com.java.day8.Polymorphism.MethodOverloading.Revision;

public class Calculator_V1 {
	
	//Polymorphism = many forms
	//Overloading, Overriding
	// Overloading->

	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public void addition(double a, double b) {  //Method Overloading
		System.out.println(a+b);
	}
	
	public void addition(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void addition(double a, double b, double c) {
		System.out.println(a+b+c);
	}
	
	
	
	

	public void substraction(int a, int b) {
		System.out.println(a+b);
	}

}
