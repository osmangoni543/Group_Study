package com.automation.day2.SelectDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Registration {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Johndoe876@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("Johndoe876@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selenium@123");
		
		//May 09 1965
		
		//Select Dropdown
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("May");
		
		Thread.sleep(2000);
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("9");
		
		Thread.sleep(2000);
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1965");

	}

}
