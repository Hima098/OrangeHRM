package com.OHRM_Login_MultipleTestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithValidAndInvalidTestData {
	public static void main(String[] args) throws IOException, InterruptedException {
		//Launch the browser 
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//Navigating to OrangeHRM Application
		String OrangeHRMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(OrangeHRMApplicationURLAddress);
		
		driver.manage().window().maximize();
		
		//Identifying the external file
		FileInputStream File=new FileInputStream("./src/com/ExcelOperationsfiles/Login_multipleTestData.xlsx");
		//Identifying the workbook in the file
		XSSFWorkbook workbook=new XSSFWorkbook(File);
		//Identifying the sheet of workbook
		XSSFSheet sheet=workbook.getSheet("Login_MultipleTestData");
		//Identifying the active number of Rows
		int NoOfActiveRows=sheet.getLastRowNum();
		System.out.println("No.of Active Rows In Sheet :-  "+NoOfActiveRows);
		
		
		
		for(int rowIndex=1;rowIndex<=NoOfActiveRows;rowIndex++)
		{
			  
			
			Row row=sheet.getRow(rowIndex);
			
			//Identifying the Active Cells in the Row
			int activeCellsCount=row.getLastCellNum();
			
			//Identifying the user name field and performing an operation on it
			By OHRM_UsernameProperty=By.id("txtUsername");
			WebElement Username=driver.findElement(OHRM_UsernameProperty);
			Cell usernameTestDataCell=row.getCell(0);
			String usernameTestData=usernameTestDataCell.getStringCellValue();
			System.out.println(rowIndex+usernameTestData);
			Username.sendKeys(usernameTestData);
			
			
			for(int cellIndex=1;cellIndex<activeCellsCount;cellIndex++)
					
			{
				//identifying the password field and performing an operation on it
				By OHRM_PasswordProperty=By.id("txtPassword");
				WebElement Password=driver.findElement(OHRM_PasswordProperty);
				row=sheet.getRow(rowIndex);
				Cell passwordTestDataCell=row.getCell(1);
				String passwordTestData=passwordTestDataCell.getStringCellValue();
				Password.sendKeys(passwordTestData);
				System.out.println(passwordTestData);
				
				
				//identyfying the Login Button
				
				By OHRM_LoginProperty=By.id("btnLogin");
				WebElement LoginButton=driver.findElement(OHRM_LoginProperty);
				LoginButton.click();
			    Thread.sleep(5000);
			    
			    
				
				 // Identifying the Application URL Address
			    String Expected_HomePageURL ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			   String Actual_HomePageURL=driver.getCurrentUrl();
				
				
				//Validation of Invalid Credentials
				if (Actual_HomePageURL.equals(Expected_HomePageURL))
				{
					//Identifying and get the text of WelcomeAdmin
					String expected_welcomeAdminText="Welcome";
					By WelcomeAdminProperty=By.id("welcome");
					WebElement welcomeAdmin=driver.findElement(WelcomeAdminProperty);
					String actual_welcomeAdminText=welcomeAdmin.getText();
					System.out.println(actual_welcomeAdminText);
					System.out.println("Successfully navigated to HomePage");
					
					Row resultRow=sheet.getRow(rowIndex);
					Cell resultCell=resultRow.createCell(2);
					resultCell.setCellValue("Successfully navigated to HomePage");
					
					welcomeAdmin.click();
					
					Thread.sleep(3000);
					
					
					
					//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
					By logoutProperty=By.linkText("Logout");
					WebElement logoutLink=driver.findElement(logoutProperty);
					logoutLink.click();
					
				}
				else
				{

					 String Expected_SpanMsg="Invalid credentials";
						By invalidTextProperty=By.id("spanMessage");
						WebElement invalidText=driver.findElement(invalidTextProperty);
						String actual_spanMsg=invalidText.getText();
					System.out.println("Failed to navigate to HomePage");
					Thread.sleep(2000);
					
				     File invaliTestDataScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(invaliTestDataScreenShot, new File("./Screenshots"+usernameTestData+","+passwordTestData+".png"));
					
					
					Row resultRow=sheet.getRow(rowIndex);
					Cell resultCell=resultRow.createCell(2);
					resultCell.setCellValue("Failed to navigate to HomePage");
					
					
					
				}
				
				
				
				FileOutputStream loginTestResultFile=new FileOutputStream("./src/com/ResultFiles/Login_multipleTestData.xlsx");
				workbook.write(loginTestResultFile);
					
				 
			}	
			
		}
		
		
	
		
		//close the browser
		driver.close();
		
		
		
	}

}
