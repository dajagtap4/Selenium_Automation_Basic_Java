package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPagePO {
	WebDriver driver;

	@FindBy(css = "li.makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")
	WebElement loginUserButton;

	@FindBy(css = "input#username")
	WebElement enterUserName;

	@FindBy(css = "div.btnContainer.appendBottom25>button")
	WebElement continueButton;

	@FindBy(css = "input#password")
	WebElement enterPassword;

	@FindBy(css = "div.btnContainer.appendBottom25>:first-child")
	WebElement loginButton;

	public loginPagePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginUser() throws InterruptedException {
		loginUserButton.click();
		Thread.sleep(500);
		enterUserName.sendKeys("deepakjagtap267@gmail.com");
		Thread.sleep(500);
		continueButton.click();
		Thread.sleep(1000);
		enterPassword.sendKeys("73rD39AEnWJ8$2k");
		Thread.sleep(500);
		loginButton.click();
		Thread.sleep(1000);
	}
}
