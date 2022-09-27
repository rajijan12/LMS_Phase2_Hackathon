package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
			}
@FindBy(xpath="//div/input[@id='username']")
public WebElement username;

@FindBy(xpath="//div/input[@id='password']")
public WebElement password;

@FindBy (xpath="//span[contains(text(),'Login')]")
WebElement Login;

@FindBy(xpath="//*[@id='errormessage']")
public WebElement ErrorMesg;

public void geterrMesg()
{
	ErrorMesg.getText();
}
public void setUsername(String uname)
{
	username.sendKeys(uname);
	
}

public void setPassword(String pwd)
{
	password.sendKeys(pwd);
	}

public boolean clickLogin()
{
	Login.click();
	return true;
	
	
	}
public void chkHomeTitle()
{
	if(ldriver.getTitle().equals("LMS"))
		System.out.println("Home page");}

}



