package com.OrangeHRMApplication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElements;

public class TsrtcHeaderlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new  ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/services/packagetours.do");
		/*
		<div class="menu">
		<a class="tabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
			<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
			<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
			<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
			<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
			<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
			<a class="selectedtabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">
				Tourism</a>
			<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
			<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
        </div>
        
        
        <div class="menu-wrap">
<div class="menu">
			<a class="tabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
				<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
				<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
				<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
				<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
				<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
				<a class="selectedtabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">
					Tourism</a>
				<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
				<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>
</div>
        */
		By HeaderBlockProperty=By.className("menu-wrap");
		WebElement HeaderBlock=driver.findElement(HeaderBlockProperty);
		By HeaderLInksProperty=By.tagName("a");
		List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(HeaderLInksProperty);
		int HeaderBlockLinksCount=HeaderBlockLinks.size();
		System.out.println(HeaderBlockLinksCount);
	
		for (int index=0;index<HeaderBlockLinksCount;index++)
		{
		String HeaderBlockText=HeaderBlockLinks.get(index).getText();
		System.out.println(HeaderBlockText);
		
		
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
