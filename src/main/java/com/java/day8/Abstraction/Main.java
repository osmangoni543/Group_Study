package com.java.day8.Abstraction;

public class Main {
	
	public static void main(String[] args) {
		
	//	WebDriver driver = new ChromeDriver(); //WebDriver = Interface
	//	ChromeDriver driver1 = new ChromeDriver();
		
	//Animal animal = new Animal();
		
		Animal_Interface cat = new Cat();
		cat.sound();
		cat.chase();
		cat.eat();
		
		Living_Beings cat1 = new Cat();
		cat1.breathe();
		
		Animal_Interface dog = new Dog();
		dog.sound();
		dog.chase();
		dog.eat();
		
		Living_Beings dog1 = new Cat();
		dog1.breathe();
	}

}
