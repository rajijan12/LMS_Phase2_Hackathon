package stepDefinitions;

import static org.testng.Assert.assertEquals;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class NoOfRecordsStepDefinition {
	
	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	@Then("Verify that number of records \\(rows of data in the table) displayed on the page are {int}")
	public void verify_that_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) throws Exception {
	    
		
		Thread.sleep(1000);
		int totalRows= programObject.getTotalRows();
		System.out.println("Total rows in one page "+totalRows);
		
		assertEquals(5,totalRows);
		
	}


}
