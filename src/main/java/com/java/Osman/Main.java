package com.java.Osman;

public class Main {

		
		public static void main(String[] args) {
		     // Using interface type to create object
		     Vehicle car = new Car("Toyota");
		     car.start();
		     car.stop();

		     // Using abstract class type to create object
		     AbstractVehicle motorcycle = new Motorcycle("Harley Davidson");
		     motorcycle.start();
		     motorcycle.stop();
		     motorcycle.honk(); // Polymorphism: invoking honk() method of Motorcycle

		     // AbstractVehicle vehicle = new AbstractVehicle("Generic"); // Cannot instantiate abstract class

		     // Differences between interfaces and abstract classes:
		     // 1. Interfaces cannot have method implementations, while abstract classes can have abstract and non-abstract methods.
		     // 2. A class can implement multiple interfaces but can extend only one abstract class.
		     // 3. Abstract classes can have constructors, fields, and non-static methods, while interfaces cannot have constructors or instance variables.
		     // 4. Interfaces are generally used to define contracts, while abstract classes are used to provide a base implementation.
		 }

}
