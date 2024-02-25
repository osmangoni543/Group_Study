package com.java.Practice;

public class Parameterization {

	public static void main(String[] args) {
		
		System.out.println(add(4,4) * sub(7,4));
		sum();
		display("John", "123 Main st");
		display("Jimmy", "543 Main st");
		

	}

	public static int add(int i, int j) {   //Parameterization
		return i+j;	
	}
	
	public static int sub(int i, int j) {
		return i-j;
	}
	
	public static void sum() {
		int a = 5;
		int b =6;
		System.out.println(a+b);
	}
	
	public static void display(String name , String address) {
		System.out.println(name + address);
	}
	
	
	
}
