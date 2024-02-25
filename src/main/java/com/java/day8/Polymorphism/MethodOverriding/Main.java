package com.java.day8.Polymorphism.MethodOverriding;

public class Main {

	public static void main(String[] args) {
		
			Animal animal = new Animal();
			animal.Details("Pluto", "Chihuaua", "Black", 3, 1);
		
			Dog dog = new Dog();
			dog.Details("Jeffrey", "Yorkie", "Golden", 5, 1);
			
			Cat cat = new Cat();
			cat.Details("Tom", "Tabby", "Orange", 1, 1);
			
	}

}
