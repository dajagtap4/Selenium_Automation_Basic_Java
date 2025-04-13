package testngPackage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {

	@Test(groups= {"Smoke"})//// this will linked to testng3.xml
	public void loan() {
		System.out.println("test2/loan");
	}

	
	@BeforeTest
	public void loan2() {
		System.out.println("----before test P loan  /test2/-----");
	}

	
}
