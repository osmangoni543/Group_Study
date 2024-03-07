package com.Testng.day3.Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	//Assert.assertTrue(condition) - True - It will pass
	//Assert.assertFalse(condition) - True - It will fail
	//Assert.assertEquals(condition) - Equal - It will pass
	//Assert.assertNotEquals(condition) - Equal - It will Fail
	//Assert.fail()
	//Priority
	//dependsOnMethods
	//invocationCount = 3
	//enabled = false
	//alwaysRun = true
    //alwaysRun = false

public class Assertion {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
	}
	
	@Test(priority=1, enabled=false, alwaysRun = true )
	public void positiveLogin() throws Exception {
	driver.findElement(By.id("input-email")).sendKeys("Seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Thread.sleep(3000);
	WebElement edit_account = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
	Assert.assertTrue(edit_account.isDisplayed() && edit_account.isEnabled());
	Assert.fail("Deliberately Failing");
	
	}
	
	@Test(priority=2, dependsOnMethods = "positiveLogin", alwaysRun = true)
	public void validEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement edit_account = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		Assert.assertTrue(edit_account.isDisplayed() && edit_account.isEnabled());
	}
	
	@Test(priority=3, dependsOnMethods = "positiveLogin")
	public void invalidEmailValidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Seleniumpandagmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement edit_account = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		Assert.assertTrue(edit_account.isDisplayed() && edit_account.isEnabled());
	}
	
	@Test(priority=4, dependsOnMethods = "positiveLogin")
	public void invalidEmailInvalidPassword() {
		driver.findElement(By.id("input-email")).sendKeys("Seleniumpandagmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement edit_account = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		Assert.assertTrue(edit_account.isDisplayed() && edit_account.isEnabled());
	}
	
	@Test(priority=5, dependsOnMethods = "positiveLogin")
	public void noCredentials() {
		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		WebElement edit_account = driver.findElement(By.xpath("//a[text() = 'Edit your account information']"));
		Assert.assertTrue(edit_account.isDisplayed() && edit_account.isEnabled());
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
