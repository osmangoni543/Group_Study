package com.java.day7;

public class Declaration_Initialization_Global_Local {
	
	//declaration - int i
	//initialization - i = 10;
	//declaration and initialization - int i = 10;
	//Global level - class level
	//Local level - method level
	
	public static int i;
	public static int j;

	public static void main(String[] args) {

		addition();
		substraction();

	}
	
	public static void addition() {
		i= 100;
		j= 20;
		System.out.println(i+j);
	}
	
	public static void substraction() {
		i=50;
		j=10;
		System.out.println(i-j);
	}

}
