package FrameWork;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fromToDatePickerPO {

	WebDriver driver;

	@FindBy(xpath = "//span[text()='From']")
	WebElement fromCity;

	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement enterFromCityName;

	@FindBy(xpath = "//span[text()='To']")
	WebElement toCity;

	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement entertoCityName;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/label/span")
	WebElement clickOnDeparture;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[2]")
	WebElement selectDepartureDate;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[4]/div[2]/label/p")
	WebElement clickOnArrival;
	
	@FindBy(xpath = "//*[@id='top-banner']/div[2]/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[3]")
	WebElement selectArrivalDate;

	public fromToDatePickerPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	Thread.sleep(500);
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[4]/div[2]/label/span")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[3]/div")).click();
//	Thread.sleep(500);
	

	public void selectFromcity(String citynameFrom) throws InterruptedException {
		fromCity.click();
		Thread.sleep(500);
		enterFromCityName.sendKeys(citynameFrom);
		Thread.sleep(1500);
		enterFromCityName.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		enterFromCityName.sendKeys(Keys.ENTER);
	}

	public void selectTocity(String citynameTo) throws InterruptedException {
		toCity.click();
		Thread.sleep(500);
		entertoCityName.sendKeys(citynameTo);
		Thread.sleep(1500);
		entertoCityName.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		entertoCityName.sendKeys(Keys.ENTER);
	}
	
	public void departureDate() throws InterruptedException {
		Thread.sleep(500);
		clickOnDeparture.click();
		Thread.sleep(500);
		selectDepartureDate.click();
		Thread.sleep(500);
	}
	
	public void arrivalDate() throws InterruptedException {
		clickOnArrival.click();
		Thread.sleep(500);
		selectArrivalDate.click();
		Thread.sleep(500);
	}
}
