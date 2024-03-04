package com.java.AbstractionWebDriver;

public class EdgeDriver implements WebDriver{
	
	@Override
	public void get() {
		System.out.println("Get through Edge browser.");
		
	}

	@Override
	public void findElementBy() {
		System.out.println("Find through Edge browser.");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit Edge browser");
		
	}


}
