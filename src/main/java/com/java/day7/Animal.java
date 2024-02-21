package com.java.day7;

//Write a program to make profiles for different animals(Cat, Dog, Cow, Duck)
//You should have the following properties - Name, ColorCode, Age.
//Make sure you can input data in any order.
//ColorCodes- 
//White -w
//Black -b
//Orange- o
//Yellow- y
//Print all the profiles.
//Print what type of sounds they make with a different method.(Meow, Bark, Moo, Quack)

public class Animal{
	// create global variable
String name; 
char color;
int age;

 public static void main(String[] args) {
	 
	 Animal animal1 = new Animal("Cat", 'w', 3);
	 System.out.println("Name: "+ animal1.name+ " | Color: " + animal1.color+ "| Age:" + animal1.age);
	 animal1.meow();
	 
	 
	 Animal animal2 = new Animal(5, 'b', "Dog");
	 System.out.println("Name: "+ animal2.name+ " | Color: " + animal2.color+ "| Age:" + animal2.age);
	 animal2.bark();
	 
	 Animal animal3 = new Animal('r',"Cow", 7 );
	 System.out.println("Name: "+ animal3.name+ " | Color: " + animal3.color+ "| Age:" + animal3.age);
	 animal3.moo();
	 
	 Animal animal4 = new Animal("Duck", 'y', 2); 
	 System.out.println("Name: "+ animal4.name+ "| Color: " + animal4.color+ "| Age:" + animal4.age);
	 
	 if(animal4.name=="Cat") {
		 meow();
	 } else if(animal4.name=="Dog") {
		 bark();
	 } else if(animal4.name=="Cow") {
		 moo();
	 }else {
		 quack();
	 }
}
 
 public static void bark() {
	 System.out.println("Bark");
 }
 
 public static void meow() {
	 System.out.println("Meow");
 }
 
 public static void moo() {
	 System.out.println("Moo");
 }
 
 public static void quack() {
	 System.out.println("Quack");
 }

 public Animal(String name, char color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Animal(int age, char color, String name) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public Animal(char color, String name, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

}
