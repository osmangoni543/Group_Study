package com.automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_More_Concepts {
	//X-path family  tree:-
	//parent::
	//child::
	//ancestor::
	//descendant::
	//following-sibling::
	//preceding-sibling::
	//following::
	//preceding::

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//p[@id = 'signin_info']/child::a[2]
		//div[@class = 'table']/descendant::a[@title = 'Create Rediffmail Account']
		driver.findElement(By.xpath("//p[@id = 'signin_info']/child::a[2]")).click();

	}

}
