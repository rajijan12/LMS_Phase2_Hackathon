package stepDefinitions;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageObjects.RegistrationPageObject;

public class RegisterAdd extends BaseClass {
	
	
//	RegistrationPageObject rpo =new RegistrationPageObject(DriverFactory.getDriver());


	
	@When("User fills the Address in alphanumeric only ")
	public void User_fills_the_Address_in_alphanumeric_only() {
	/*	
		String number="A20";
		rpo.setAdd(number);
		*/
	}

	
	@Then("Address will be displayed")
	public void Address_will_be_displayed() {
		
		
}
}