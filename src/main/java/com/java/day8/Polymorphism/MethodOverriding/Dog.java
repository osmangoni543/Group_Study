package com.java.day8.Polymorphism.MethodOverriding;

public class Dog extends Animal{ //Sub Class/ Child Class
		
	public void Details(String t, String b, String C, int A, int H){
		System.out.println("DogName DogBreed DogColor DogAge DogHeight");
		System.out.println(t + b + C + A + H);
	}
}
