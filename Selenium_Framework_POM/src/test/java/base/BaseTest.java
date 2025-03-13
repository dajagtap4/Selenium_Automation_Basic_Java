package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages_POM.practicePOM;
import utility.utilities;

public class BaseTest {
	protected WebDriver driver;
	public practicePOM practice;

	@BeforeClass
	public void driverInstance() throws IOException {
		if (utilities.fetchConfigProperty("browser").toString().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (utilities.fetchConfigProperty("browser").toString().equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else if (utilities.fetchConfigProperty("browser").toString().equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(utilities.fetchConfigProperty("testurl").toString());
		practice = new practicePOM(driver);
	}

	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
