package com.TestNGAnnotations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExcelOperations.ExcelOperations;

public class OHRM_AddEmployee extends ExcelOperations {
	ExcelOperations c= new ExcelOperations();
	
	WebDriver driver;
	String OrangeHRMURlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	
	@BeforeTest
	public void ApplicationLaunch() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(OrangeHRMURlAddress);
		System.out.println("Application Lanched Successfully");
		
		By UserNameProperty=By.id("txtUsername");
		WebElement UserName=driver.findElement(UserNameProperty);
	
	c.Reuse();	
		
	}
	
	
	
	
	
	
	
	@Test(priority=1,description="Login With Valid Test Data")
	public void LoginWithValidData()
	{
	
	System.out.println(" SentMail Test Executed Successfully ");
	}
	
	@Test(priority=2)
	public void MyName()
	{
	System.out.println(" Himabindu ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void Applicationclose()
	{
		driver.close();
		System.out.println("Application closed Successfully");
		
			
	}
	
	
	/*
	
	
	@Test(priority=4)// Test Case
	public void gmailApplicationLaunch() // Test Case Name
	// any functionality which is under Test Should be always be written within the Method implemented
//	    with TestNG Annotation @Test only
	//   Name of the Method is always called as Test Case Name
	// If a class contains multiple Methods - then the TestNG will executed the Test Cases
//	    based on the alphabetical order of the given Test case Name

	// If a class contains multiple Methods - then the TestNG will executed the Test Cases
//	    based on the alphabetical order of the given Test case Name - fist priority will
	     //     given to the Test Case name starting with Upper case Letter


	{
	System.out.println(" *** Gmail Application Launched Successfully ****");
	}


	@Test(priority=1)
	public void SentMailTest()
	{
	System.out.println(" SentMail Test Executed Successfully ");
	}

	@Test(priority=3)
	public void composeMailTest()
	{
	System.out.println(" ComposeMail Test Executed Successfully ");
	}


	@Test(priority=2)
	public void logInTest()
	{
	System.out.println(" LogIn Test Executed Successfully ");
	}
	
	
	*/
	
	
	
	
	
	
	
	
	

}
