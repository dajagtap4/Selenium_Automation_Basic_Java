package DemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleFeature {

	@Test
	public void test1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		 	
//      >>   Multi window handle   <<
//		driver.get("https://www.salesforce.com/in/?ir=1");
//		
//		driver.findElement(By.cssSelector(
//				"#\\31 682325589592_4ma > div.container > article > div.content__wrapper > div > pbc-button:nth-child(1) > a"))
//				.click();
//		
//		Set<String> win = driver.getWindowHandles();
//		Iterator<String> i = win.iterator();
//		
//		String parent = i.next();
//		String child = i.next();
//		
//		driver.switchTo().window(child);
//		
//		driver.findElement(By.name("UserFirstName")).sendKeys("Deepak");
//		driver.findElement(By.name("UserLastName")).sendKeys("Jagtap");
//		
//		driver.switchTo().window(parent);
//		
//		Thread.sleep(2000);
//		driver.quit();
	
//---------------------------------------------------------------------------------		
		
//      >>  iframe and alert popup  <<
//		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		
//		driver.switchTo().frame("iframeResult");
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		String actualeText = driver.switchTo().alert().getText();
//		System.out.println(actualeText);
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(2000);
//		driver.quit();
		
	}
}
