package com.Testng.day3.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertions {
	
	
	@Test
	public void loginTest() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Thread.sleep(2000);
		
		WebElement editAccount = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(editAccount.isDisplayed());
		
		
		System.out.println("This is the next step");
	}

}
