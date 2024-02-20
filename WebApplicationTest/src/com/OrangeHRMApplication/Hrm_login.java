package com.OrangeHRMApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Navigating to OrangeHRM Application URL
		String OrangeHRMURl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(OrangeHRMURl);
		//Thread.sleep(5000);
	//driver.manage().window().maximize();
		//verify and validating the Username web element
		//<input name="txtUsername" id="txtUsername" type="text">
	driver.findElement(By.id("txtUsername")).sendKeys("HIMABINDUM");
	//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	driver.findElement(By.id("txtPassword")).sendKeys("8106820516");
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	driver.findElement(By.name("Submt")).click();
	
	
	
	}

}
