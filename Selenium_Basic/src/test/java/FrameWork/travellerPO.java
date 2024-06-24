package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class travellerPO {
	
	WebDriver driver;

	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[5]/label")
	WebElement travellerOption;

	@FindBy(css = "ul.guestCounter.font12.darkText.gbCounter>:nth-child(2)[data-cy='adults-2']")
	WebElement adults;

	@FindBy(css = "div.makeFlex.column.childCounter>:nth-child(2)>:nth-child(2)")
	WebElement childAge2To12;

	@FindBy(css = "div.makeFlex.column.pushRight.infantCounter>ul>:nth-child(3)")
	WebElement childBelow2;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]")
	WebElement travelClass;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button")
	WebElement applyButton;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/p/a")
	WebElement submit;
	
	public travellerPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectTravllers() throws InterruptedException {
		Thread.sleep(500);
		travellerOption.click();
		Thread.sleep(500);
		adults.click();
		Thread.sleep(500);
		childAge2To12.click();
		Thread.sleep(500);
		childBelow2.click();
		Thread.sleep(500);
		travelClass.click();
		Thread.sleep(1000);
		//applyButton.click();
	}
	
	public void submitForm() throws InterruptedException {
		submit.click();
		Thread.sleep(1000);
	}
}
