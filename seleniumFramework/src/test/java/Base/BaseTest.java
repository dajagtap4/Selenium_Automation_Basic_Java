package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.TendablePgae;
import pages.practicePOM;
import utilities.utility;

public class BaseTest {

	protected WebDriver driver;
	public TendablePgae tendablePgae;
	public practicePOM practice;

	@BeforeClass
	public void driverInstance() throws IOException {
		if (utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		} 
		
		else if (utility.fetchConfigProperty("browser").toString().equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(utility.fetchConfigProperty("testurl").toString());
		tendablePgae = new TendablePgae(driver);
		practice = new practicePOM(driver);  
	}

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
