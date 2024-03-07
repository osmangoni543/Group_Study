package com.Testng.day5.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BBC {
	
	// a - anchor tag
	// href - link
	
	
//	public WebDriver driver;
//	
//	@BeforeMethod
//	public void setup() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://bbc.com");	
//	}
//	
//	@Test
//	public void bbcLinks() {
//		
//		List<WebElement> links = driver.findElements(By.tagName("a")); //links = list of all links.
//		
//		System.out.println(links.size());
//		//System.out.println(links.size());
//		
//		
//		WebElement hundredthLink = links.get(99);
//		System.out.println(hundredthLink.getText());
//		System.out.println(hundredthLink.getAttribute("href"));
//		
//		//get x and y co-ordinates
//		System.out.println(hundredthLink.getLocation().x + "---->" + hundredthLink.getLocation().y);
//		
//		//Print all the links
//		for(int i = 0; i<links.size(); i++) {
//			WebElement totalLinks = links.get(i);
//			System.out.println(totalLinks.isDisplayed() + "---------------------->" + totalLinks.getText());
//		}
//		
//		
//		
//	}
//	
//	@AfterMethod
//	public void teardown() {
//		driver.quit();
//	}

}
