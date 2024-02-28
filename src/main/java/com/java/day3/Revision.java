package com.java.day3;

public class Revision {

	public static void main(String[] args) {
		

		//WAP to print first 165 odd numbers.
		
//		int m = 1;
//		int counter = 1;
//		
//		while (counter<=50) {
//			System.out.println (m);
//			m=m+2;
//			counter=counter+1;
//		}
		
		
		int z = 1;                                                 //z=1, 
		
		for (int counter=1; counter<=165; counter=counter+1) {     //c=1,
			System.out.println(z); 
			z=z+2;
		}
		
		
		
		String s1 ="Hello";
                                        //z=1, 
		
		for (int c=1; c<=5; c=c+1) {     
			System.out.println(s1); 
		}
		
		
		//Write a program to print the Fibonacci Series upto 10.
		
		int firstTerm = 0;
		int secondTerm = 1;
		int nextTerm = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(firstTerm);
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		
		//Write a program to check leap year
		
		

	}

}



