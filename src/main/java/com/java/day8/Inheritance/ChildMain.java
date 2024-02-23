package com.java.day8.Inheritance;

public class ChildMain {

	public static void main(String[] args) {
		
	  //Class Reference   Constructor  
		Child child = new Child("Kevin", 15);
		
		System.out.println(child.cName);
		System.out.println(child.cAge);
		child.cAddress();
		child.cPhoneNumber();

		child.pName = "John";
		child.pAge = 40;
		System.out.println(child.pName);
		System.out.println(child.pAge);
		child.pAddress();
		child.pPhoneNumber();
		
		child.gpName = "Robert";
		child.gpAge = 70;
		System.out.println(child.gpName);
		System.out.println(child.gpAge);
		child.gpAddress();
		child.gpPhoneNumber();
	
//		Parent parent = new Parent();
//		parent.pName = "John";
				
//		Child child2 = new Child();
//		child2.cName = "Jason";
//		child2.cAge = 15;
//		

	}

}
