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


Confirm Alert Handle -

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
		
		//expected messages
		String expectedConfirmMessage = "Press a button!";
		String expectedYouPressedOkText = "You pressed OK!";
		
		//click on Confirm alert
		driver.findElement(By.xpath("//button[contains(text(),'Confirmation Alert')]")).click();
		
		//creating alert 
		Alert alert = driver.switchTo().alert();
		
		//get Confirm alert pop up message 
		String actualConfirmMessage = alert.getText();
		
		//accept conform alert 
		alert.accept();
		
		//assert alert pop up message - "Press a button!"
		Assert.assertEquals(actualConfirmMessage, expectedConfirmMessage);
		
		//get "You pressed OK!" text
		String actualYouPressedOkText = driver.findElement(By.cssSelector("#demo")).getText();
		
		//assert "You pressed OK!" text
		Assert.assertEquals(actualYouPressedOkText, expectedYouPressedOkText);
		
		Thread.sleep(2000);
		driver.close();
	}
}

Prompt Alert handle -


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertHandle {

	@Test
	public void verifyHandlingPromptAlert() throws InterruptedException {
		
		//Driver setup
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Global Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//expected messages
		String expectedPromptMessage = "Please enter your name:";
		String expectedHelloDeepak = "Hello Deepak! How are you today?";
		
		//click on Prompt alert
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert')]")).click();
		
		//creating alert 
		Alert alert = driver.switchTo().alert();
		
		//get Prompt alert pop up message 
		String actualPromptMessage = alert.getText();
		
		//sendkey to conform alert 
		alert.sendKeys("Deepak");
		
		//accept (OK) conform alert 
		alert.accept();
		
		//assert alert pop up message -"Please enter your name:"
		Assert.assertEquals(actualPromptMessage, expectedPromptMessage);
		
		//get "Hello Deepak! How are you today?" text
		String actualHelloDeepak = driver.findElement(By.cssSelector("#demo")).getText();
		
		//assert "Hello Deepak! How are you today?" text
		Assert.assertEquals(actualHelloDeepak, expectedHelloDeepak, "Prompt Alert not Handeled succesfully");
		
		Thread.sleep(2000);
		driver.close();
	}
}

