package com.automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_In_Selenium {
	
	// id
	// className
	// name
	// linkText
	// partialLinkTest
	// xpath
	// cssSelector
	// tagName
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		Thread.sleep(1000);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.className("btn btn-primary")).click();
		
	}

}
