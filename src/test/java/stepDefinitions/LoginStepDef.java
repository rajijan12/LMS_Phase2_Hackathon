package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.LoginPageObject;

public class LoginStepDef extends BaseClass {
	//WebDriver driver;
	
	LoginPageObject lpo =new LoginPageObject(DriverFactory.getDriver());
	
	@Given("User is on the Login Page")
	public void user_is_on_the_login_page() {
		
		DriverFactory.getDriver().get(url);	
	 
	}

	@When("User clicks the Login button after entering valid username and password")
	public void user_clicks_the_login_button_after_entering_valid_username_and_password() {
		
		lpo.setUsername(username);
	    lpo.setPassword(password);
	    lpo.clickSubmit();
	  
	}

	@Then("User should see the LMS Home page")
	public void user_should_see_the_lms_home_page() {
		

	}
	

}
