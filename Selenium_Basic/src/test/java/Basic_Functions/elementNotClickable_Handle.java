package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class elementNotClickable_Handle {

	@Test
	public void testHandle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[5]/div/div[1]")).click();
		WebElement element = driver. findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[9]/span/a")); 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
}
