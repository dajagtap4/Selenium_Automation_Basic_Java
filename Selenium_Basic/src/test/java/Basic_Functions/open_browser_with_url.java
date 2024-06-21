package Basic_Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Class
public class open_browser_with_url {
	
	@Test
	public void open_browser_with_url_Method() {
		
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();

		System.out.println("passed..."); 
		
		//this is for git integration checkup
	}
}
