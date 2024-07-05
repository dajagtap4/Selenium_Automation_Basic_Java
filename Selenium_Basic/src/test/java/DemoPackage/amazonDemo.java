package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazonDemo{
	
	@Test
	public void amazonTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf' and @id='APjFqb']")).sendKeys("amazon");
		driver.findElement(By.cssSelector(".wM6W7d")).click();
		driver.findElement(By.linkText("Shop online at Amazon India")).click();
	}
}

class demo{
	
}

interface demo{
	
	demo();
	
	static void staticMethod() {
		syso("sttaic method")
	}
	
	default  staticMethod() {
		syso("sttaic method")
	}
	abstract methods
	static methods 
	default methods
}





