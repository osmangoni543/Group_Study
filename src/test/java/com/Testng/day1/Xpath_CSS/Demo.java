package com.Testng.day1.Xpath_CSS;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("@BeforeSuite Executing first");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("@BeforeTest Executing second");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("@BeforeClass Executing third");
	}
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("@BeforeMethod Executing Fourth");
	}
	
	@Test
	public void test1() {
		System.out.println("TEST1 Executing");
	}
	
	@Test
	public void test2() {
		System.out.println("TEST2 Executing");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("@AfterMethod Executing Sixth");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("@AfterClass Executing Seventh");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("@AfterTest Executing Eighth");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("@AfterSuite Executing Ninth");
	}

}
