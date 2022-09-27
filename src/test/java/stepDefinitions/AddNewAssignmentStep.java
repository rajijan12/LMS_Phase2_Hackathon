package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AssignmentPage;
import pageObjects.LoginPage;

public class  AddNewAssignmentStep extends BaseClass{

	AssignmentPage apo =new AssignmentPage(DriverFactory.getDriver());
	WebDriver driver =DriverFactory.getDriver();
	

@Given("User is on Assignment page")
public void user_is_on_assignment_page() {
	apo.clickAssignment();
    
}

@When("User clicks A New Assignment button")
public void user_clicks_a_new_assignment_button() {
    apo.clickNewAssignment();
}

@Then("user can see Assignment details form")
public void user_can_see_assignment_details_form() {
	apo.isAssignDetDisplayed();
	System.out.println("Inside NewAssignment Page");
	
    
}

@When("user enters Assignment name")
public void user_enters_assignment_name() {
	apo.clickAssignment();
	apo.clickNewAssignment();
   apo.enteaname();
}
@Then("User can see {string} entered")
public void user_can_see_entered(String name) {
	
    name=apo.AssignName.getText();
    
}

@When("user enters Assignment description")
public void user_enters_assignment_description() {
	apo.clickAssignment();
	apo.clickNewAssignment();
    apo.Descinput();
}

@When("user enters assignment grade")
public void user_enters_assignment_grade() {
	apo.clickAssignment();
	apo.clickNewAssignment();
   apo.Gradeinput();
}

@Then("user can see {string} entered")
public void user_can_see_entered1(String string) {
   
	/*
	 if (apo.aname.getText().isEmpty())
	{
		Assert.assertTrue(false);
		System.out.println("Name is empty");
	}
	else
		Assert.assertTrue(true);
		System.out.println(apo.aname.getText());
		*/
}

@When("user enters assignment due date")
public void user_enters_assignment_due_date() {
	apo.clickAssignment();
	apo.clickNewAssignment();
    apo.assignduedate();
}

@Then("user can see {string}")
public void user_can_see(String string) {
   
}
}