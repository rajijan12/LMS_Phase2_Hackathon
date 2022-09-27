package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;

public class AssignmentHeaderStep  extends BaseClass{
	
	AssignmentPage apo =new AssignmentPage(DriverFactory.getDriver());
	WebDriver driver =DriverFactory.getDriver();
	
	@Given("User is logged to LMS website")
	public void user_is_logged_to_lms_website() {
	    if(driver.getCurrentUrl().equals("https://lms-frontend-phase2.herokuapp.com/"))
		{
apo.clickAssignment();
}
	    
	}
	@When("User is on Manage Assignment page")
	public void user_is_on_manage_assignment_page() {
		 apo.isManageAssignmentPresent();
	   
	}
	@Then("User should see heading with text {string} on the page")
	public void user_should_see_heading_with_text_on_the_page(String string) {
		String str1= apo.manageAssignment.getText();
		System.out.println(str1);
	   
	}
	
	

}
