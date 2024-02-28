package com.java.day1;

public class Student {
	
	String name;
	int id;
	int age;
	


	public static void main(String[] args) {
		
		Student student = new Student(); //Constructor in invoked when an aobject is created
		
		System.out.println(student.name + student.id  + student.age);
		
	}
	
	public Student() {    // A constructor initializes the variables/properties of an object.
		name = "Empty";
		id = 1;
		age = 1;
	}
	
	
	

}
