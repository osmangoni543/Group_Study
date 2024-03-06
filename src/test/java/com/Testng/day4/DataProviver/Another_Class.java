package com.Testng.day4.DataProviver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Another_Class {
	
	public WebDriver driver;
	
	@Test(dataProvider = "getTNLoginData", dataProviderClass = DataProvider_TN.class)
	public void anotherLogin(String username, String password) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	

}
