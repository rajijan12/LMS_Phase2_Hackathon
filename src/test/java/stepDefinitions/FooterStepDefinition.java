package stepDefinitions;

import static org.testng.Assert.assertEquals;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.ProgramPageObject;

public class FooterStepDefinition {

	ProgramPageObject programObject = new ProgramPageObject(DriverFactory.getDriver());
	
	@Then("User should see the text as {string} below the table. x- starting record number on that page.")
	public void user_should_see_the_text_as_below_the_table_x_starting_record_number_on_that_page(String string) {
	    
		String pageText = programObject.getPaginatortext();
		System.out.println("**************");
		System.out.println(pageText);
		System.out.println("***********");
		
		String pagestr[]=pageText.split(" ");
		int num1,perpagenum,total;
		num1 = Integer.parseInt(pagestr[1]);
		perpagenum = Integer.parseInt(pagestr[3]);
		total= Integer.parseInt(pagestr[5]);
		
		//System.out.println("perpagenum= "+perpagenum);
		//System.out.println("total= "+total);
		String expectstr = "Showing "+num1+" to "+perpagenum+" of "+total+" entries";
		
		assertEquals(expectstr, pageText);
	}
	@Then("User should see the footer as {string}")
	public void user_should_see_the_footer_as(String string) {
	   
		String footerText = programObject.getFootertext();
		System.out.println("**************");
		System.out.println(footerText);
		System.out.println("***********");
		
		String footerstr[]=footerText.split(" ");
		int total = Integer.parseInt(footerstr[4]);
		String expected ="In total there are "+total+" programs.";
		assertEquals(expected,footerText);
	}
}
