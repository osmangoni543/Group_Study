package com.Testng.day4.DataProviver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Concepts {

	// Rules to us @DataProvider:
	// 1. @DataProvider returns a 2-Dimensional Object Array
	// 2. You have to pass no of rows and cols - you have to specify the data
	// 3. you have to use an annotation known as dataProvider inside the @Test case
	// 4. 1 dataProvider annotation is not @DataProvider
	// 5. You have to parameterize the Test Case

	public WebDriver driver;

	@Test(priority = 1, dataProvider = "getData")
	public void positiveLogin(String userName, String password, int phoneNumber, String browser) {
		System.out.println(userName + " " + password + " " + phoneNumber + " " + browser);
		System.out.println(browser);
		System.out.println(phoneNumber + userName);
	}

	@DataProvider
	public Object getData() {

//		Object[][] data = new Object[3][4];
//
//		data[0][0] = "username1";
//		data[0][1] = "password1";
//		data[0][2] = 929503460;
//		data[0][3] = "Chrome";
//
//		data[1][0] = "username2";
//		data[1][1] = "password2";
//		data[1][2] = 929503461;
//		data[1][3] = "Firefox";
//
//		data[2][0] = "username3";
//		data[2][1] = "password3";
//		data[2][2] = 929503462;
//		data[2][3] = "Edge";
//
//		return data;
		
		 Object[][] data ={{"username1","password1", 929503460, "Chrome"},
		                     {"username2","password2", 929503460, "Edge"},
		                     {"username3","password3", 929503460, "Firefox"}} ;
		 return data;

	}

}
