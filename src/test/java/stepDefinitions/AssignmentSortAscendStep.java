package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;

public class AssignmentSortAscendStep extends BaseClass{
	AssignmentPage apo =new AssignmentPage(DriverFactory.getDriver());
	WebDriver driver =DriverFactory.getDriver();
	
	
	@Given("User is on Assignment Page")
	public void user_is_on_assignment_page() {
		apo.clickAssignment();
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_name() {
		
	    
	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
	apo.sort();	
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment Description")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_description() {
		apo.sort();
	    
	}

	@Then("User can see the results in Ascending order of Assignment Description")
	public void user_can_see_the_results_in_ascending_order_of_assignment_description() {
		
	   apo.chksortlist();
	}

}
