package com.WebTableOfWorldClock;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		FileInputStream WorldClockwebTable=new FileInputStream("./src/com/ExcelOperationsfiles/testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(WorldClockwebTable);
		XSSFSheet worldClock=workbook.getSheet("WorldClock");
		
		WebDriver driver;
		String ApplicationURL="https://www.timeanddate.com/worldclock/";
		System.setProperty("webdriver.chrome.driver","./ChromeBrowser/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(ApplicationURL);
		
		
		
		//property of webTable
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody
		
		 List<WebElement> WebTableProperty=driver.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr"));
		 
		 int noof_rows=WebTableProperty.size();
		 
		 System.out.println("Total No.of Rows -"+noof_rows);
		 
		 List<WebElement> WebTableProperty1=driver.findElements(By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td"));
		 
		 int noof_cells=WebTableProperty1.size();
		 
		 System.out.println("Total No.of cells in A Row -"+noof_cells);
		
		 //Property of Row
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		 String PropertyofRowP1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		 String PropertyofRowP2="]/td[1]/a";
		 //Property of cell
		 ///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[2]
					
		       
        for (int rowindex=1;rowindex<=noof_rows;rowindex++)
	   	
			
		{
			 By rowProperty=By.xpath(PropertyofRowP1+rowindex+PropertyofRowP2);
			 WebElement Row=driver.findElement(rowProperty);
			 //String RowValue=Row.getText();
			 //System.out.println(RowValue);
			 Row RowOfSheet=worldClock.createRow(rowindex);
			
			
			for(int CellIndex=1;CellIndex<=noof_cells;CellIndex++)
			{
				 By cellProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+CellIndex+"]");
				 WebElement CellData=Row.findElement(cellProperty);
				 String CellValue=CellData.getText();
				 System.out.print(CellValue+"   | ");
				
				 Cell RowOfCell=RowOfSheet.createCell(CellIndex);
				 RowOfCell.setCellValue(CellValue);
				 
				
			}
			
			System.out.println();
		}
		
		FileOutputStream WebTableOutPut=new FileOutputStream("./src/com/ExcelOperationsfiles/testdata.xlsx");
		workbook.write(WebTableOutPut);
		
		driver.close();
	

	}

}
