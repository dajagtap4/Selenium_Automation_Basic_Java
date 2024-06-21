package Basic_Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkBox {

	@Test
	public void checkBoxFeature() {
		
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();

		// simplest way to select checkbox
		driver.findElement(By.id("vfb-6-0")).click();

		// Alternative for select checkbox
		WebElement checkbox1 = driver.findElement(By.cssSelector("input#vfb-6-1"));
		checkbox1.click();
		if (checkbox1.isSelected()) {
			System.out.println("Option3 Selected");// Option3 Selected
		} else {
			System.out.println("Deselected");
		}

		// to check total numbers of checkboxes.
		List<WebElement> sizeCheckbox = driver.findElements(By.xpath("//input[@name='webform' and @ type='checkbox']"));
		System.out.println(sizeCheckbox.size());// 3

		// Alternative for check total numbers of checkboxes.
		System.out.println(driver.findElements(By.xpath("//input[@name='webform' and @ type='checkbox']")).size());//3

		driver.close();
	}

}

//Option3 Selected
//3
//3
