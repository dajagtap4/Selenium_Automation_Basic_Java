//		This class contains, 

//		1. select redio button,
//			We can select redio button by using WebElement,
//			Also with xpath, id, css and many more.

//			Simplest way to select redio button is as below,
//			driver.findElement(By.id("vfb-7-1")).click();

//		2. Assert redio button selected or not,
//			In below code we assert with if() else, belows are other ways to assert,

//			System.out.println(redio_button.isSelected());
//			System.out.println(redio_button.isEnabled());
//			System.out.println(redio_button.isDisplayed());	

package Basic_Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redio_Button {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		//driver.manage().window().maximize();

		// Add redio buttons locator
		WebElement redio_button = driver.findElement(By.id("vfb-7-1"));
		redio_button.click();

		// Assert if redio button selected or not
		if (redio_button.isSelected()) {
			System.out.println("Selected..");//Selected..
		} else {
			System.out.println("not selected");
		}

		// to check total numbers of redio buttons 
		List<WebElement> sizeofredio = driver.findElements(By.xpath("//input[@name='webform' and @ type='radio']"));
		System.out.println(sizeofredio.size());//3
		
		driver.close();
	}
}
