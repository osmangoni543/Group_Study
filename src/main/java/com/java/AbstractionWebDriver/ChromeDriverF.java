package com.java.AbstractionWebDriver;

public class ChromeDriverF implements WebDriverF{

	@Override
	public void get() {
		System.out.println("Get through chrome browser.");
		
	}

	@Override
	public void findElementBy() {
		System.out.println("Find through chrome browser.");
		
	}

	@Override
	public void quit() {
		System.out.println("Quit Chrome browser");
		
	}

}
