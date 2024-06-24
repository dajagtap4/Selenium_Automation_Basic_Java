package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class makeMyTripTest {
	
	@Test	
	public void flightBookingDemo() throws InterruptedException {

	// Driver setup 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
	// po Objects	
		travellerPO travellerpo = new travellerPO(driver);
		fromToDatePickerPO fromtodatepicker = new fromToDatePickerPO(driver);
		//loginPagePO loginpapo = new loginPagePO(driver);
		
	// opening site 
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	// loginUser	
		//loginpapo.loginUser();
		
	// again opening site
//		driver.navigate().to("https://www.makemytrip.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
	// fromCity	
		fromtodatepicker.selectFromcity("Pune");
		
	// toCity 
		fromtodatepicker.selectTocity("Chennai");
		
	// departureDate
		fromtodatepicker.departureDate();
		
	// arrival
		fromtodatepicker.arrivalDate();
		
	// Traveller
		//travellerpo.selectTravllers();

	// submit
		travellerpo.submitForm();
		
		System.out.println("Sucessfully passed test...");	
		driver.close();
	}
}
