package com.java.day6;

public class Concepts_Of_Classes {
	
	// Methods are independent units of execution.
	// If the method is static then it can call itself directly in the main method.
	// If the method is static then it can be called using Class name.


	public static void main(String[] args) {
		
		method1();
		method2();
		method3();
		method4();
		
		Methods_in_Seperate_Class.method5();
		Methods_in_Seperate_Class.method6();
		Methods_in_Seperate_Class.method7();
		
		
		Concepts_Of_Classes obj = new Concepts_Of_Classes();
		obj.method9();
		obj.method10();
		obj.method11();
		
		//class object = new class();
		Methods_in_Seperate_Class obj1 = new Methods_in_Seperate_Class();
		obj1.method12();
		obj1.method13();
		obj1.method14();

	}
	
	public static void method1() {
		System.out.println("This is method 1");
	}
	
	protected static void method2() {
		System.out.println("This is method 2");
	}
	
	 static void method3() {
		System.out.println("This is method 3");
	}
	
	private static void method4() {
		System.out.println("This is method 4");
	}
	
	public void method9() { //non-static methods
		System.out.println("This is method 9");
	}
	
	public void method10() { //non-static methods
		System.out.println("This is method 10");
	}
	
	public void method11() { //non-static methods
		System.out.println("This is method 11");
	}

}
