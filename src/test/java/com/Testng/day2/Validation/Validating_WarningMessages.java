package com.Testng.day2.Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validating_WarningMessages {
	
	// We use text messages - .getText()
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test
	public void validatingLoginWarningMessage() {
		String expectedLoginWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		String actualLoginWarningMessage = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		
		if(expectedLoginWarningMessage.contains(actualLoginWarningMessage)) {
			System.out.println("The warning message is correct.");
		} else {
			System.out.println("The warning message is incorrect.");
		}
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
