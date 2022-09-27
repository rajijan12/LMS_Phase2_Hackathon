package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.driver.factory.DriverFactory;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.*;
import pageObjects.UserPageObject;

public class ManageUserpageSteps {
	
	UserPageObject usp =new UserPageObject(DriverFactory.getDriver());
	
	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_login() {
		
		String pageTitle=usp.getTitle();
		System.out.println("The user is on the page " + pageTitle);
	    
	}

	@When("User clicks the Tab {string}")
	public void user_clicks_the_tab(String string) {
		System.out.println("user is clicking on the tab "+ string);
		usp.clickUser();
	   
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {
	  usp.verifyUserTitle();
	
	}
	
	

}
