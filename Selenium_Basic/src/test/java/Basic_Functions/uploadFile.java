package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadFile {

	@Test
	public void uploadFileTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tus.io/demo");

		WebElement browse = driver.findElement(By.id("P0-0"));

		Actions actions = new Actions(driver);
		actions.moveToElement(browse).perform();

		browse.sendKeys("C:\\Automation\\Documentaion\\Java Concepts\\37-50.txt");
	}
}
