package Basic_Functions;

import org.testng.annotations.Test;

public class driverSetup {
	@Test
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		}
	
	}
