package com.Testng.day4.DataProviver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_TN {
	
	public WebDriver driver;
	
	@Test(priority = 1, dataProvider = "getTNLoginData")
	public void positiveLogin(String username, String password) throws Exception {
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
	
	@Test(priority=2, dataProvider = "getRediffLoginData")
	public void rediffLogin(String un, String pw) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.id("login1")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
	}
	
	@DataProvider
	public Object getTNLoginData() {

		
		 Object[][] data =  {{"Seleniumpanda1@gmail.com","Selenium@123"},
		                     {"Seleniumpanda2@gmail.com","Selenium@123"},
		                     {"Seleniumpanda3@gmail.com","Selenium@123"},
		                     {"Seleniumpanda4@gmail.com","Selenium@123"},
		                     {"Seleniumpanda5@gmail.com","Selenium@123"}};
		 return data;

	}
	
	@DataProvider
	public Object getRediffLoginData() {

		
		 Object[][] data =  {{"Seleniumpanda1@rediffmail.com","Selenium@123"},
		                     {"Seleniumpanda2@rediffmail.com","Selenium@123"},
		                     {"Seleniumpanda3@rediffmail.com","Selenium@123"},
		                     {"Seleniumpanda4@rediffmail.com","Selenium@123"},
		                     {"Seleniumpanda5@rediffmail.com","Selenium@123"}};
		 return data;

	}
	

}
