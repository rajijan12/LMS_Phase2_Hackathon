package stepDefinitions;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;
//import pageObjects.RegistrationPageObject;

public class Registrationstepdef extends BaseClass {
	
	//RegistrationPageObject rpo =new RegistrationPageObject(DriverFactory.getDriver());

	@Given("User is on LMS website")
	public void user_is_on_lms_website() {
	//	System.out.println("User is on the LMS Website");
	//	DriverFactory.getDriver().get("https://lms-frontend-phase2.herokuapp.com/login");	
	}
	    

	@When("User lands on Registration Page")
	public void user_lands_on_registration_page() {
	//	String pageTitle=rpo.getTitle();
	//	System.out.println("The user is on the page"+pageTitle);		
	}

	@Then("User sees the heading on the form as {string}")
	public void user_sees_the_heading_on_the_form_as(String string) {
		
	//	String pageTitle=rpo.getTitle();
     //	Assert.assertEquals(string,pageTitle);
	
	    
	}	
	
}
	


	
	


