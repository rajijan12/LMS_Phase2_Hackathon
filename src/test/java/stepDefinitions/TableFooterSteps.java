package stepDefinitions;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.LoginPageObject;
import pageObjects.UserPageObject;

public class TableFooterSteps extends BaseClass {
	
	LoginPageObject lpo =new LoginPageObject(DriverFactory.getDriver());
	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());
	
	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() {
		DriverFactory.getDriver().get(url);	
		lpo.setUsername(username);
	    lpo.setPassword(password);
	    lpo.clickSubmit();
	   
	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() {
		usp.clickUser();
		usp.verifyUserTitle();
	    
	}

	@Then("User should see the table footer as {string}")
	public void user_should_see_the_table_footer_as(String string) {
		String text=usp.getFooterText();
		System.out.println("text is"+text);
		Assert.assertEquals(text, string);
	   
	}
	

}
