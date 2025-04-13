package testngPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test3 {
	@Test
	public void firlastst() {
		System.out.println("test3/Mobile Login Car Loan");
	}

	@Test
	public void webLoginCarLoan() {
		System.out.println("test3/web Login Car Loan");
	}

	@AfterTest
	public void first() {
		System.out.println("-----after test P loan  /test3/-----");
	}

	@AfterSuite
	public void firstAfterSuite() {
		System.out.println("-----after suite /test3/ -----");
	}

	@Test(groups= {"Smoke"})// this will linked to testng3.xml  <groups> ... </groups>
	public void MobileLoginCarLoan() {
		System.out.println("test3/Mobile Login Car Loan");
	}

	@Test
	public void LoginAPICarLoan() {
		System.out.println("test3/Login API Car Loan");
	}

}
