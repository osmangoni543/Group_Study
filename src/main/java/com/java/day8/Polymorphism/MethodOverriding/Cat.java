package com.java.day8.Polymorphism.MethodOverriding;

public class Cat extends Animal{
	
	public void Details(String t, String b, String C, int A, int H){
		System.out.println("CatName CatBreed CatColor CatAge CatHeight");
		System.out.println(t + b + C + A + H);
	}

}
