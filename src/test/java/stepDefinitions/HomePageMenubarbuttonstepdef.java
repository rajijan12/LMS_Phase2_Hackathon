package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;

public class HomePageMenubarbuttonstepdef extends BaseClass{
	
	HomePageObject hpo =new HomePageObject(DriverFactory.getDriver());
	

	@Then("User should see the button with Text {string} on the menubar")
	public void user_should_see_the_button_with_text_on_the_menubar(String string) {
	   if(string=="Program")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
	   if(string=="Logout")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
	   if(string=="Assignment")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
	   
	   if(string=="User")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
		
	   if(string=="Batch")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
	   if(string=="Attendance")
	   {
		   String Pgmbtn =hpo.chkpgmbtntxt();
			 
	        Assert.assertEquals(string,Pgmbtn);  
	       System.out.println("logout button is enabled");
	   }
		
		
		
	}
	
	
	

}
