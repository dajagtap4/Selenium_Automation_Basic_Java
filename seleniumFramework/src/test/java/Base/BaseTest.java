package Base;
 
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
 
public class BaseTest {
 
	public static WebDriver driver;
	public static Properties prop = new Properties();
	//public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr2;
 
	@BeforeTest
	public void setup() throws IOException {
		if (driver == null) {
			fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties");
			fr2 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\locators.properties");
			
			prop.load(fr);
			prop.load(fr2);
		}
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("testurl"));
		}
	}
 
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("passed...");
	}
}