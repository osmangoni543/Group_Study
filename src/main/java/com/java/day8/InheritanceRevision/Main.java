package com.java.day8.InheritanceRevision;

public class Main {

	public static void main(String[] args) {
		
		Calculator_V1 calc = new Calculator_V1();
		calc.addition(8, 2);
		calc.substraction(12,10);
		
		Calculator_V2 calc2 = new Calculator_V2();
		calc2.addition(8, 2);
		calc2.substraction(12, 10);
		calc2.multiplication(2, 5);
		calc2.division(20, 10);
		
		Calculator_V3 calc3 = new Calculator_V3();
		calc3.addition(0, 0);
		calc3.substraction(0, 0);
		calc3.multiplication(2, 5);
		calc3.division(20, 10);
		calc3.percentage(100, 40);
		
		
	}

}
