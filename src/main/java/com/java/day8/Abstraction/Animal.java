package com.java.day8.Abstraction;

public abstract class Animal { //Abstract Class
	
	// Abstract classes can hold both implemented and unimplemented methods
	
	
	public abstract void sound(); //Un-implimented methods/ Abstract methods
	
	public abstract void chase();
	
	public abstract void eat();
	
	public void run() {
		System.out.println("Starts running"); //Implemented methods/ Concrete Methods
	}

}
