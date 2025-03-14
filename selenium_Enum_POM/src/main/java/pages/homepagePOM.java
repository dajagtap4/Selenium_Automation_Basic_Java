package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import constants.TestDataEnum;

public class homepagePOM {
	WebDriver driver;

	By username = By.id(TestDataEnum.NAME_INPUT_BOX.getValue());

	public homepagePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void enterName(String name) throws IOException {
		driver.findElement(username).sendKeys(name);
	}
}
