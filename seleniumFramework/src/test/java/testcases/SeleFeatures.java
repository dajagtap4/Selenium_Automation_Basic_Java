package Testscases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import utilities.utility;

public class tendableTest extends BaseTest {

	@Test(groups = "title")
	public void verifyPageTitle() throws IOException {
		String actualTitle = practice.getPageTitle();
		String expectedTitle = utility.fetchConfigProperty("expectedTitle").toString();

		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
	}

	@Test(groups = "title")
	public void verifyIncorrectPageTitle() throws IOException {
		String actualTitle = practice.getPageTitle();
		String incorrectTitle = utility.fetchConfigProperty("wrongtitle").toString(); // Deliberately incorrect
		
		Assert.assertNotEquals(actualTitle, incorrectTitle, "Test failed: Unexpected match with incorrect title!");
	}

	@Test(groups = "title")
	public void verifyTitleIsNotEmpty() {
		String actualTitle = practice.getPageTitle();

		Assert.assertFalse(actualTitle.isEmpty(), "Test failed: Page title is empty");
	}

	@Test(groups = "title")
	public void verifyTitleDoesNotContainUnexpectedText() {
		String actualTitle = practice.getPageTitle();

		Assert.assertFalse(actualTitle.contains("error"), "Test failed: Page title contains 'Error'");
	}

	@Test
	public void verifyUserCanEnterNameInNameInputBox() {
		String enteredName1 = practice.enterName("Deepak");
		String enteredName2 = practice.getEnteredNameInNameInputBox();
		Assert.assertEquals(enteredName1, enteredName2, "Test failed: Entered name does not match input value!");
	}

	@Test
	public void verifyUserCannotEnterEmptyName() {
		practice.enterName("");
		String enteredName2 = practice.getEnteredNameInNameInputBox();
		Assert.assertTrue(enteredName2.isEmpty(), "Test failed: Entered Empty input value!");
	}

	@Test
	public void verifyUserCannotEnterSpecialCharacters() {
		String enteredName1 = practice.enterName("!@#$%");
		String enteredName2 = practice.getEnteredNameInNameInputBox();
		Assert.assertEquals(enteredName1, enteredName2, "Test failed: Special characters should not be accepted!");
	}

	@Test
	public void verifyUserCannotEnterExcessivelyLongName() {
		String enteredName1 = practice.enterName("Deepak".repeat(100));
		String enteredName2 = practice.getEnteredNameInNameInputBox();

		Assert.assertNotEquals(enteredName1, enteredName2, "Test failed: Input should have a character limit!");
	}

}
