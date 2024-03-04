package com.java.AbstractionWebDriver;

public class FirefoxDriver implements WebDriver{

	@Override
	public void get() {
		System.out.println("Get through FF browser.");
		
	}

	@Override
	public void findElementBy() {
		System.out.println("Find through FF browser.");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit FF browser");
		
	}

}
