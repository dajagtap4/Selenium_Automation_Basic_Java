package Basic_Functions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {
@Test
	public void takeScreenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		TakeScreenshot interface can be used to take screenshots in WebDriver.
//		getScreenshotAs() method can be used to save the screenshot
		File ref = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ref, new File(".\\screenshot\\screen.png"));
		
		driver.close();
	}
}
