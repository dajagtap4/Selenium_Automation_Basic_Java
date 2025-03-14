package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.TestDataEnum;
import utility.Utilities;

public class TestLevelClass extends BaseTest {

	@Test(groups = "title")
	public void verifyPageTitle() throws IOException {
		String actualTitle = homepage.getPageTitle();
		String expectedTitle = TestDataEnum.EXPECTED_TITLE.getValue();

		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
	}
	
	@Test(groups = "title")
	public void verifyIncorrectPageTitle() throws IOException {
		String actualTitle = homepage.getPageTitle();
		String incorrectTitle = TestDataEnum.WRONG_TITLE.getValue();
		
		Assert.assertNotEquals(actualTitle, incorrectTitle, "Test failed: Unexpected match with incorrect title!");
	}

	@Test(groups = "title")
	public void verifyTitleIsNotEmpty() {
		String actualTitle = homepage.getPageTitle();

		Assert.assertFalse(actualTitle.isEmpty(), "Test failed: Page title is empty");
	}

	@Test(groups = "title")
	public void verifyTitleDoesNotContainUnexpectedText() {
		String actualTitle = homepage.getPageTitle();

		Assert.assertFalse(actualTitle.contains("this text is not presemt in actual text"), "Test failed: Page title contains 'Error'");
	}

	@Test
	public void verifyUserCanEnterNameInNameInputBox() throws IOException {
		String name1 = TestDataEnum.USERNAME.getValue();
		homepage.enterName(name1);
		String name2 = homepage.getEnteredNameInNameInputBox();
		Assert.assertEquals(name1, name2, "Test failed: Entered name does not match input value!");
	}

	@Test
	public void verifyUserCanNotEnterEmptyName() throws IOException {
		homepage.enterName("");
		String enteredName2 = homepage.getEnteredNameInNameInputBox();
		Assert.assertTrue(enteredName2.isEmpty(), "Test failed: Entered input value!");
	}

	@Test
	public void verifyUserCannotEnterSpecialCharacters() throws IOException {
		String name1 = TestDataEnum.SPECIAL_CHARS.getValue();
		homepage.enterName(name1);
		String name2 = homepage.getEnteredNameInNameInputBox();
		Assert.assertEquals(name1, name2, "Test failed: Special characters should not be accepted!");
	}

	@Test
	public void verifyUserCannotEnterExcessivelyLongName() throws IOException {
		String enteredName1 = TestDataEnum.USERNAME.getValue();
		homepage.enterName(enteredName1.repeat(100));
		String enteredName2 = homepage.getEnteredNameInNameInputBox();

		Assert.assertNotEquals(enteredName1, enteredName2, "Test failed: Input should have a character limit!");
	}
}
