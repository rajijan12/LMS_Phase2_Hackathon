package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;

public class AssignmentFooterStep extends BaseClass {
	
	AssignmentPage apo =new AssignmentPage(DriverFactory.getDriver());
	WebDriver driver =DriverFactory.getDriver();

	
	@Given("user clicks on Assignment link")
	public void user_clicks_on_assignment_link() {
		 if(driver.getCurrentUrl().equals("https://lms-frontend-phase2.herokuapp.com/"))
 		{
			 apo.clickAssignment();
	    
	}}

	@When("User is on  Manage Assignment page")
	public void user_is_on_manage_assignment_page() {
		  apo.isManageAssignmentPresent();
	}

	@Then("user should get the text below table")
	public void user_should_get_the_text_below_table() {
	    apo.isPagintionTextPresent();
	    String str1=apo.footerText.getText();
	    System.out.println(str1);
	}

	@Then("user should get the footer text")
	public void user_should_get_the_footer_text() {
		apo.isFooterTextPresent();
		String st2=apo.footerText.getText();
		System.out.println(st2);
	   
	}


}
