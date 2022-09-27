package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//import junit.framework.Assert;

public class ManageBatchPageObject {

	WebDriver ldriver;

	@FindBy(xpath="//button[@ng-reflect-router-link='/batch']")
	WebElement Batch_link;
	@FindBy(xpath="//div//mat-card-title/div[1]")
	WebElement Batch_header;
	@FindBy(xpath="//input[@type='text']")
	WebElement Search_text;
	@FindBy(xpath="//mat-card-title//button[@ng-reflect-icon='pi pi-trash']")
	WebElement disabledDeleteButton;
	@FindBy(xpath="//tbody//tr[@class='ng-star-inserted']")
	WebElement NoOfRecords;
	@FindBy(xpath="//button[@ng-reflect-label='A New Batch']")
	WebElement Anewbatch;
	
	@FindBy(id="pr_id_5-label")
	WebElement Batchdetailsheader;
	@FindBy(id="batchName")
	WebElement BatchName;
	@FindBy(id="batchDescription")
	WebElement BatchDescription;
	@FindBy(xpath="//input[@type='text'and @placeholder='Select a Program name']")
	WebElement ProgramName;
	@FindBy(xpath="//p-radiobutton[@ng-reflect-input-id='ACTIVE']")
	WebElement ActiveStatus;
	@FindBy(id="batchNoOfClasses")
	WebElement NoOfClasses;
	@FindBy(xpath="//button[@ng-reflect-label='Save']")
	WebElement Save;
	@FindBy(xpath="//button[@ng-reflect-label='Cancel']")
	WebElement Cancel;
	@FindBy(xpath="//small[@class='p-invalid ng-star-inserted']")
	WebElement NameRequired;
	
	@FindBy(xpath="//tbody[@class='p-datatable-tbody']//tr")
	List<WebElement> NoOfRows;
	
	@FindBy(xpath="//button[@class='p-paginator-prev p-paginator-element p-link p-disabled p-ripple']")
	WebElement DisabledPrevious;
	//@FindBy(xpath="//span[@class='p-paginator-icon pi pi-angle-right']")
	//WebElement NextPage;
	@FindBy(xpath="//button[@class='p-paginator-last p-paginator-element p-link p-ripple ng-star-inserted']")
	WebElement LastPage;
	@FindBy(xpath="//button[@class='p-paginator-next p-paginator-element p-link p-ripple p-disabled']")
	WebElement DisabledNext;
	@FindBy(xpath="//button[@class='p-paginator-prev p-paginator-element p-link p-ripple']")
	WebElement PreviousPage;
	@FindBy(xpath="//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted'][1]")
	WebElement Page2;
	@FindBy(xpath="//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted p-highlight']")
	WebElement HighlightPage;
	public ManageBatchPageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	public void clickBatchLink()
	{
		Batch_link.click();
	}
	
	public void verifyManageBatch() {
		String page_header=Batch_header.getText();
		 System.out.println("The user is on"+ page_header);

	}
	public void searchBatch(String batch_name)
	{
		Search_text.sendKeys(batch_name+Keys.ENTER);
	}
	
	public void AnewBatchButton()
	{
		Anewbatch.click();
	}
	
	public void batchDetailsHeader() {
		String NewBatchHeader=Batchdetailsheader.getText();
		System.out.println("The user is on"+NewBatchHeader);
		Assert.assertEquals("Batch Details",NewBatchHeader);
}
	public void batchDetailsForm() {
		BatchName.sendKeys("sdet72");
		BatchDescription.sendKeys("seleniumbatch");
		ProgramName.sendKeys("selenium");
		ActiveStatus.click();
		NoOfClasses.sendKeys("9");
		Save.click();
	}
	
	public void emptySave() {
		Save.click();
	}
	public void Namerequired() {
		System.out.println(NameRequired.getText());
	}
	
	public void checkDeleteButtonisDisabled() {
		boolean delete=disabledDeleteButton.isEnabled();
		Assert.assertFalse(delete);
	}
	
	public int CheckNoOfRows() {
		int totalRowsDisplayed=NoOfRows.size();
		return totalRowsDisplayed;
	}
	
	public void CheckPreviousLinkonFirstPage() {
		boolean disabledFirstPrevious=DisabledPrevious.isEnabled();
		Assert.assertFalse(disabledFirstPrevious);
	}
	
	
	public void ClickLastPage() {
		LastPage.click();
		}
	public void CheckNextLinkonLastPage(){
		boolean disabledLastNext=DisabledNext.isEnabled();
		Assert.assertFalse(disabledLastNext);
	}
	
	public void ClickPage2() {
		Page2.click();
	}
	
	public void VerifyPage() {
		boolean PageStatus=HighlightPage.isEnabled();
		Assert.assertTrue(PageStatus);
	}
	
	public void ClickPreviousPage() {
		PreviousPage.click();
	}
	
	
}
