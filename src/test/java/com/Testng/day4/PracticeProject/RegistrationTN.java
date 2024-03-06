package com.Testng.day4.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTN {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement logo= driver.findElement(By.id("logo"));
		Assert.assertTrue(logo.isDisplayed());
		
		driver.findElement(By.linkText("My Account")).click();	
		driver.findElement(By.linkText("Register")).click();
		//validation
		
	}

	@Test (priority=1, dataProvider = "getTNdata")

	public void TNRegistration(String fn,String ln,String email,String ph,String pw) throws InterruptedException {
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(ph);
		driver.findElement(By.id("input-password")).sendKeys(pw);
		driver.findElement(By.id("input-confirm")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@name='agree' and @value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(3000);
		String ActualRegistrationSuccessMsg = driver.findElement(By.xpath("//div[@id = 'content' and @class= 'col-sm-9']")).getText();
		String ExpectedRegistrationSuccessMsg = "Your Account Has Been Created!";
		Assert.assertTrue(ActualRegistrationSuccessMsg.contains(ExpectedRegistrationSuccessMsg));
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void TNRegnWithNoField() throws Exception {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		Thread.sleep(3000);
		String expectedPPWarning = "Warning: You must agree to the Privacy Policy!";
		String actualPPWarning= driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		Assert.assertTrue(actualPPWarning.contains(expectedPPWarning));
		
		String expectedFNwarning= "First Name must be between 1 and 32 characters!";
		String actualFNwarning= driver.findElement(By.xpath("//div[text()='First Name must be between 1 and 32 characters!']")).getText();
		Assert.assertTrue(actualFNwarning.contains(expectedFNwarning));
		Thread.sleep(3000);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
       
	@DataProvider 
	public Object getTNdata() {
		
		Object[][] data =  {{"Timothy", "Carrol", "Timothy1@gmail.com", "571-555-1212", "Timothy123"},
							{"Timothy", "Carrol", "Timothy2@gmail.com", "571-555-1212", "Timothy123"},
							{"Timothy", "Carrol", "Timothy3@gmail.com", "571-555-1212", "Timothy123"},
							{"Timothy", "Carrol", "Timothy4@gmail.com", "571-555-1212", "Timothy123"},
							{"Timothy", "Carrol", "Timothy5@gmail.com", "571-555-1212", "Timothy123"}};
		return data;
	}
		
	
	
	
	
}
