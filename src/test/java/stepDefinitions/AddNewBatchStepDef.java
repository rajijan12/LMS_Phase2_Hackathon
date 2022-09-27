package stepDefinitions;

import com.driver.factory.*;
import pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.*;

public class AddNewBatchStepDef extends BaseClass{

	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());

	
	@When("User clicks A New Batch button")
	public void user_clicks_a_new_batch_button() {

		managebatch.AnewBatchButton();

	}

	@Then("user can see Batch details form")
	public void user_can_see_batch_details_form() {
managebatch.batchDetailsHeader();
System.out.println("User opens the batch details form");
	}

	@Given("User is on Batch details page")
	public void user_is_on_batch_details_page() {
		System.out.println("User is on the batch details form");
		managebatch.clickBatchLink();
		managebatch.AnewBatchButton();
	}

	@When("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {

managebatch.emptySave();
	}

	@Then("User gets message {string}")
	public void user_gets_message(String string) {

managebatch.Namerequired();
	}
	
	@When("User clicks Save button after entering valid data")
	public void user_clicks_save_button_after_entering_valid_data() {
	    managebatch.batchDetailsForm();
	}

	@Then("User gets message {string} on Manage Batch page")
	public void user_gets_message_on_manage_batch_page(String savebatch) {
	    System.out.println("The user gets:"+savebatch+ "on manage batch page");
	}
}
