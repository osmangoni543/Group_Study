package com.Testng.day1.Xpath_CSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinjaCSS {
	
public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("i.fa.fa-user+span.hidden-xs.hidden-sm.hidden-md")).click(); //My Account
	}
	
	@Test
	public void validLogin() throws Exception {
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-child(2)>a")).click(); //Login
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(2000);
	}
	
	
	@Test
	public void validRegistration() throws Exception {
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-child(1)>a")).click(); //Register
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("adhbscjkb.kkvkj@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("4632256332");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("div.col-sm-10>label:nth-child(1)>input")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.agree+input[name = agree]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
