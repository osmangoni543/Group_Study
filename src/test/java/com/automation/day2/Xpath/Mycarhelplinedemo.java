package com.automation.day2.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mycarhelplinedemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/index.php?option=com_forms&view=pages&layout=carloanemicalculator&Itemid=68");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name= 'loan']")).sendKeys("50000");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name= 'months']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name= 'rate']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@class='red-btn'][1]")).click();

	}

}
