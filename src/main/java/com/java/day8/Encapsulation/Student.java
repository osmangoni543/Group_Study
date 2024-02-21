package com.java.day8.Encapsulation;


//Syntax of methods-
// access modifier          static/non-static          return-type       methodname(){}

public class Student {

	private String name; //null
	private int id;      //0
	private int grade;   //0


//	public void setData(String n, int i, int g) { // setters
//		name = n;
//		id = i;
//		grade = g;
//	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setId(int i) {
		id = i;
	}

	public void setGrade(int g) {
		grade = g;
	}


	public String getName() {     // getters       
		return name;
	}

	public int getId() {       // getters
		return id;
	}

	public int getGrade() {    // getters
		return grade;
	}

}
