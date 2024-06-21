package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scroll_mouseHoverPage {

	@Test
	public void scroll() throws InterruptedException {

		scroll_mouseHoverPage_PO.setUp();
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

		System.out.println("pass scroll");
		driver.close();

	}

// - - - - - - - - - - - - - - - - - - - -

	@Test
	public void hoverPage() throws InterruptedException {

		scroll_mouseHoverPage_PO.setUp();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();

		// With the help of Action class we can hover mouse over on element.
		WebElement webelement = driver.findElement(By.cssSelector("#vl-flyout-nav > ul > li:nth-child(2) > a"));

		// mouse hover over this electronics hyperlink option and open sub page.
		Actions actions = new Actions(driver);
		actions.moveToElement(webelement);
		actions.perform();

		Thread.sleep(2000);

		// will click on this option
		driver.findElement(By.linkText("Video games and consoles")).click();

		System.out.println("pass hoverPage");
		driver.close();
	}
}
