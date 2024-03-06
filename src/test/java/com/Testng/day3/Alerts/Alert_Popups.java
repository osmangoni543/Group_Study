package com.Testng.day3.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alert_Popups {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input.signinbtn")).click(); //The alert pops up
        Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//alert.dismiss();
		
	}

}
