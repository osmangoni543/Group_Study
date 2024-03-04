package com.java.day8.AbstractionAbstractClassRevision;

public abstract class Vehicle {
	
	public abstract void start(); //Unimplemented/Abstract method
	
	public abstract void stop();
	
	public void fuel_up() {
		System.out.println("Tank Full.");//Implemented/Concrete method
	}
	
	

}
