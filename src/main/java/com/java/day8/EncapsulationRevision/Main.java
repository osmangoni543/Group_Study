package com.java.day8.EncapsulationRevision;

public class Main {

	public static void main(String[] args) {


		House house = new House();
		house.setData("123 main st", 10, "Apartments");
//		house.setAddressData("123 main st");
//		house.setTypeData("Apartments");
//		house.setFloorsData(10);
		System.out.println(house.getAddressData());
		System.out.println(house.getTypeData());
		System.out.println(house.getFloorsData());
	}

}
