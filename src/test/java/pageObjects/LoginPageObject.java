package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver ldriver;
	
	@FindBy(id= "username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement login;
	
	public LoginPageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String  verifyLoginTitle() {
		return ldriver.getTitle();
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	public void clickSubmit()
	{
		login.click();
	}
	

}
