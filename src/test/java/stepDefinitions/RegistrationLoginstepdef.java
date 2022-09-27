package stepDefinitions;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.RegistrationPageObject;

public class RegistrationLoginstepdef extends BaseClass{
	
//	RegistrationPageObject rpo =new RegistrationPageObject(DriverFactory.getDriver());

	
	
	/*@Given("User is on the LMS website")
	public void user_is_on_lms_website() {
      System.out.println("User is on the LMS Website");
		
     	DriverFactory.getDriver().get("https://lms-frontend-phase2.herokuapp.com/login");
	    
	}

	@When("user_lands_on_registration_page")
	public void user_lands_on_registration_page(){
		
		String pageTitle=rpo.getTitle();
		System.out.println("The user is on the page"+pageTitle);
	}*/
	
	
	@Then("User sees a button with text {string} on the Form")
	public void user_sees_a_button_with_text_on_the_form(String string) {
	    
	}

	@Given("User is on the Registerationpage")
	public void user_is_on_the_registerationpage() {	
	}

	@When("User selects the Login button")
	public void user_selects_the_login_button() {
	    
	}

	@Then("User lands on login page")
	public void user_lands_on_login_page() {
	    
		String Actual ="Log in";
		//String login=rpo.chklogintext();
		 
       // Assert.assertEquals(Actual,login);  
      // System.out.println("login button is Visible with text login");
		}
}
