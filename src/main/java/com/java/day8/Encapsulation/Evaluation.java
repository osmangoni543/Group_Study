package com.java.day8.Encapsulation;

public class Evaluation {

	public static void main(String[] args) {
		
		Student student1 = new Student();
//		student1.setData("John", 1, 8);
		student1.setName("John");
		student1.setId(1);
		student1.setGrade(8);
		System.out.println(student1.getName()+ " " + student1.getId()+ " " +student1.getGrade());

	}

}
