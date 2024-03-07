package com.java.AbstractionWebDriver;

public class Main {

	public static void main(String[] args) {
		
		WebDriverF driver1 = new ChromeDriverF();
		driver1.get();
		driver1.findElementBy();
		driver1.quit();
		
		WebDriverF driver2 = new FirefoxDriverF();
		driver2.get();
		driver2.findElementBy();
		driver2.quit();
		
		WebDriverF driver3 = new EdgeDriverF();
		driver3.get();
		driver3.findElementBy();
		driver3.quit();

	}

}
