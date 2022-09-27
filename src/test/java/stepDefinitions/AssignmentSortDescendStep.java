package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;

public class AssignmentSortDescendStep extends BaseClass {
	AssignmentPage apo =new AssignmentPage(DriverFactory.getDriver());
	WebDriver driver =DriverFactory.getDriver();
	
	
	
	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_name() {
		
		apo.Descendsort();
		
	    
	}

	@Then("User can see the results in Descending order of Assignment name")
	public void user_can_see_the_results_in_descending_order_of_assignment_name() {
	    
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_description() {
	    apo.Descendsort();
	}

	@Then("User can see the results in Descending order of Assignment Description")
	public void user_can_see_the_results_in_descending_order_of_assignment_description() {
	    
	}


}
