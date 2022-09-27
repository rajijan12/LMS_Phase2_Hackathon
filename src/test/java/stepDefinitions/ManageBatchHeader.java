package stepDefinitions;

import com.driver.factory.*;
import pageObjects.ManageBatchPageObject;

import io.cucumber.java.en.*;

public class ManageBatchHeader {
	ManageBatchPageObject managebatch =new ManageBatchPageObject(DriverFactory.getDriver());


@When("User clicks on the batch link on header")
public void user_clicks_on_the_batch_link_on_header() {
	managebatch.clickBatchLink();
}

@Then("User should see a heading with text {string} on the page")
public void user_should_see_a_heading_with_text_on_the_page(String string) {
	managebatch.verifyManageBatch();

}

}
