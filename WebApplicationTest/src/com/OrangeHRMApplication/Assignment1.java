package com.OrangeHRMApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		        //1.Automating to Launch The Chromebrowser
		
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				
				//Implicit wait condition 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//2.Navigating to OrangeHRM Application URL Address
				String OrangeHRMURlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
				driver.get(OrangeHRMURlAddress);
				
				//3.validation of Login Page
				
				//Validating the Title of OrangeHRM Application
				String ExpectedOrangeHRMTitle="OrangeHRM";
				System.out.println("The Expected title of the OrangeHRM is -"+ExpectedOrangeHRMTitle);
				String ActualOrangeHRMTitle=driver.getTitle();
				System.out.println("The Actual title of the OrangeHRM is -"+ActualOrangeHRMTitle);
				if(ActualOrangeHRMTitle.equals(ExpectedOrangeHRMTitle))
				{
					System.out.println("Validation of OrangeHRM Title - PASS");
					
				}
				else
				{
					System.out.println("Validation of OrangeHRM Title - FAIL");
				}
				System.out.println();
				
				//Validating the URL Address of OrangeHRM Application
				String ExpectedOrangeHRMURL="orangehrm-4.2.0.1";
				System.out.println("The Expected URL Address of OrangeHRM is - "+ExpectedOrangeHRMURL);
				String ActualOrangeHRMURL=driver.getCurrentUrl();
				System.out.println("The Actual URL of the OrangeHRM is - "+ActualOrangeHRMURL);
				
				if(ActualOrangeHRMURL.contains(ExpectedOrangeHRMURL))
				{
					System.out.println("Validation of OrangeHRM URL - PASS");
					
				}
				else
				{
					System.out.println("Validation of OrangeHRM URL - FAIL");
				}
				System.out.println();
				
				
				//validation of Text of LOGIN Panel
				//<div id="logInPanelHeading">LOGIN Panel</div>
				String ExpectedTextOfLoginPanel="LOGIN Panel";
				System.out.println("The Expected Text of LOGIN Panel is - "+ExpectedTextOfLoginPanel);
				By LOGINPanelTextProperty=By.id("logInPanelHeading");
				WebElement LOGINPanel=driver.findElement(LOGINPanelTextProperty);
				String ActualLOGINPanelText=LOGINPanel.getText();
				System.out.println("The Actual Text of LOGIN Panel is - "+ActualLOGINPanelText);
				
				if(ActualOrangeHRMURL.contains(ExpectedOrangeHRMURL))
				{
					System.out.println("The Validation of Text of LOGIN Panel is - PASS");
					
				}
				else
				{
					System.out.println("The Validation of Text of LOGIN Panel is - FAIL");
				}
				System.out.println();
				
				//4.Login to the application with valid test data
				//verify and validating the Username web element
				//<input name="txtUsername" id="txtUsername" type="text">
				By UserNameProperty=By.id("txtUsername");
				WebElement UserName=driver.findElement(UserNameProperty);
				String UserNameTestData="HIMABINDUM";
				UserName.sendKeys(UserNameTestData);
				
			    //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
			    By PasswordProperty=By.id("txtPassword");
				WebElement Password=driver.findElement(PasswordProperty);
				String PasswordTestData="Bindu*057";
				Password.sendKeys(PasswordTestData);
			    
				//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
			    By LOGINProperty=By.className("button");
				WebElement LOGIN=driver.findElement(LOGINProperty);
				LOGIN.click();
				
				//5.Validate OrangeHRM Application Home page
				
				//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				String ExpectedText="Welcome";
				System.out.println("The Expected Text of OrangeHRM Application Homepage - "+ExpectedText);
				By WelcomeProperty=By.linkText("Welcome Admin");
				WebElement WelcomeAdmin=driver.findElement(WelcomeProperty);
				String ActualText=WelcomeAdmin.getText();
				System.out.println("The Actual Text of OrangeHRM Application Homepage - "+ActualText);
					
				if(ActualText.contains(ExpectedText))
				{
					System.out.println("The Validation of Text of OrangeHRM Application Homepage - PASS");
					
				}
				else
				{
					System.out.println("The Validation of Text of OrangeHRM Application Homepage - FAIL");
				}
				System.out.println();
				
				
				//6.Test WelcomeAdmin
				
				//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
				By WelcomeAdminProperty=By.className("panelTrigger");
				WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
				WelcomeAdmin.click();
				
				//7.Test Logout
				
				//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
				By LogoutProperty=By.linkText("Logout");
				WebElement Logout=driver.findElement(LogoutProperty);
				Logout.click();
				
				//8.validation of Login Page After Logout
				
				//Validating the Title of OrangeHRM Application
				ExpectedOrangeHRMTitle="OrangeHRM";
				System.out.println("The Expected title of the OrangeHRM After Logout is -"+ExpectedOrangeHRMTitle);
				ActualOrangeHRMTitle=driver.getTitle();
				System.out.println("The Actual title of the OrangeHRM After Logout is -"+ActualOrangeHRMTitle);
				if(ActualOrangeHRMTitle.equals(ExpectedOrangeHRMTitle))
				{
					System.out.println("Validation of OrangeHRM Title After Logout - PASS");
					
				}
				else
				{
					System.out.println("Validation of OrangeHRM Title After Logout - FAIL");
				}
				System.out.println();
				
				//Validating the URL Address of OrangeHRM Application
				ExpectedOrangeHRMURL="orangehrm-4.2.0.1";
				System.out.println("The Expected URL Address of OrangeHRM After Logout is - "+ExpectedOrangeHRMURL);
				ActualOrangeHRMURL=driver.getCurrentUrl();
				System.out.println("The Actual URL of the OrangeHRM After Logout is - "+ActualOrangeHRMURL);
				
				if(ActualOrangeHRMURL.contains(ExpectedOrangeHRMURL))
				{
					System.out.println("Validation of OrangeHRM URL After Logout - PASS");
					
				}
				else
				{
					System.out.println("Validation of OrangeHRM URL After Logout - FAIL");
				}
				System.out.println();
				
				
				//validation of Text of LOGIN Panel After Logout 
				//<div id="logInPanelHeading">LOGIN Panel</div>
				ExpectedTextOfLoginPanel="LOGIN Panel";
				System.out.println("The Expected Text of LOGIN Panel After Logout is - "+ExpectedTextOfLoginPanel);
				LOGINPanelTextProperty=By.id("logInPanelHeading");
				LOGINPanel=driver.findElement(LOGINPanelTextProperty);
				ActualLOGINPanelText=LOGINPanel.getText();
				System.out.println("The Actual Text of LOGIN Panel After Logout is - "+ActualLOGINPanelText);
				
				if(ActualOrangeHRMURL.contains(ExpectedOrangeHRMURL))
				{
					System.out.println("The Validation of Text of LOGIN Panel After Logout is - PASS");
					
				}
				else
				{
					System.out.println("The Validation of Text of LOGIN Panel After Logout is - FAIL");
				}
				
				//9.Close the Browser
				
			    driver.close();
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
