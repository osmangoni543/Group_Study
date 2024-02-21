package com.java.day3;

public class For_Loops {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int j = 10; j>=1; j--) {
			System.out.print(j + " ");	
		}
		
		System.out.println();
		
		for(int k = 100; k>=1; k--) {
			System.out.print(k + " ");
		}
		
		System.out.println();
		
		for(int n = 200; n>=100; n--) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		//// Write a program to print from 500 to 0 in decrement of 25
		
		for (int p=500; p>=0; p-=25) {
			System.out.print(p + " ");
		}
		
		System.out.println();
		
		for(int q=0; q<=500; q+=25) {
			System.out.print(q+ " ");
		}
		System.out.println();
		
		// WAP to print the sum of 100 to 1 using for loop
		// 100+99+98...........+1.
		
		int sum = 0;                     
		
		for(int r = 100; r>=1; r-- ) {   
			sum = sum+r;                 
			System.out.print(sum + " "); 
		}	
	}

}
