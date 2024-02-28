package com.java.day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your first number: ");

		double a = scan.nextInt();

		System.out.println("Enter your second number: ");

		double b = scan.nextInt();

		System.out.println("Enter your arithmatic operator: "); //+,-,*,/

		char operator = scan.next().charAt(0);
		
		if(operator == '+') {
		  System.out.println(a+b);
		} 
		else if(operator == '-') {
			System.out.println(a-b);
		}
		else if(operator == '*') {
			System.out.println(a*b);
		}
		else if(operator == '/') {
			System.out.println(a/b);
		}
		else if(operator == '%') {
			System.out.println(a%b);
		} 
		else {
			System.out.println("Invalid Opoerator.");
		}
		
		scan.close();
	}

}
