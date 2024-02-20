package com.worldClock_countryTimings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintingAllColumnsAndCells {
	
	WebDriver driver;
	String ApplicationURLAddress="https://www.timeanddate.com/worldclock/";
	
	
	public void ApplicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(ApplicationURLAddress);
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintingAllColumnsAndCells worldClock=new PrintingAllColumnsAndCells();
		
worldClock.ApplicationLaunch();

	}
	
}


