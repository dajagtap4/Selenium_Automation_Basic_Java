package datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

public class datePickerInDepth {

	public static void selectFuturedates(WebDriver driver,String month, String year , String date) {
		while (true) {
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		}
		
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}
	
	
	public static void selectPastdates(WebDriver driver,String month, String year , String date) {
		while (true) {
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();

			if (currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-w")).click();
		}
		
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

		for (WebElement dt : allDates) {
			if (dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
	}

	@Test
	public void datePickerJQuery() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//use one method at a time, past and future not possible.
		//selectFuturedates(driver, "May", "2025", "20");
		selectPastdates(driver, "May", "2020", "20");
	}
}
