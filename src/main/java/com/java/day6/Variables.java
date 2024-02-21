package com.java.day6;

public class Variables {
	
	// How many types of variables are there?
	//1) Class variables     (Global/Class)   static int a;
	//2) Instance Variables  (Global/Class)   int a;
	//3) Local Variable      (Local/Methods)
	
	static int a; //Class variables
	static int b; //Class variables
	
	String name;    //Instance Variables
	int age;        //Instance Variables
	String address; //Instance Variables
	
	public Variables(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static void main(String[] args) {
		Variables student1 = new Variables("John", 30, "123 Main st");
		//student1.name = "John";
		//student1.age = "30";
		//student1.address = "123 Main st";
		Variables student2 = new Variables("Jimmy", 20, "123 Glover st");

	}
	
	public static void addition() {
		a=2;
		b=5;
		System.out.println(a+b);
	}
	
	public static void substraction() {
		a=7;
		b=3;
		
		System.out.println(b-a);
	}
	


}
