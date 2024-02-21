package com.automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openweather {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org");
		// //li[@class='logo']/descendant::img[1]
		// //body[@class='body-orange']/descendant::img[@alt='logo']
		// ////li[@id='hamburger']/preceding::img[@alt='logo']
		// ////li[@id='hamburger']/preceding-sibling::li[@class='logo']/descendant::img[@alt='logo']
		driver.findElement(By.xpath("")).click();

	}

}
