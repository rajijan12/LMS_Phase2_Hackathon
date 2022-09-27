package stepDefinitions;

import com.driver.factory.*;
import pageObjects.LoginPageObject;
import pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.*;

public class BatchPagination extends BaseClass{

	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());
	LoginPageObject loginpage =new LoginPageObject(DriverFactory.getDriver());


	
	@Given("User is logged on to LMS website")
	public void user_is_logged_on_to_lms_website() {
		DriverFactory.getDriver().get(url);	
		loginpage.setUsername(username);
		loginpage.setPassword(password);
		loginpage.clickSubmit();
	}

	@When("User is on first page of Manage Batch")
	public void user_is_on_first_page_of_manage_batch() {
		managebatch.clickBatchLink();
	   managebatch.verifyManageBatch();
	}

	@Then("Verify that previous link is disabled")
	public void verify_that_previous_link_is_disabled() {
	    managebatch.CheckPreviousLinkonFirstPage();
	}
	
	@When("User is on last page of Manage Batch")
	public void user_is_on_last_page_of_manage_batch() {
		managebatch.clickBatchLink();

	    managebatch.ClickLastPage();
	}

	@Then("Verify that next link is disabled")
	public void verify_that_next_link_is_disabled() {
	    managebatch.CheckNextLinkonLastPage();
	}
	
	@Given("User is on the page number {string}")
	public void user_is_on_the_page_number(String page) {
		user_is_logged_on_to_lms_website();
		managebatch.clickBatchLink();
		System.out.println("The user is on page"+page);

	}

	@When("User clicks navigate > button")
	public void user_clicks_navigate_button() {
	    managebatch.ClickPage2();
	}

	@Then("User navigated to page number {string}")
	public void user_navigated_to_page_number(String page) {
	    managebatch.VerifyPage();
		System.out.println("The user is on page"+page);

	}
	
	@Given("User is on page number {string}")
	public void user_is_on_page_number(String page) {
		user_is_logged_on_to_lms_website();
		managebatch.clickBatchLink();
		managebatch.ClickPage2();
		System.out.println("The user is on page "+page);

	}

	@When("User clicks the navigate < button")
	public void user_clicks_the_navigate_button() {

managebatch.ClickPreviousPage();
	}

	@Then("User navigated to the page number {string}")
	public void user_navigated_to_the_page_number(String page) {
	   managebatch.VerifyPage();
		System.out.println("The user is on page"+page);

	}
}
