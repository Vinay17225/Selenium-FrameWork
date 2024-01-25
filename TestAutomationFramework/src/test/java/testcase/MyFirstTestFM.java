package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFM  extends BaseTest{
	
	@Test
	public static void LoginTest() throws InterruptedException 
	{

		System.out.println("clicked successfully");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
		driver.findElement(By.linkText(loc.getProperty("sign_link"))).click();
		
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys("vinay17225@gmail.com");
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys("Chaudhary@312");
		Thread.sleep(3000);
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		
		
	}
	
//	/*
//	 * @DataProvider(name="testdata") public object[][] tData { return new
//	 * object[][] { {"vinay1725@gmail.com","Chudhary@312"},
//	 * {"vina17225@gmail.com","Chaudry@312"}, {"vinay1225@gmail.com","Chaudhary@3"},
//	 * {"vinay17225@gmail.com","Chaudhary@312"},
//	 * 
//	 * }; }
//	 */
}
