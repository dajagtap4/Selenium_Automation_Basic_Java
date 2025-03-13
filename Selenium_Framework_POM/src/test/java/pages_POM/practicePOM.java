
package pages_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicePOM {
	private WebDriver driver;

	@FindBy(id = "name")
	private WebElement userName;

	public practicePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String enterName(String name) {
		userName.sendKeys(name);
		return name;
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getEnteredNameInNameInputBox() {
		return userName.getAttribute("value");
	}

}