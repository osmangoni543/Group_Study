package com.java.Scanner;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   //ctrl+shift+o
		
		System.out.println("Please enter your 1st number:");
		int i = sc.nextInt();
		System.out.println("Please ebter your 2nd number: ");
		int j = sc.nextInt();
		
		System.out.println(i+j);
		
		
		
		System.out.println("Enter you name: ");
		String s = sc.next();
		
		System.out.println("Your name is: " + s);
		
		sc.close();

	}

}
