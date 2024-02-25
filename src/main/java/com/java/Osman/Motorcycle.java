package com.java.Osman;

public class Motorcycle extends AbstractVehicle implements Vehicle{
	
	//Concrete class representing a Motorcycle
	
	Motorcycle(String name) {
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
	     System.out.println("Revving the engine of " + name);
	 }

}
