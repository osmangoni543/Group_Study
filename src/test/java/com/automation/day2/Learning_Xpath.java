package com.automation.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath {
	
	//X-paths are of two types:
	//1)Absolute X-path
	//Specifies the complete path of an element from the root of the document.
	//Prone to breaking if there are changes in the structure of the HTML document.
	//Typically longer and less flexible.
	
	//2)Relative XPath:
	//Specifies the path of an element relative to another element.
	//More resilient to changes in the document structure, as it focuses on the relationship between elements rather than their absolute position.
	//Shorter and more readable.
	//Allows for easier maintenance and adaptation to changes in the web page layout.

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver1 = new ChromeDriver();
		//driver1.manage().window().maximize();
		//driver1.get("https://tutorialsninja.com/demo");
		//driver1.findElement(By.xpath("/html/body/div/nav/div[2]/ul/li/a")).click();
		
		//driver.findElement(By.xpath("/html/body/header/div/div/div/div/h1/a")).click(); //Absolute xpath
		//driver.findElement(By.xpath("//a[text() = 'Qafox.com']")).click(); //Reletive xpath
		
		//Login
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo");
//		driver.findElement(By.xpath("//span[@class = 'caret']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
//		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
//		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
//		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		//Registration
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/");
//		////html[@attribute = 'value']
//		driver.findElement(By.xpath("//a[@title='My Account']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
//		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Sarthak");
//		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("panda");
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Sarthak345625@gmail.com");
//		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("123-456-7890");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("badpanda");
//		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("badpanda");
//		driver.findElement(By.xpath("//input[@name='agree']")).click();
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@title='My Account']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
//		Thread.sleep(5000);
//		driver.get("https://tutorialsninja.com/demo");
//		driver.findElement(By.xpath("//span[@class = 'caret']")).click();
//		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
//		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("Sarthak345625@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("badpanda");
//		driver.findElement(By.xpath("//input[@type = 'submit']")).click();

		//Checkout
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.xpath("//span[@class = 'caret']")).click();
		driver.findElement(By.xpath("//a[text() = 'Login']")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Cameras']")).click();
		//driver.findElement(By.linkText("Cameras")).click();
		
		driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Add to Cart'])[1]")).click();
		
		
	}

}
