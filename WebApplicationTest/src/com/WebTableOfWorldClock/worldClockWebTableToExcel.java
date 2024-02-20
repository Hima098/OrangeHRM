package com.WebTableOfWorldClock;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldClockWebTableToExcel {
	
	
	

	WebDriver driver;
	String ApplicationURL="https://www.timeanddate.com/worldclock/";
	
	public void ApplicationLaunch()
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURL);
		
	}
		
	public void ApplicationWebTAble() 
	
	{
		
		//Property of Accra
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		String PropertyofRowP1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String PropertyofRowP2="]/td[1]/a";
		//Property of cell
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[2]
		
		
		
		
		
		for (int rowindex=1;rowindex<=36;rowindex++)
	   	
			
		{
			 By rowProperty=By.xpath(PropertyofRowP1+rowindex+PropertyofRowP2);
			 WebElement Row=driver.findElement(rowProperty);
			 //String RowValue=Row.getText();
			 //System.out.println(RowValue);
			
			
			
			for(int CellIndex=1;CellIndex<=8;CellIndex++)
			{
				 By cellProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+CellIndex+"]");
				 WebElement CellData=Row.findElement(cellProperty);
				 String CellValue=CellData.getText();
				System.out.println(CellValue);
				
				
				
			}
			
			
			
			
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		worldClockWebTableToExcel WorldClock=new worldClockWebTableToExcel();
		
		WorldClock.ApplicationLaunch();
		WorldClock.ApplicationWebTAble();
		
	}
	
	
	
	
	

	}


