package com.java.day3;

public class Selection_Conditional_Control_Statement {

	public static void main(String[] args) {
		
		// if
		//Syntax:
		
		//if(condition)
		//{
		//};
		
		int a = 5670;
		int b = 9560;
		int c = a*b; 
		
		if(c<=10000) {
			System.out.println("The condition is true.");
		}
		
		String s1 = "Animal";
		String s2 = "Cat";
		String s3 = "Animal";
		
		if(s1==s3) {
			System.out.println("Rose is an animal");
		}
		
		//Find the largest of 3 numbers
		
		int i= 10;
		int j= 20;
		int k= 30;
		
		if(i>j && i<k) {
			System.out.println("I is the largest number.");
		} else if(j>i && j>k) {
			System.out.println("J is the largest number.");
		} else {
			System.out.println("K is the largest.");
		}	
	}

}
