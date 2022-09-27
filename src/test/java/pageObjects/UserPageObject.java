package pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPageObject {
	
	WebDriver ldriver;
	
	@FindBy(xpath="//span[text()='User']")
	WebElement user;
	
	@FindBy(xpath="//div[text()=' Manage User']")
	WebElement manageuserTxt;
	
	@FindBy(xpath="//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']")
	WebElement paginationCntl;
	
	@FindBy(xpath="//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']")
	WebElement footer;
	
	@FindBy(xpath="//span[@class='p-button-icon p-button-icon-left pi pi-plus']")
	WebElement plusButton;
	
	@FindBy(xpath="//button[@id='new']//span[@class='p-button-label']")
	WebElement addUserTxt;
	
	@FindBy(xpath="//span[@id='pr_id_12-label']")
	WebElement userDetailsTxt;
	
	@FindBy(xpath="//input[@id='mat-input-135']")
	WebElement FirstName;

	@FindBy(xpath="//div[@role='dialog']")
	WebElement userDetailsDialogbox;
	
	@FindBy(xpath="//div[@class='box']//span[@class='p-button-icon pi pi-trash']")
	WebElement deleteIcon;
	
	@FindBy(xpath="//button[@class='p-button-danger p-button p-component p-button-icon-only']")
	WebElement deleteIconDisabled;
	
	@FindBy(xpath="//p-table[@datakey='user_id']")
	WebElement dataTable;
	
	@FindBy(xpath="//tbody/tr")
	List<WebElement> rowCount;
	
	@FindBy(xpath="//tbody//tr[1]//div[@role='checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath="//span[@class='p-confirm-dialog-message ng-tns-c133-317']")
	WebElement confirmDBText;
	
	@FindBy(xpath="//span[contains(text(),'No')]")
	WebElement confirmDBNo;
	
	@FindBy(xpath="//span[contains(text(),'Yes')]")
	WebElement confirmDBYes;
	
	public UserPageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void verifyUserTitle() {
		
		assertTrue(manageuserTxt.getText().equalsIgnoreCase("Manage User"));
		
	}
	
	public String getUserHeading()
	{
		return manageuserTxt.getText();
	}
	
	public String getTitle()
	{
		String title=ldriver.getTitle();
		return title;
	}
	
	public void clickUser() 
	{
		user.click();
	}
	
	public boolean pageCntlPresence()
	{	
		return paginationCntl.isEnabled();
		
	}
	public void manageUserPresence()
	{
		user.click();
		manageuserTxt.isDisplayed();
	}
	
	public String getPaginationTxt()
	{
		return paginationCntl.getText();
	}
	
	public String getFooterText()
	{
		return footer.getText();
	}
	
	public Boolean plusButtonPresence()
	{
		return plusButton.isDisplayed();
	}
	public String getAddUserText()
	{
		return addUserTxt.getText();
	}
	public void addUserClick()
	{
		addUserTxt.click();
	}
	
	public void userDetailsTxtPresence()
	{
		
		//userDetailsTxt.isDisplayed();
		
		ldriver.switchTo().frame(userDetailsDialogbox);
		FirstName.sendKeys("raji");
		//ldriver.switchTo().activeElement();
		Actions action=new Actions(ldriver);	
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//FirstName.sendKeys("raji");
	}

	public void deleteIconPresence()
	{
		deleteIcon.isDisplayed();
	}
	
	public boolean deleteIconStatus()
	{
		return deleteIcon.isEnabled();
	}
	
	public boolean deleteIconDisabledStatus()
	{
		return deleteIconDisabled.isEnabled();
	}
	
	public boolean getCheckBoxStatus()
	{
		
		int rows=rowCount.size();
		Boolean status=false;
		for(int row=1;row<=rows;row++)
		{
			
		status=ldriver.findElement(By.xpath("//tbody/tr["+row+"]/td[1]")).isSelected();
		if (status==true)
		{
			break;
		}
			
		}
		
			return status;	
	}
	public void clickCheckBox()
	{
		checkBox.click();
	}
	
	public void clickDeleteIcon()
	{
		deleteIcon.click();
	}
	
	public boolean getConfirmDBPresence(String string,String string2,String string3)
	{
		ldriver.switchTo().alert();
		if((confirmDBText.getText()==string)&& (confirmDBNo.getText()==string2) && (confirmDBYes.getText()==string3))
				{
				return true;
				}
		else 
			return false;
	}
	
}
