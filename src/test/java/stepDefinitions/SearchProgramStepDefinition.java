package stepDefinitions;

import com.driver.factory.DriverFactory;
import static org.testng.Assert.assertEquals;
import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class SearchProgramStepDefinition {
	
	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	@Then("Text box used for search has text as {string}")
	public void text_box_used_for_search_has_text_as(String string) {
	    
		String searchtxt= programObject.getSearchtext();
		System.out.println("Search text before searching ="+searchtxt);
		assertEquals("Search...",searchtxt);
	}

	@Given("User is on Program page")
	public void user_is_on_program_page() throws Exception {
		assertEquals(programObject.getHeader(), "Manage Program");
		
	}

	@When("User enters Java into search box.")
	public void user_enters_java_into_search_box() throws Exception {
	   programObject.setSearchText("Java Basics");
	   Thread.sleep(1000);
	}

	@Then("Entries for Java are shown.")
	public void entries_for_java_are_shown() throws Exception {
	    String searchresult=programObject.verifySearchEntries();
	    System.out.println("Searchresults:"+ searchresult);
	}
	
	@When("User enters <description phrase> into search box.")
	public void user_enters_description_phrase_into_search_box() throws Exception {
		 programObject.setSearchText("Oracle Description");
		   Thread.sleep(1000);
	}

	@Then("Entries for <description phrase> are shown.")
	public void entries_for_description_phrase_are_shown() throws Exception {
		String searchresult=programObject.verifySearchEntries();
	    System.out.println("Searchresults:"+ searchresult);
	}
	
	@When("User enters <status phrase> into search box.")
	public void user_enters_status_phrase_into_search_box() throws Exception {
		programObject.setSearchText("Active");
		   Thread.sleep(1000);
	}

	@Then("Entries for <status phrase> are shown.")
	public void entries_for_status_phrase_are_shown() throws Exception {
		String searchresult=programObject.verifySearchEntries();
	    System.out.println("Searchresults:"+ searchresult);
	}

}
