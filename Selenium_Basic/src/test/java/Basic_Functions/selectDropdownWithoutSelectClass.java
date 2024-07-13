package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selectDropdownWithoutSelectClass {

	@Test(enabled = false)
	public void withJavaScriptExcecutor() {
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement selectDd = driver.findElement(By.xpath("//select[@id='searchDropdownBox' and @name='url']"));
		
		//-----------------------
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Amazon Devices'", selectDd);
		//-----------------------
	}
	
	@Test(enabled = true)
	public void withSendKeys() throws InterruptedException {
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		//-----------------------
		driver.findElement(By.xpath("//select[@id='searchDropdownBox' and @name='url']")).sendKeys("Amazon Devices");
		//-----------------------
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
