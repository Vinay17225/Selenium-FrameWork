package com.clusterhac.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.clusterhac.utility.BrowserFactory;

//import com.clusterhac.utility.BrowserFactory;

public class LoginTestCRM extends BrowserFactory {
	
	 WebDriver driver;
	
	@Test
	public void loginApp()
	{
		//driver.get("https://www.flipkart.com/");
		driver=BrowserFactory.startApplication(driver,"Chrome","https://www.flipkart.com/");
		
		//System.out.println("Application title:::::: "+driver.getTitle());
		String apptitle=driver.getTitle();
		System.out.println("Apptitle"+apptitle);
		Assert.assertEquals(apptitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!1");
		
		
		
	}
	

}
