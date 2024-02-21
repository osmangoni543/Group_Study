package com.java.day3;

public class For_Loops_Inside_For_Loops {

	public static void main(String[] args) {
		
//      Write a program to print the following diagram printing one * at once:		
//		*
//		* *
//		* * *
//		* * * *
//		* * * * *
                                 
	for(int i=1 ; i<=5 ; i++) {
		for(int j=1 ; j<=i ; j++) {
			System.out.print("* ");
		}
		System.out.println();
		
	}
		
		 
		
	}

}
