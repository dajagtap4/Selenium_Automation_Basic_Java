package Basic_Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropDown {

	@Test
	public void dropDownFeature() {
		
		driverSetup.setUp();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
		Select select = new Select(dropDown);
		
		select.selectByIndex(1);
		select.selectByValue("DZA");
		select.selectByVisibleText("Angola");
	}
}
