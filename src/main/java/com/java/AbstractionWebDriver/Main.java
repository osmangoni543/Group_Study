package com.java.AbstractionWebDriver;

public class Main {

	public static void main(String[] args) {
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get();
		driver1.findElementBy();
		driver1.quit();
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.get();
		driver2.findElementBy();
		driver2.quit();
		
		WebDriver driver3 = new EdgeDriver();
		driver3.get();
		driver3.findElementBy();
		driver3.quit();

	}

}
