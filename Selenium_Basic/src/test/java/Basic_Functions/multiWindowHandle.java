package Basic_Functions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiWindowHandle {

	@Test
	public void multiWindowHandle_method() throws InterruptedException {
		driverSetup.setUp();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();

		// Store parent window
		String parentWindow = driver.getWindowHandle();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'click')]")));
		button.click();

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Loop and switch
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);
		driver.quit();
	}
}
