package com.java.day8.Inheritance;

public class CalculatorExecution {

	public static void main(String[] args) {
		
//		CalculatorV1 v1 = new CalculatorV1();
//		System.out.println(v1.add(2, 4));
//		System.out.println(v1.sub(6, 3));
//		
//		CalculatorV2 v2 = new CalculatorV2();
//		System.out.println(v2.add(2, 4));
//		System.out.println(v2.sub(6, 3));
//		System.out.println(v2.mul(2, 2));
//		System.out.println(v2.div(4, 2));
		
		CalculatorV3 v3 = new CalculatorV3();
		System.out.println(v3.add(2, 4));
		System.out.println(v3.sub(6, 3));
		System.out.println(v3.mul(2, 2));
		System.out.println(v3.div(4, 2));
		System.out.println(v3.pow(3, 7));
		
	}

}
