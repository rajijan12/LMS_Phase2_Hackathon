package stepDefinitions;

import com.driver.factory.*;

import pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.*;

public class SearchBatchStepDef extends BaseClass{

	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());

	@Given("User is on Batch page")
	public void user_is_on_batch_page() {

		managebatch.clickBatchLink();
		managebatch.verifyManageBatch();
	}

	@When("user clicks on search box with {string} entered in it")
	public void user_clicks_on_search_box_with_entered_in_it(String batchname) {

		managebatch.searchBatch("sdet");

	}


	@Then("records of that  {string} are displayed")
	public void records_of_that_are_displayed(String batchname) {
	    System.out.println("records of "+batchname+"are displayed");

	}
}
