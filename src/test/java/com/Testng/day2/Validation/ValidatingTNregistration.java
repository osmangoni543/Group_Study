package com.Testng.day2.Validation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingTNregistration {

	public WebDriver driver;

	// Go to TN and validate the homepage
	// Go to my account and registration and validate the continue button
	// Click on continue button and validate the warning messagesValidate
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

	@Test
	public void VaidationTN() {
		String expectedURL = "https://tutorialsninja.com/demo/";
		String actualURL = driver.getCurrentUrl();
		String expectedTitle = "Your Store";
		String actualTitle = driver.getTitle();

		if (expectedURL.equals(actualURL) && expectedTitle.equals(actualTitle)) {
			System.out.println("The URL and title are correct");
		} else {
			System.out.println("The URL and title are incorrect");
		}
	}

	@Test
	public void regnPageValidation() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();

		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));

		if (continueButton.isDisplayed() && continueButton.isEnabled()) {
			System.out.println("The button is enabled and displayed");
		} else {
			System.out.println("The button is not enabled or displayed");
		}

	}
	
	@Test
	
	public void validatingWarningMessage() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	//Warning: You must agree to the Privacy Policy!	
	
	String expectedPrivacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
	String actualPrivacyPolicyWarning = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
	
	if(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning)) {
		System.out.println("PP wm is valid");
	}
	else {
		System.out.println("PP wm is invalid");
	}
	
	
	String expectedFirstNameWarning = "First Name must be between 1 and 32 characters!";
	String actualFirstNameWarning = driver.findElement(By.xpath("//div[text()= 'First Name must be between 1 and 32 characters!']")).getText();
	
	if(actualFirstNameWarning.contains(expectedFirstNameWarning)) {
		System.out.println("FN wm is valid");
	}
	else {
		System.out.println("FN wm is invalid");
	}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
