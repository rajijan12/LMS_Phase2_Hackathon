package stepDefinitions;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class DeleteButtonStepDefinition {
	
	
	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	@Then("User should see the Delete button on the top left hand side as Disabled")
	public void user_should_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    
		String dltbtnStatus;
		if(!programObject.getDeleteBtnStatus())
		{
			dltbtnStatus="Disabled";
		}
		else
		{
			dltbtnStatus="Enabled";
		}
		System.out.println("Delete button is "+dltbtnStatus);
	}

}
