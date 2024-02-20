import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
ChromeDriver hello=new ChromeDriver();
hello.get("https://www.google.com/");
String googleTitle=hello.getTitle();
System.out.println(googleTitle);
System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
EdgeDriver edgeBrowser=new EdgeDriver();
hello.close();
edgeBrowser.close();
	}

}