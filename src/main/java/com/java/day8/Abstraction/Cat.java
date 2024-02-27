package com.java.day8.Abstraction;

public class Cat extends Abstraction_Concepts implements Animal_Interface, Living_Beings{ //Class --> extends,  Interface --> implements
	
	

	@Override
	public void sound() {
		System.out.println("Meow");
		
	}

	@Override
	public void chase() {
		System.out.println("Chases Mouse");
		
	}

	@Override
	public void eat() {
		System.out.println("Cat Food");
		
	}

	@Override
	public void breathe() {
		System.out.println("Cat is breathing.");
		
	}
	


}
