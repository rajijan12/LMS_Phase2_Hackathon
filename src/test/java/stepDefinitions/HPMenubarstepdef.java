package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;

public class HPMenubarstepdef extends BaseClass {
	
	HomePageObject hpo =new HomePageObject(DriverFactory.getDriver());

	
	@When("User lands on LMS Home Page")
	public void user_lands_on_lms_home_page() {
		String pageTitle=hpo.getTitle();
		System.out.println("The user is on the page"+pageTitle);		

	}

	@Then("User should see the text {string} on the Homepage")
	public void user_should_see_the_text_on_the_homepage(String string) {
    String Actual ="LMS";
	String title=hpo.getTitle();
     Assert.assertEquals(Actual, title);	    
	    
	}
	


}


