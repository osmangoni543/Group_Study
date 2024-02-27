package com.java.day8.Abstraction;

public class Dog implements Animal_Interface, Living_Beings{

	@Override
	public void sound() {
		System.out.println("Barks");
		
	}

	@Override
	public void chase() {
		System.out.println("Chases Cat");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog Food");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breathing.");
		
	}
	


}
