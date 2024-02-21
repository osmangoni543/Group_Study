package com.java.Practice;

//Create a class which has the main method.
//Inside this class create public, private, protected, default, static and non-static method
//Static methods will be called directly
//Non static methods will be called by the help of Object reference
//Make sure all the methods have a proper return type.

//Create another class
//In this class make 3 non-static and 2 static and dont create main method in this class.
//Now call all these methods in the main method you created before.

public class Today_Test {

	public static void main(String[] args) {

		method1();
		method2();
		method3();
		method4();
		method5();
		// public void method6() {
		// System.out.println("This is a public NON-STATIC void method1 in Today_Test");

		Today_Test obj1 = new Today_Test();
		obj1.method6();

		Separate_Class_.method7();
		Separate_Class_.method8();
		Separate_Class_.method9();
		
		Separate_Class_ obj4= new Separate_Class_();//Remember the end parenthesis
		obj4.method10();
		obj4.method11();

	}

	public static void method1() {
		System.out.println("This is a public static method1 in Today_Test");
	}

	private static void method2() {
		System.out.println("This is a private static method2 in Today_Test");
	}

	protected static void method3() {
		System.out.println("This is a protected static method3 in Today_Test");
	}

	static void method4() {
		System.out.println("This is a default static method4 in Today_Test");
	}

	public static void method5() {
		System.out.println("This is a public static void method5 in Today_Test");
	}

	public void method6() {
		System.out.println("This is a public NON-STATIC void method6 in Today_Test");
	}

}
