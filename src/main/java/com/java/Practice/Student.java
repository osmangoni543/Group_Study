package com.java.Practice;

public class Student {
	
	String name; //null
	int id; //0
	int grade; //0
	
	public Student() { //default constructor
		name= null;
		id = 0;
		grade = 0;
	}
	
	public Student(String name, int id, int grade) {  //User defined constructor
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

}
