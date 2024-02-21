package com.java.day7;

public class Students {
	
	//Class is a blueprint of an object.
	//Object is an intance of a class.
	// Methods are independent units of execution.
	// Constructors are used to initialize objects.
	// Methods are explicitly called.
	// Constructors are invoked automatically when an object is created.
	// Objects has properties and actions(method)
	
	int id;       //0   
	String name;  //null 
	int grade;    //0 
	
	public Students() {	
	}
	
	public Students(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public Students(String name, int id, int grade) {
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		
		Students student1 = new Students();
		System.out.println(student1.id + " " + student1.name + " " + student1.grade);
		student1.id = 1;
		student1.name = "Tom";
		student1.grade = 5;
		System.out.println(student1.id + " " + student1.name + " " + student1.grade);
		
		Students student2 = new Students(2, "Harry", 5);
		System.out.println(student2.id + " " + student2.name + " " + student2.grade);
		
		Students student3 = new Students("John", 3, 5);
		System.out.println(student3.id + " " + student3.name + " " + student3.grade);
		student3.read();
		
	}
	
	public static void read() {
		System.out.println("Student is reading.");
	}


}
