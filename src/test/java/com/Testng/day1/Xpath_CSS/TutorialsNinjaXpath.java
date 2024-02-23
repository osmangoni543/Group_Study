package com.Testng.day1.Xpath_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaXpath {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']/descendant ::span[text()='My Account']")).click();
	}
	
	@Test
	public void validLogin() {
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();	
	}
	
	@Test
	public void validRegistration() {
		driver.findElement(By.xpath("//ul[@class = 'dropdown-menu dropdown-menu-right']/li[1]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Panda");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("adhbscjkb.kvkj@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("4632256332");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name ='newsletter' and @value ='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

} 
