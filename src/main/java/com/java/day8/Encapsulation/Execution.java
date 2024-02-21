package com.java.day8.Encapsulation;

public class Execution {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setData("cow", 4, "white");
		System.out.println(animal.getName() + " " + animal.getLeg() + " " + animal.getColor());
		
		Animal animal1 = new Animal();
		animal1.setData("goat", 4, "white");
		System.out.println(animal1.getName() + " " + animal1.getLeg() + " " + animal1.getColor());

	}

}
