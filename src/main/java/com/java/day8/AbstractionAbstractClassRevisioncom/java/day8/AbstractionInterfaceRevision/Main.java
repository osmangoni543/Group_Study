package com.java.day8.AbstractionAbstractClassRevisioncom.java.day8.AbstractionInterfaceRevision;

public class Main {
	
	public static void main(String[] args) {
		
		//Interface
		//WebDriver driver = new ChromeDriver();
		
		Vehicle car = new Car();
		car.start();
		car.stop();
		System.out.println(car.name);
		
		Vehicle ship = new Ship();
		ship.start();
		ship.stop();
		
		Vehicle jet = new Jet();
		jet.start();
		jet.stop();
		
		
		
	}

}
