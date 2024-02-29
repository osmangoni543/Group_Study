package com.java.day8.EncapsulationRevision;

public class House {

	// Encapsulation is when we declare the variables as private and use public
	// getters and setters in another
	// class to manipulate the objects.

	private String address;
	private int floors;
	private String type;
	
	
	public void setData(String address, int floors, String type) {
		this.address = address;
		this.floors = floors;
		this.type = type;
	}

//	public void setAddressData(String address) {
//		this.address = address;
//	}
//
//	public void setFloorsData(int floors) {
//		this.floors = floors;
//	}
//
//	public void setTypeData(String type) {
//		this.type = type;
//	}
	
	public String getAddressData() {
		return address;
	}

	public int getFloorsData() {
		return floors;
	}

	public String getTypeData() {
		return type;
	}
	
	
	

}
