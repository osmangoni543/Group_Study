package com.java.day2;

public class Operators_in_Java {

	public static void main(String[] args) {
		// Arithmetic Operators
				// + - * / %   ++   --
				
				//Assignment Operators
				//int i = 5;
				// =, +=, -=, *=, /=, %=, &=, |=, >>=,<<=

				//x+=3 this means x = x+3;

				//Comparison Operators 
				// ==   !=   >   <   >=    <=

				//Logical Operators
				//&& - Logical And
				//|| - Logical Or
				// ! - Logical not
			

				//Bitwise Operators
		
		int i = 5;
		int j= 2;
		int k = i+j;
		
		
		System.out.println(k + " " + i + " " + j);
		
		int a = 5;
		a+=2;
		
		System.out.println(a);
		
		int b = 8;
		int c = 3;
		int d = b%c;
		
		System.out.println(d);
		
		int e = 7;
		e++;
		System.out.println(e); //8
		e--;
		System.out.println(e); //7
		
		e+=3;
		System.out.println(e); //10
		
		//Comparison Operators 
		// == != >   < >=  <=
		
		System.out.println(5!=5);
		
		int x = 2;
		int y = 5;
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		
		if(x==y || s1==s2) {
			System.out.println("The statement is correct.");
		} 
		else {
			System.out.println("The statement is incorrect");
		}
		


	}

}
