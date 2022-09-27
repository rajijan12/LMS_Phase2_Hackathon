package stepDefinitions;

import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.driver.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;


public class LoginPageStepdef extends BaseClass 
{
	
	
		LoginPage lpo =new LoginPage(DriverFactory.getDriver());
		WebDriver driver =DriverFactory.getDriver();
		


	public LoginPageStepdef() {}
	
	
	@Given("User is on browser")
	public void user_is_on_browser() {
		System.out.println("Inside Browser");
	   
	}


	@When("User opens the LMS Website with url")
	public void user_opens_the_lms_website_with_url() {
		driver.get(url);
	    
	}

	@Then("User should see the Login page.")
	public void user_should_see_the_login_page() {
		lpo.chkHomeTitle();
	}
	

@Given("User is on Login Page")
public void user_is_on_login_page() {
	driver.get(url);
	lpo.chkHomeTitle();

}
@When("User clicks Login button after entering valid username and password")
public void user_clicks_login_button_after_entering_valid_username_and_password() {
	lpo.setUsername(username);
    lpo.setPassword(password);
    lpo.clickLogin();

}
@Then("User should see LMS Home page")
public void user_should_see_lms_home_page() {
	String title= driver.getTitle();
    if(title.equals("LMS"))
    {System.out.println("Login Success");
   // driver.close();
}

}
	
	@When("User clicks the Login button after entering invalid username")
	public void user_clicks_the_login_button_after_entering_invalid_username() {
		driver.get(url);
		lpo.setUsername(" ");
	    lpo.setPassword(password);
	    lpo.clickLogin();
	    //Assert.assertEquals(true,lpo.ErrorMesg);
	    System.out.println("Invalid username");
	}

	@Then("User should receive the message {string}")
	public void user_should_receive_the_message(String Mesg) {
		System.out.println(Mesg);
		
		//Assert.assertEquals(lpo.ErrorMesg, Mesg);
	    
	}

	@When("User clicks the Login button after entering invalid password")
	public void user_clicks_the_login_button_after_entering_invalid_password() {
		
		lpo.setUsername(username);
	    lpo.setPassword("");
	    lpo.clickLogin();
	}

	
		
	
		
		
	
}
