package com.java.day8.Polymorphism.MethodOverriding.Revision;

public class Calculator_V2 extends Calculator_V1{
	
	public void multiplication(int a, int b) {
		System.out.println(a*b);
	}
	
	public void division(int a, int b) {
		System.out.println(a/b);
	}
	
	public void substraction(int a, int b) { //method-overriding
		
		if(a>b) {
			System.out.println(a-b);
		} else{
			System.out.println(b-a);
		}
		
		
	}
}
