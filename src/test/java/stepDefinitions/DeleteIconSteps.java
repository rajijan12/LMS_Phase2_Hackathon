package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.UserPageObject;

public class DeleteIconSteps {
	

	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());
	
	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
		usp.deleteIconPresence();
	  
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
	   
	}

	@When("no rows is checked")
	public void no_rows_is_checked() {
		
		Boolean status;
		status=usp.getCheckBoxStatus();
		if (status==false)
		{
			System.out.println("no rows got selected");
		}
	  
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
		Boolean status=usp.deleteIconDisabledStatus();
		Assert.assertEquals(status,false);
		

	}
	
	@When("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table() throws InterruptedException {
		usp.clickCheckBox();
		Thread.sleep(1000);
	    
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
	
		Boolean status=usp.deleteIconStatus();
		Assert.assertEquals(status,true);
	}
	
	@When("User clicks the delete icon at the top left corner of user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
		usp.clickDeleteIcon();
	
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(String string, String string2, String string3) {
	  
		
		boolean status=usp.getConfirmDBPresence(string,string2,string3);
	   Assert.assertEquals(status, true);
	}
	
}
