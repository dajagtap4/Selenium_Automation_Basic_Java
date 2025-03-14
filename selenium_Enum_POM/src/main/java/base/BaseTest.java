package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import constants.TestDataEnum;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.homepagePOM;
import utility.Utilities;

public class BaseTest {
	protected WebDriver driver;
	public homepagePOM homepage;
	
	@BeforeClass
	public void driverInstance() throws IOException {
		String browser = Utilities.fetchConfigProperties("browser1").toString();
		String browser2 = Utilities.fetchConfigProperties("browser2").toString();
		String browser3 = Utilities.fetchConfigProperties("browser3").toString();
		
		if(browser.equalsIgnoreCase(TestDataEnum.CHROME_BROWSER.getValue())) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser2.equalsIgnoreCase(TestDataEnum.EDGE_BROWSER.getValue())) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser3.equalsIgnoreCase(TestDataEnum.FIREFOX_BROWSER.getValue())) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(TestDataEnum.BASE_URL.getValue());
		
		homepage = new homepagePOM(driver);
	}

	@AfterClass
	public void teardown() {
	if(driver!=null) {
		driver.quit();
	}
}
}
