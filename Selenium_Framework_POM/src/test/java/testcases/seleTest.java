
package testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import utility.utilities;

public class seleTest extends BaseTest {

	@Test(groups = "title")
	public void verifyPageTitle() throws IOException {
		String actualTitle = practice.getPageTitle();
		String expectedTitle = utilities.fetchConfigProperty("expectedTitle").toString();

		Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
	}

	@Test
	public void verifyUserCanEnterNameInNameInputBox() {
		String enteredName1 = practice.enterName("Deepak");
		String enteredName2 = practice.getEnteredNameInNameInputBox();
		Assert.assertEquals(enteredName1, enteredName2, "Test failed: Entered name does not match input value!");
	}
}