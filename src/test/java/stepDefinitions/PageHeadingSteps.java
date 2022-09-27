package stepDefinitions;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.UserPageObject;

public class PageHeadingSteps {
	
	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());
	
	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() {
		usp.clickUser();
	  
	}

	@Then("User should see the page heading as {string}")
	public void user_should_see_the_page_heading_as(String string) {
		
		String heading=usp.getUserHeading();
		Assert.assertEquals(heading,string);

	}


}
