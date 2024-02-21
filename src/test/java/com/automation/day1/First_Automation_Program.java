package com.automation.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Automation_Program {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // ctrl+shift+o
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo"); // Make sure its a https:// url
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://facebook.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://rediff.com");
		

	}

}
