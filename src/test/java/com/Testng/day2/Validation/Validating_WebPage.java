package com.Testng.day2.Validation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Validating_WebPage {
	
	// We use Title - .getTitle()
	// We use Url   - .getCurrentUrl()
	
	
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void validatingRediffHomePage() {
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The title is correct");
		} else {
			System.out.println("The title is incorrect");
		}
		
		String expectedUrl = "https://www.rediff.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("The Url is correct");
		} else {
			System.out.println("The Url is incorrect");
		}
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
