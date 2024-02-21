package com.java.day5;

public class Methods {
	// What is a method in java?
	// Methods are independent units of excecution.
	// They will have definitive logic inside of it which under certain conditions will be used.
	// You can interchange the positions of the keywords public and static but not void.
	// Why is main method always static?
	// Any method can call any method but if necessary.
	// A private method can be used only with that specific class.
	
	// Methods are independent units of execution.
	// If the method is static then it can call itself directly in the main method.
	// If the method is static then it can be called using Class name.

	public static void main(String[] args) {
		
		Logics.addition();
		//Logics.substraction(); private methods can only be called within the same class.
		Logics.multiplication();
		Logics.division();
		main();
	}
	
	public static void main() {
		System.out.println("This is a user defined main method");
	}

	
}
