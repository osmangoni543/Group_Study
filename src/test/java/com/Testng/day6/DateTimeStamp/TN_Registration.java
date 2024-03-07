package com.Testng.day6.DateTimeStamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.DateTimeStamp.Utilities;

public class TN_Registration {
	public WebDriver driver;

	@BeforeMethod
	public void launchApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.cssSelector("i.fa.fa-user + span.hidden-xs.hidden-sm.hidden-md")).click();

	}

	@Test(invocationCount = 5)
	public void tnRegistration() {

		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right>li:nth-child(1)>a")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Panda");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(Utilities.generateEmailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("32145676544");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Panda@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Panda@123");
		driver.findElement(By.cssSelector("label.radio-inline>input[value='1']")).click();
		driver.findElement(By.cssSelector("a.agree+input[name = agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
