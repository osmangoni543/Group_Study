package com.Testng.day5.MultipleWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Size - Count --> .size()
//List - data --> List<WebElement>

public class Flipkart {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mens-formal-shirts/pr?sid=clo,ash,axc,mmk,bk1&fm=neo%2Fmerchandising&iid=M_9940ab5c-c515-42f5-96f1-7d5183dbd357_1_372UD5BXDFYS_MC.V795R35ST9K6&otracker=hp_rich_navigation_4_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BFormal%2BShirts_V795R35ST9K6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_4_L2_view-all&cid=V795R35ST9K6");
	}
	
	@Test
	public void shirtsFK() {
		List<WebElement> formalShirtsBrands = driver.findElements(By.cssSelector("div._2WkVRV"));
		                                                                          //div[@class = '_2WkVRV']
		                                                                          //#
		List<WebElement> formalShirtsTitle = driver.findElements(By.cssSelector("a.IRpwTa"));
		List<WebElement> formalShirtsPrices = driver.findElements(By.cssSelector("div._30jeq3"));;
		List<WebElement> formalShirtsDiscounts = driver.findElements(By.cssSelector("div._3Ay6Sb"));;
		
		System.out.println("The size of formal shirts brand is :" + formalShirtsBrands.size());
		System.out.println("The size of formal shirts prices is :" + formalShirtsPrices.size());
		
		System.out.println(formalShirtsBrands.get(2).getText());
		
		for(int i = 0; i<formalShirtsBrands.size(); i++) {
			System.out.println(formalShirtsBrands.get(i).getText()+ "--->" + formalShirtsTitle.get(i).getText() + "--->"
					           + formalShirtsPrices.get(i).getText() + "--->" +formalShirtsDiscounts.get(i).getText());
		}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
