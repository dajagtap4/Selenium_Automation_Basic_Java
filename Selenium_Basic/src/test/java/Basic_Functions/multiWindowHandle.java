package Basic_Functions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multiWindowHandle {

	@Test
	public void multiWindowHandle_method() throws InterruptedException {
		driverSetup.setUp();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector(
				"#\\31 682325589592_4ma > div.container > article > div.content__wrapper > div > pbc-button:nth-child(1) > a"))
				.click();

		Set<String> windowhandles = driver.getWindowHandles();

		Iterator<String> iterator = windowhandles.iterator();
		String parentW = iterator.next();
		String childW = iterator.next();

		driver.switchTo().window(childW);

		driver.findElement(By.name("UserFirstName")).sendKeys("Deepak");
		driver.findElement(By.name("UserLastName")).sendKeys("Jagtap");

		driver.switchTo().window(parentW);
		Thread.sleep(2000);
		driver.quit();
//watch window handle video and push this code to git
	}
}
