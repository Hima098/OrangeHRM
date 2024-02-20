import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
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
		
		
		
		
		By HeaderlinksProperty=By.tagName("b");
		List<WebElement>Orange_HeaderLinks=driver.findElements(HeaderlinksProperty);

		// System.out.println(tsrtc_HomePageLinks);

		int Orange_HeaderLinkscount=Orange_HeaderLinks.size();
		System.out.println(" The number of links on the OrangeHRM Application Headerblock is :- "+Orange_HeaderLinkscount);


		for(int index=0;index<Orange_HeaderLinkscount;index++)
		{

		String linkName=Orange_HeaderLinks.get(index).getText();
		System.out.println(index+" "+linkName);
		}

	
		
	
		
		
		
		
		

	}

}
