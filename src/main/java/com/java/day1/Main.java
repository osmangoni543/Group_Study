package com.java.day1;

public class Main {

	public static void main(String[] args) {
		
	Main main = new Main();
	main.addition(7, 8);
	main.subtraction(4, 9);
	
	Revision revision = new Revision();
	revision.division(7, 2);
	revision.multiplication(34, 98);
		

	}
	
	public void addition (int s, int v) {
		int z = s + v;
		System.out.println("This is non-static addition method " + z);
	}
	
	public void subtraction (int s, int v) {
		int z = s - v;
		System.out.println("This is non-static subtraction method " + z);
	}
	
	
}
