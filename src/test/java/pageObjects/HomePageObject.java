package pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	
	WebDriver ldriver;
	
	@FindBy(xpath="//span[text()='LMS - Learning Management System']")
	WebElement title;

	@FindBy(xpath="//span[text()='Batch']")
	WebElement Batchbtn;

	@FindBy(xpath="//span[text()='User']")
	WebElement Userbtn;

	@FindBy(xpath="//span[text()='Assignment']")
	WebElement Assignmentbtn;

	@FindBy(xpath="//span[text()='Attendance']")
	WebElement Attendancebtn;
	
	@FindBy(xpath="//span[text()='Program']")
	WebElement Pgmbtn;


	@FindBy(xpath="//span[text()='Logout']")
	WebElement logoutbtn;
	
	public HomePageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	public String gethomepageheading()
	{

		return title.getText();
	}
	public void verifyHomePageHeading()
	{
		assertTrue(title.getText().equalsIgnoreCase("LMS - Learning Management System"));
		
	}
	public String getTitle()
	{
		String title=ldriver.getTitle();
		return title;
	}
	public boolean Batchbuttonpresence()
	{
		return Batchbtn.isEnabled();
		
	}
	public String chkbatchbtntxt()
	{
		return Batchbtn.getText();
	}
	
	
	public boolean Userbuttonpresence()
	{
		return Userbtn.isEnabled();	
	}
	
	public String chkusrbtntxt()
	{
		return Userbtn.getText();
	}
	public boolean Pgmbuttonpresence()
	{
		return Pgmbtn.isEnabled();	
	}
	public String chkpgmbtntxt()
	{
		return Pgmbtn.getText();
	}
	
	
	
	public boolean Assignmentrbuttonpresence()
	{
		return Assignmentbtn.isEnabled();
	}
	public String chkAssbtntxt()
	{
		return Assignmentbtn.getText();
	}
	
	public boolean Attendancebuttonpresence()
	{
		return Attendancebtn.isEnabled();
	}
	public String chkAttbtntxt()
	{
		return Attendancebtn.getText();
	}
	
	public boolean logoutbuttonpresence()
	{
		return logoutbtn.isEnabled();	
	}
	public String chklogouttxt()
	{
		return logoutbtn.getText();
	}

	
	
	
	
	
}
