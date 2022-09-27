package stepDefinitions;

import static org.testng.Assert.assertEquals;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class EditProgramStepDefinition {
	
	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	@When("User selects Program using checkbox")
	public void user_selects_program_using_checkbox() throws Exception {
		programObject.selectProgram();
	}

	@Then("Program gets selected")
	public void program_gets_selected() throws Exception {
	    String checkselect= programObject.verifyProgramSelected();
	    System.out.println("Select Program:  "+checkselect);
	}
	@When("User clicks on <Edit> button")
	public void user_clicks_on_edit_button() throws Exception {
	   
		programObject.clickEditButton();
	}

	@Then("User is on Program Details form.")
	public void user_is_on_program_details_form() throws Exception {
	    
		System.out.println("In  "+ programObject.getProgramDetailHeader());
		assertEquals("Program Details",programObject.getProgramDetailHeader());
	}

	@Given("User lands on Program Details form.")
	public void user_lands_on_program_details_form() throws Exception {
		
		 String checkselect= programObject.verifyProgramSelected();
		    System.out.println("Select Program:  "+checkselect);
		    programObject.clickEditButton();
	    
	}

	@When("User edits Name and selects the Save button")
	public void user_edits_name_and_selects_the_save_button() throws Exception {
		
		programObject.editProgramName();

	}

	@Then("User can see updated Name")
	public void user_can_see_updated_name() throws Exception {
		System.out.println("Updated Program name = "+programObject.verifyEditedProgramname());
	    assertEquals(programObject.verifyEditedProgramname(),programObject.getEditedProgramName());
	    
	}
	@When("User edits Description and selects the Save button")
	public void user_edits_description_and_selects_the_save_button() throws Exception {
		programObject.editProgramDescription();
	}

	@Then("User can see updated Description")
	public void user_can_see_updated_description() throws Exception {
		System.out.println("Updated Program name = "+programObject.getEditedProgramDescription());
	    assertEquals(programObject.verifyEditedDescription(),programObject.getEditedProgramDescription());
	}




}
