package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import pageObjects.HomePageObject;



public class HomePagestepdef extends BaseClass {
	
	HomePageObject hpo =new HomePageObject(DriverFactory.getDriver());
	
	@Given("User is on the browser")
	public void user_is_on_the_browser(){
		//DriverFactory.getDriver().get("https://lms-frontend-phase2.herokuapp.com");	
		System.out.println("HomePage");
			}
	
	@When("User on HomePage after logging into LMS website")
	public void user_on_home_page_after_logging_into_lms_website(){
		
		String pageTitle=hpo.getTitle();
		System.out.println("The user is on the page"+pageTitle);		
	}	

	@Then("verify the title of the page is {string}")
	public void verify_the_title_of_the_page_is(String string) {
		
		String pageTitle=hpo.getTitle();
		Assert.assertEquals(string,pageTitle);
		
		
	}



	
}
