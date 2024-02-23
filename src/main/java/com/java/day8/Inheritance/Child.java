package com.java.day8.Inheritance;

// SuperClass/ Parent Class
// SubClass/ Child Class
// Multi Level Inheritance is allowed
// Multiple inheritance is not allowed


public class Child extends Parent{
	
	String cName; //instance variables
	int cAge;
	
	public void cAddress() {
		System.out.println("Brooklyn");
	}
	
	public void cPhoneNumber() {
		System.out.println("7418529637");
	}
	
	public Child(String cName, int cAge) {
		this.cName = cName;
		this.cAge = cAge;
	}

}
