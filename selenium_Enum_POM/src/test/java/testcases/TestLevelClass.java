package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.BaseTest;
import constants.TestDataEnum;
import utility.Utilities;

public class TestLevelClass extends BaseTest {
	@Test
	public void checkPageTitle() {
		System.out.println(homepage.getPageTitle());
	}
	
	@Test
	public void checkUserCanEnterInputInNameInputField() throws IOException {
		homepage.enterName(TestDataEnum.USERNAME.getValue());
	}
}
