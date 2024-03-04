package com.java.day8.AbstractionAbstractClassRevision;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.stop();
		car.fuel_up();
		
		Ship ship = new Ship();
		ship.start();
		ship.stop();
		ship.fuel_up();
		
		Jet jet = new Jet();
		jet.start();
		jet.stop();
		jet.fuel_up();
		
	}

}
