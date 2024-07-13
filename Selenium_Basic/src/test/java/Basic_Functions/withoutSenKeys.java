//enter text in searchbox without sendKeys()

package Basic_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Class
public class withoutSenKeys {
	
	@Test
	public void withoutSenKeysMethod() throws InterruptedException {
		
//		commenting to focus only on imp part that is 
//		enter text in searchbox without sendKeys()
		
//		driverSetup.setUp();
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		//driver.close();
//
//		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//		Thread.sleep(3000);
		
		/*
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='iphone'", searchBox);
		
		System.out.println("passed...");
		driver.close();
		*/
	}
}
