package Basic_Functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class iframe_alert_popup_alertMessageAssertion {

	@Test
	public void iframe_alert_feature() {
		
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();

		// 'Try it' button is under iframe so need to declare iframe id=iframeResult
		driver.switchTo().frame("iframeResult");

		// click on 'Try it' button
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.close();
	}
}



Alert Handle -

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandle {

	@Test
	public void alerthandle() throws InterruptedException {
		
		//driver setup
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//expected message
		String expectedAlertMessage = "I am an alert box!";
		
		//click on alert
		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		
		//creating alert 
		Alert alert = driver.switchTo().alert();
		
		//get alert pop up message 
		String actualAlertMessage = alert.getText();
		
		//assert alert pop up message 
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
		
		//handle alert 
		alert.accept();
		
		Thread.sleep(2000);
		driver.close();
	}
}
