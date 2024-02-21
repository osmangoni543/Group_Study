package com.java.Practice;

public class Student_Profile {

	public static void main(String[] args) {
		
		Student student = new Student();
		System.out.println(student.name + student.id + student.grade);
		student.name = "John";
		student.id = 1;
		student.grade = 10;
		System.out.println(student.name + student.id + student.grade);
		
		Student student2 = new Student("Jimmy", 2, 10);
		System.out.println(student2.name + student2.id + student2.grade);

	}

}
