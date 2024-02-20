package com.OrangeHRMApplication;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_PIM {
	
	public static void main(String[] args) throws InterruptedException {
		
		  //1.Automating to Launch The Chromebrowser
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Implicit wait condition 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
		
		
		
		//test PIM WebElement
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		
		
		By PIMProperty=By.id("menu_pim_viewPimModule");
		WebElement PIM=driver.findElement(PIMProperty);
		PIM.click();
		
		Thread.sleep(3000);
		
		// Add Employee Property
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		
		By AddEmplpyeeProperty=By.id("menu_pim_addEmployee");
		WebElement AddEmployee=driver.findElement(AddEmplpyeeProperty);
		AddEmployee.click();
	
		//getting the text of Add Employee Page
		
		WebElement AddEmployee1=driver.findElement(AddEmplpyeeProperty);
		System.out.println("Title Of Add Employee Page Is - "+AddEmployee1.getText());
		
		
		//First Name Field Property
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		By FirstNameProperty=By.id("firstName");
		WebElement FirstName=driver.findElement(FirstNameProperty);
		FirstName.sendKeys("Medida");
		
		//Middle Name Field Property
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		
		By MiddleNameProperty=By.id("middleName");
		WebElement MiddleName=driver.findElement(MiddleNameProperty);
		MiddleName.sendKeys("Hima");
		
		//Last Name Field Property
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		

		By lastNameProperty=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys("Bindu");
		
		//Test Save Button
		//<input type="button" class="hover" id="btnSave" value="Save">
		By SaveProperty=By.id("btnSave");
		WebElement Save=driver.findElement(SaveProperty);
		Save.click();
		
		//Getting Actual Data of First Name
		String ExpectedFirstName="Medida";
		System.out.println("Expected First Name is - "+ExpectedFirstName);
		//<input value="Medida" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
		By ActualFirstNameProperty=By.id("personal_txtEmpFirstName");
		WebElement ActualFirstName=driver.findElement(ActualFirstNameProperty);
		String ActualFirstNameValue=ActualFirstName.getAttribute("value");
		System.out.println("Actual First Name is - "+ActualFirstNameValue);
	
		//Validation of First Name
		
		if(ActualFirstNameValue.equals(ExpectedFirstName))
		{
			System.out.println("Validation of First Name - PASS");
			
		}
		else
		{
			System.out.println("Validation of First Name - FAIL");
		}
		System.out.println();
		
		
		//Getting Actual Data of Middle Name
		String ExpectedMiddleName="Hima";
		System.out.println("Expected Middle Name is - "+ExpectedMiddleName);
		//<input value="Hima" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		By ActualMiddleNameProperty=By.id("personal_txtEmpMiddleName");
		WebElement ActualMiddleName=driver.findElement(ActualMiddleNameProperty);
		String ActualMiddleNameValue=ActualMiddleName.getAttribute("value");
		System.out.println("Actual Middle Name is - "+ActualMiddleNameValue);
		//Validation of Middle Name
		
		if(ActualMiddleNameValue.equals(ExpectedMiddleName))
		{
		  System.out.println("Validation of Middle Name - PASS");
					
		}
		else
		{
		  System.out.println("Validation of Middle Name - FAIL");
		}
		System.out.println();
			
		//Getting Actual Data of Last Name
		String ExpectedLastName="Bindu";
		System.out.println("Expected Last Name is - "+ExpectedLastName);
		//<input value="Bindu" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		By ActualLastNameProperty=By.id("personal_txtEmpLastName");
		WebElement ActualLastName=driver.findElement(ActualLastNameProperty);
		String ActualLastNameValue=ActualLastName.getAttribute("value");
		System.out.println("Actual Last Name is - "+ActualLastNameValue);
		//Validation of Last Name
		
		if(ActualLastNameValue.equals(ExpectedLastName))
		{
			System.out.println("Validation of Last Name - PASS");
			
		}
		else
		{
			System.out.println("Validation of Last Name - FAIL");
		}
		System.out.println();
		
		//Getting Actual Data of Employee Id
		//<input value="0001" type="text" name="personal[txtEmployeeId]" maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		
		By ActualEmployeeIdProperty=By.id("personal_txtEmployeeId");
		WebElement ActualEmployeeId=driver.findElement(ActualEmployeeIdProperty);
		String ActualEmployeeIdValue=ActualEmployeeId.getAttribute("value");
		System.out.println("Actual Employee Id is - "+ActualEmployeeIdValue);
		System.out.println("Expected Employee Id is - "+ActualEmployeeIdValue);
		//Validation of Employee Id
		
				if(ActualEmployeeIdValue.equals(ActualEmployeeIdValue))
				{
					System.out.println("Validation of Employee Id - PASS");
					
				}
				else
				{
					System.out.println("Validation of Employee Id - FAIL");
				}
				System.out.println();
		
		//6.Test WelcomeAdmin
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By WelcomeAdminProperty=By.className("panelTrigger");
		WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		WelcomeAdmin.click();
				
		
			
		Thread.sleep(5000);
		
		
		
		
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
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
