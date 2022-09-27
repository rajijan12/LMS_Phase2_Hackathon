package stepDefinitions;

import static org.testng.Assert.assertEquals;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class HeaderStepDefinition extends BaseClass  {

	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	
	@Given("user is logged onto LMS web-site")
	public void user_is_logged_onto_lms_web_site() throws Exception {
		
		
		//String title = driver.getTitle();
		System.out.println("*******************");
		//System.out.println("********"+title +"***********");
		System.out.println("*******************");
	}

	@When("user is on Program page")
	public void user_is_on_program_page() throws Exception {
		assertEquals(programObject.getHeader(), "Manage Program");
		System.out.println("In Header when");
		Thread.sleep(2000);
	}

	@Then("user should see the heading with text {string} on the page")
	public void user_should_see_the_heading_with_text_on_the_page(String string) {
		
		assertEquals(programObject.getHeader(), "Manage Program");
		//System.out.println("In Header then");
	}
}
