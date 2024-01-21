package com.clusterhac.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.clusterhac.utility.BrowserFactory;
import com.clusterhac.utility.ConfigDataProvider;
import com.clusterhac.utility.ExcelDataProvider;

public class BaseClass {
	
	public WebDriver driver;
	
	public ExcelDataProvider excel;
	
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void setupSuit() 
	{
		excel=new ExcelDataProvider();
		//config=new 
	}
	
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://classic.freecrm.com/");
	}
	
	@AfterClass
	public void tearDown() 
	{
		BrowserFactory.quitBrowser(driver);
	}

}
