package com.java.Practice;

public class Employee {
	 
	String name;     //INSTANCE variables which is non-static. Properties
	int id;
	String address;
	int phone;
	
	public void work() {   //Actions
		System.out.println("Employee is working.");
	}
	
	//Constructors initializes objects.
	
	public Employee(String nName, int nId,String nAddress, int nPhone) {  
		name = nName;
		id = nId;
		address= nAddress;
		phone = nPhone;
	}
	
    public static void main(String[] args) {
		
		Employee emp1 = new Employee("John", 001, "123 Main St", 1234567890);
		System.out.println(emp1.name + emp1.id + emp1.address + emp1.phone);
		emp1.work();
		
		Employee emp2 = new Employee("Jimmy", 002, "776 Main st", 1561237895);
		System.out.println(emp2.name + emp2.id + emp2.address + emp2.phone);
		emp2.work();
		
		Employee emp3 = new Employee("kevin", 003, "456 Main st", 1558945626);
		System.out.println(emp3.name + emp3.id + emp3.address + emp3.phone);
		emp3.work();
		
	}

	
}
