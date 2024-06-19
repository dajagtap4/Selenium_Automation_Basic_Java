package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		
		
//Methos 1 : with JavascriptExecutor we can scroll page.
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This will scroll down the page by 1000 pixel vertical
		js.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);
		
		
//Method 2 : With Actions class we can scroll page.
		WebElement locator1 = driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[8]/div/div/div[2]/div/ul/li[2]/span/a/img"));
		Actions actions = new Actions(driver);
		actions.moveToElement(locator1);
		actions.perform();

		
		
		System.out.println("pass");
		Thread.sleep(2000);
		driver.close();
	}

}
