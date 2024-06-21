//	This class contains ,


//	1. How to handle alert poup,
//		driver.switchTo().alert().accept();

//	2. how to handle iframe objects,
//		driver.switchTo().frame("iframeResult");

//	3. How to get text from alert poup box
//		String actualMessage = driver.switchTo().alert().getText();

//	3. how to validate actual and expected alert popup message with assertion.
//		Assert.assertEquals(actualMessage, expectedMessasge);



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

		// Alert message Confirmation/assertion
		String expectedMessasge = "I am an alert box!";
		String actualMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(actualMessage, expectedMessasge);

		System.out.println("actualMessage : " + actualMessage);
		System.out.println("expectedMessasge : " + expectedMessasge);

		// click on OK button on alert popup to close this popup
		driver.switchTo().alert().accept();

		System.out.println("Passed...");

		driver.close();
	}
}
