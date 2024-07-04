package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class demoClass {
	@Test
	public void demoCountry() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ele = driver.findElement(By.cssSelector("#country"));
		Select select = new Select(ele);
		select.selectByIndex(3);
		select.selectByValue("uk");
		
	}
}