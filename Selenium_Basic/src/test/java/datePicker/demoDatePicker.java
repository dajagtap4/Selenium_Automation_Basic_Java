package datePicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoDatePicker {

	public static void selectFuturedate(WebDriver driver, String month, String year, String date) {
		while (true) {
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
	}
	@Test
	public void demotest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		selectFuturedate(driver, "May", "2025", "10");
	}
}
