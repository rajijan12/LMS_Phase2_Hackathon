package stepDefinitions;

import com.driver.factory.*;
import pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.Then;

public class DeleteButtonStepDef {

	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());

	@Then("Verify that the Delete button next to the search box is Disabled")
	public void verify_that_the_delete_button_next_to_the_search_box_is_disabled() {
	    managebatch.checkDeleteButtonisDisabled();
	}
}
