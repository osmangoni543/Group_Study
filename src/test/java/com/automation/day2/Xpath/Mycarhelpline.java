package com.automation.day2.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mycarhelpline {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://mycarhelpline.com");
//		driver.findElement(By.xpath("//li[@class = 'item-72']/child::a")).click();
//		driver.findElement(By.xpath("//img[@alt='Car Loan EMI Calculator']")).click();
//		Thread.sleep(5000);
		driver.get("https://www.mycarhelpline.com/index.php?option=com_forms&view=pages&layout=carloanemicalculator&Itemid=68");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name='loan']")).sendKeys("35000");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name='months']")).sendKeys("60");
		driver.findElement(By.xpath("//input[@class='text-box-medium' and @name='rate']")).sendKeys("10");
		driver.findElement(By.xpath("//input[@class='red-btn' and @name='Submit' and @value='Submit']")).click();
		
	}

}
