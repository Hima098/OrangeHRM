package com.userDefindMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	String OHRM_URLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void ApplicationLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(OHRM_URLAddress);
		
		Thread.sleep(2000);
		
	}
	
	
	public void ApplicationClose()
	{
		
		driver.close();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BaseTest B1=new BaseTest();
				B1.ApplicationLaunch();
				B1.ApplicationClose();
				
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
