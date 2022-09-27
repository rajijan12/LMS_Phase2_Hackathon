package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.UserPageObject;

public class addUserSteps {
	
	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());

	@Then("User should see the button with text {string}")
	public void user_should_see_the_button_with_text(String string) {
		Boolean status=usp.plusButtonPresence();
		String txt=usp.getAddUserText();
		assertTrue(status);
		Assert.assertEquals(txt,"Add New User");
		
	}
	
	@When("User clicks Add New User button")
	public void user_clicks_add_new_user_button() {
		usp.addUserClick();
		
	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
		usp.userDetailsTxtPresence();
	   
	}
}
