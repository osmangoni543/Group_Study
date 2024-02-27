package com.java.day8.Abstraction;

public interface Animal_Interface{
	
	//Interface is 100% abstraction
	//It holds only unimplemented methods
	
	  String category = "Animal"; // it is public static and final by default
	
      void sound(); // it is public and abstract
	
	  void chase();
	
	  void eat();

}
