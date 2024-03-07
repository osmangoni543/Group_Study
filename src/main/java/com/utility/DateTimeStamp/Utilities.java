package com.utility.DateTimeStamp;

import java.util.Date;

public class Utilities {

	
	public static String generateEmailWithDateTimeStamp() {
		Date date = new Date();
		String timeStamp = date.toString().replace(" ", "_").replace(":", "_");
		return "osman" + timeStamp + "@gmail.com";
		
	}
	

}
