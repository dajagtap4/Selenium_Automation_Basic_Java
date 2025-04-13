package testngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test4 {

	@Test
	public void webLoginHOMELoan() {
		System.out.println("test4/web Login home Loan");
	}

	@Test(timeOut = 5000)
	public void MobileLoginHOMELoan() {
		System.out.println("test4/Mobile Login home Loan");
	}

	@AfterClass
	public void first() {
		System.out.println("-----after class /test4/-----");
	}
	
	@BeforeClass
	public void last() {
		System.out.println("-----before class /test4/-----");
	}

	@Test
	public void LoginAPIHOMELoan() {
		System.out.println("test4/Login API home Loan");
	}

}
