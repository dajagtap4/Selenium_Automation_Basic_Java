 
package testcases;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
 
import Base.BaseTest;
 
public class SeleFeatures extends  BaseTest{
	
    @Test
	public static void amazonMiniTvTopNavigationBar() throws InterruptedException {
    	Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("miniTv"))).click();
		System.out.println("locator selected");
	}
    
    @Test
    public static void iframeAndAlertHandle() {
    	
    }
}