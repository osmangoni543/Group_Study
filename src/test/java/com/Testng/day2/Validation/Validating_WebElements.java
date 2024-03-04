package com.Testng.day2.Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validating_WebElements {
	
	//We use these three conditions to validate a Web Element
	// 1) .isDisplayed() - To check if the WebElement is displayed.
	// 2) .isEnabled() - To check if the WebElement is enabled.
	
	//Apple Cinema 30"
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
	}
	
	@Test
	public void validatingAppleCinemaLink() {
		WebElement appleCinemaLink = driver.findElement(By.partialLinkText("Apple Cinema"));
		if(appleCinemaLink.isDisplayed() && appleCinemaLink.isEnabled()) {
			System.out.println("The link is displayed and enabled");
		} else {
			System.out.println("The link is either not diplayed or disabled");
		}
		
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
