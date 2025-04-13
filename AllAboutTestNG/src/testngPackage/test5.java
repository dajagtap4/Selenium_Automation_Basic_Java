package testngPackage;

import org.testng.annotations.Test;

public class test5 {

	@Test
	public void x() {
		System.out.println("x");
	}

	@Test(dependsOnMethods = {"y"})
	public void b() {
		System.out.println("b");
	}

	@Test
	public void f() {
		System.out.println("f");
	}

	@Test
	public void y() {
		System.out.println("y");
	}

	@Test
	public void g() {
		System.out.println("g");
	}

}
