 package com.clusterhac.utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	public static WebDriver startApplication(WebDriver driver,String browserName,String appURL)
	{
		if(browserName.equals("Chrome")) 
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\win10\\Downloads\\chromedriver_mac_arm64\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox")) 
		{
			//System.setProperty("webdriver.gecko.driver",".C:\\Users\\win10\\Downloads\\chromedriver_mac_arm64\\geckodriver.exe");
			driver=new FirefoxDriver();
		
		}
		else if(browserName.equals("IE")) 
		{
			//System.setProperty("webdriver.ie.driver",".C:\\Users\\win10\\Downloads\\chromedriver_mac_arm64\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		
			
		}
		else {
			System.out.println("We do not support the browser");
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}
