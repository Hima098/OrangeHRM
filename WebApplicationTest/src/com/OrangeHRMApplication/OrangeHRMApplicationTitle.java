package com.OrangeHRMApplication;

import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplicationTitle 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Automating Chromebrowser
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Navigating to OrangeHRM Application URL
		String OrangeHRMURl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(OrangeHRMURl);
		
		//Identifying the Title of OrangeHRM
		String ExpectedOrangeHrmTitle="OrangeHRM";
		System.out.println("The Expected title of the OrangeHRM is -"+ExpectedOrangeHrmTitle);
		String ActualOrangeHRMTitle=driver.getTitle();
		System.out.println("The Actual title of the OrangeHRM is -"+ActualOrangeHRMTitle);
		
		//Identifying the current URL Address of OrangeHRM
		String OrangeHRMCurrentURL=driver.getCurrentUrl();
		System.out.println("The Actual URL of the OrangeHRM is -"+OrangeHRMCurrentURL);
		
		//validation of OrangeHRM Title
		if(ActualOrangeHRMTitle.equals(ExpectedOrangeHrmTitle))
		{
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.close();
		
		
		
		

	}

}
