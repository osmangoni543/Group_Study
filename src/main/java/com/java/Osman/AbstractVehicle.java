package com.java.Osman;

public abstract class AbstractVehicle implements Vehicle{
	
	//Abstract class representing a generic vehicle
	
	 String name;

	 AbstractVehicle(String name) {
	     this.name = name;
	 }
	 
	    // Implementing interface methods
	    @Override
	    public void start() {
	        System.out.println(name + " starting...");
	    }

	    @Override
	    public void stop() {
	        System.out.println(name + " stopping...");
	    }

	   abstract void honk(); // Abstract method to be implemented by subclasses

}
