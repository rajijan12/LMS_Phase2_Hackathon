package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;

import pageObjects.UserPageObject;

public class PaginationSteps {
	
	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());
	
	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() {
		
		usp.pageCntlPresence();
	   
	}
	
	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
		usp.manageUserPresence();
	   
	}

	@When("Manage user table has less less than or equal to {int} rows")
	public void manage_user_table_has_less_less_than_or_equal_to_rows(Integer int1) {
		String pageCntlTxt=usp.getPaginationTxt();
		String splitStr[]=pageCntlTxt.split(" ");
		
		System.out.println("There are totally "+splitStr[5]+ "entries");
		int number=Integer.parseInt(splitStr[5]);
		
		if (number<= int1)
		{
			System.out.println("pagination control must be disabled");
		}
		else
		{
			System.out.println("pagination control must be enabled");
		}

	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
		Boolean status=usp.pageCntlPresence();
		assertEquals(false, status);
		
	}
	
	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(Integer int1) {
		
		String pageCntlTxt=usp.getPaginationTxt();
		String splitStr[]=pageCntlTxt.split(" ");
		
		System.out.println("There are totally "+splitStr[5]+ "entries");
		int number=Integer.parseInt(splitStr[5]);
		
		if (number > int1)
		{
			System.out.println("pagination control must be enabled");
		}
		else
		{
			System.out.println("pagination control must be disabled");
		}
	    
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
		Boolean status=usp.pageCntlPresence();
		assertEquals(true, status);
	   
	}


}
