package com.clusterhac.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class TestCaseWithoutFramework {
	public void test1()
	{
		//System.setProperty("webdriver.chrome.driver","c:\\users\\Vinay_50\\Desktop\\Selenium jar\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.findElement(By.name("username")).sendKeys("Selenium_50");
		
		driver.findElement(By.name("passward")).sendKeys("Abcd@12345");
		driver.findElement(By.id(".Login"));
	}

}
