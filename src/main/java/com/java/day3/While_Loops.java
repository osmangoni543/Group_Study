package com.java.day3;

public class While_Loops {

	public static void main(String[] args) {

		int i = 5;

		while (i <= 10) {
			System.out.println("It is less than 10");
			break;
		}

		// WAP to print first 10 natural numbers using while loop.

		int j = 1;

		while (j <= 10) {
			System.out.println(j + " ");
			j = j + 1;
		}

		// WAP to print first 25 even numbers.

//		int k = 2;

//		while (k <= 50) {                  //We know the value of the last output
//			System.out.println(k + " ");
//		    k=k+2;
//		}
		int k = 2;
		for (int l = 0; l < 25; l++) {
			System.out.println(k + " ");
			k = k + 2;
		}

		for (int m = 0; m < 25; m=m+5) {
			System.out.println("I love plants");

		}

		// WAP to print 20 numbers in reverse order in decrement of 5 starting from 100.
		
		int n= 100;
		
		while (n>=0) {
		System.out.println(n);
		n = n-5;
		}
			
			
	}

}
