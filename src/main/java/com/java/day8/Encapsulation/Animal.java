package com.java.day8.Encapsulation;

public class Animal {

	private String name;
	private int leg;
	private String color;

	public void setData(String n, int l, String c) {

		name = n;
		leg = l;
		color = c;

	}

	public String getName() {
		return name;

	}

	public int getLeg() {
		return leg;

	}

	public String getColor() {
		return color;

	}
}
