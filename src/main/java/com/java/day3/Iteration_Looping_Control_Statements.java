package com.java.day3;

public class Iteration_Looping_Control_Statements {

	public static void main(String[] args) {
		// while loop
		// while(logic){codeblock}
		// while loop is a control flow statement which is used when the boolean condition needs lot of repetition
		// while loop is also known as repeating if statement
		// if the number of iteration is not fixed, it is recommended to use while loop.
		
		//initialization
		//condition
		//increment or decrement or upgradation or degradation
		
		int i = 1; //1
		
		while(i<=20) 
		{
		System.out.print(i +" "); 
		i++; 
		}
		
		System.out.println();
	
		System.out.println("*********************************************");
		
	//// WAP to print first 25 even numbers.
		
		int j = 2;
		int k= 1;  
		
		while(k<=25) 
		{
		System.out.print(k + " - ");
		System.out.println(j + " "); 
		j+=2; //4
		k++; //2
		}
		
	System.out.println();
	System.out.println("***************************************************************");
		//WAP to print the first 23 multiplication of 13
		
		int m = 13;
		int n = 1; //counter
		
		while(n<=23)
		{
		System.out.println(m*n); 
		n++;
		}
		
		
		
		
		
		
		
		
		
	}
}














