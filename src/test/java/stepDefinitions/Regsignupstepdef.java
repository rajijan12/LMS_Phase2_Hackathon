package stepDefinitions;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.RegistrationPageObject;

public class Regsignupstepdef extends BaseClass {
	
	//RegistrationPageObject rpo =new RegistrationPageObject(DriverFactory.getDriver());

	
	@Given("User is on the LMS website")
	public void user_is_on_lms_website() {
      System.out.println("User is on the LMS Website");
		
     	DriverFactory.getDriver().get("https://lms-frontend-phase2.herokuapp.com/login");
	    
	}

	@When("user_lands_on_registration_page")
	public void user_lands_on_registration_page(){
		
		//String pageTitle=rpo.getTitle();
		//System.out.println("The user is on the page"+pageTitle);
	}
	
	@Then("User sees the text SIgn Up on the form")
	public void user_sees_the_text_sign_up_on_the_form() {
		
	//	String Actual ="Sign up";
		//String SignUp=rpo.Signuptext();
		 
       // Assert.assertEquals(Actual,SignUp);  
      // System.out.println("Signup button is Visible with text Signup");
	    
	}
	
}