package com.java.Practice;

public class Method_overloading {

	public static void main(String[] args) {
		abc(7,9);
		sum();

	}

	public static void abc(int i, int j) {   //Method Over-loading
		System.out.println(i + j);	
	}
	
	public static void sum() {
		int a = 5;
		int b =6;
		System.out.println(a+b);
	}
	
}
