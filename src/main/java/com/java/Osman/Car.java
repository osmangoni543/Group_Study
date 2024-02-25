package com.java.Osman;

public class Car extends AbstractVehicle implements Vehicle{
	
	//Concrete class representing a Car

	public Car(String name) {
	     super(name);
	}   
	     @Override
	     public void start() {
	         System.out.println(name + " starting...");
	     }

	     @Override
	     public void stop() {
	         System.out.println(name + " stopping...");
	     }

	     @Override
	     void honk() {
	         System.out.println("Honking the horn of " + name);
	     }

}
