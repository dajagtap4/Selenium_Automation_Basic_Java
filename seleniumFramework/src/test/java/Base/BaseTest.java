package Base;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Pages.PracticePage;
import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private static WebDriver driver;
	public PracticePage practicePage;

	@BeforeClass
	public void driverInstance() throws IOException {
		if (Utility.fetchProperty("browser").toString().equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (Utility.fetchProperty("browser").toString().equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		} 
		
		else if (Utility.fetchProperty("browser").toString().equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(Utility.fetchProperty("testurl").toString());
		practicePage = new PracticePage(driver);
	}

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
