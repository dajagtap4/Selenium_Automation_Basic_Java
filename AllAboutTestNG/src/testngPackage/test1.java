package testngPackage;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

	@Test(groups = { "Smoke" }) // this is linked to testng3.xml
	public void demo() {
		System.out.println("test1/demo");
	}

	@AfterSuite
	public void firstAfterSuite() {
		System.out.println("-----after suite /test1/ -----");
	}

	@BeforeMethod
	public void laset() {
		System.out.println("-----before method of class -> /test1/-----");
	}

	// below line linked to <parameter name="URL" value="google.com"></parameter> from testng1.xml
	@Parameters({ "URL" })
	@Test()

	public void CSecondTest1(String name) {
		System.out.println("test1/SecondTest1");
		System.out.println("++++++" + name);
	}

	@Test
	public void AsecondTest2() {
		System.out.println("test1/SecondTest2");
	}

	@BeforeSuite
	public void last() {
		System.out.println("-----before suite /test1/-----");
	}

	@Test
	public void DSecondTest3() {
		System.out.println("test1/SecondTest3");
	}

	@Test
	public void BSecondTest4() {
		System.out.println("test1/SecondTest4");
	}
}
