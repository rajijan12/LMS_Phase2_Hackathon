package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProgramPageObject {
	WebDriver ldriver;
	
	@FindBy(xpath = "//div[@class='box']")
	WebElement programheader;
	
	
	
	@FindBy(xpath="//p-paginator//div//span")
	WebElement pageshow;
	
	@FindBy(xpath="//div[@class='p-datatable-footer ng-star-inserted']//div")
	WebElement footer;
	
	@FindBy(xpath="//div[@class='box']//div//button")
	WebElement deleteBtn;
	
	@FindBy(xpath="//table/tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath="//p-dialog[@header='Program Details']//div//div//span")
	WebElement programDetailsHeader;
	
	@FindBy(xpath="//div[@class='box']//div//span//input")
	WebElement searchBox;
	
	@FindBy(xpath="//p-dialog[@header='Program Details']//div//div//input[@id='programName']")
	WebElement ProgramName;
	@FindBy(xpath="//p-dialog[@header='Program Details']//div//div//input[@id='programDescription']")
	WebElement ProgramDescription;
	
	@FindBy(xpath="//p-dialog[@header='Program Details']//div//div//button[@label='Save']")
	WebElement ProgramSavebtn;
	
	static String updatedProgramname;
	static String updatedProgramDescription;
	public ProgramPageObject(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public String getHeader()
	{
		String header = programheader.getText();
		return header;
	}
	public String getPaginatortext() {
		
		String pagetext=pageshow.getText();
		return pagetext;
		
	}
	public String getFootertext()
	{
		String footertxt = footer.getText();
		return footertxt;
	}

	public Boolean getDeleteBtnStatus()
	{
		deleteBtn.click();
		Boolean status=deleteBtn.isEnabled();
		return status;
		
	}
	public int getTotalRows() throws Exception {
		
		Thread.sleep(1000);
		int numOfRows=tableRows.size();
		return numOfRows;
		
	}
	
	public String getSearchtext() {
		return searchBox.getAttribute("placeholder");
	}
	public void setSearchText(String searchentry)
	{
		searchBox.sendKeys(searchentry+Keys.ENTER);
	}
	
	public String verifySearchEntries() throws Exception {
		
		
		int numOfRows=getTotalRows();
		if(numOfRows>0)
		{
			WebElement tabcol=tableRows.get(1);
			
			//WebElement tc = tabcol.findElement(By.tagName("td"));
			//String searchedtext= tc.getText();
			String entry=numOfRows+" entries are showing.";
			return entry;
		}
		else
		{
			return "No such entry";
		}
	}
	
	public void selectProgram() throws Exception {
		
		int numOfRows=getTotalRows();
		if(numOfRows > 0 )
		{
		WebElement tabrow=tableRows.get(1);
		List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[1]"));
		WebElement checkbox= elementlist.get(0);
		checkbox.click();
		Thread.sleep(1000);
		}
		else
		{
			System.out.println("No Programs");
		}
		
	}
	public String verifyProgramSelected() throws Exception {
		int numOfRows=getTotalRows();
		if(numOfRows > 0 )
		{
		WebElement tabrow=tableRows.get(1);
		List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[1]"));
		WebElement checkbox= elementlist.get(0);
			if(checkbox.isSelected())
			{
			return "Program Selected";
			}
			else
			{
				return "No Programs..";
			}
			
		}
		else
		{
			return "No Programs..";
		}
	}
	public void clickEditButton() throws Exception {
		
		int numOfRows=getTotalRows();
		if(numOfRows > 0 )
		{
		//WebElement tabrow=tableRows.get(1);
		//List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[1]"));
		WebElement editbox = ldriver.findElement(By.xpath("//tr[1]//td[5]//span[1]//button"));
		editbox.click();
		Thread.sleep(1000);
		}
		else
		{
			System.out.println("No Program to edit");
		}
	}
	
	public String getProgramDetailHeader() throws Exception {
		
		Thread.sleep(1000);
		
		return programDetailsHeader.getText();
		
	}
	
	public void editProgramName() throws Exception {
		
		String oldname=ProgramName.getText();
		String newname="EditedProgram";
		updatedProgramname=newname;
		ProgramName.clear();
		ProgramName.sendKeys(newname);
		ProgramSavebtn.click();
		
		Thread.sleep(1000);
		
	}
	
public void editProgramDescription() throws Exception {
		
		String oldname=ProgramDescription.getText();
		String newname="Edited Description";
		updatedProgramDescription=newname;
		ProgramDescription.clear();
		ProgramDescription.sendKeys(newname);
		ProgramSavebtn.click();
		
		Thread.sleep(1000);
		
	}
	public String getEditedProgramName() {
		
		return updatedProgramname;
	}
	
public String getEditedProgramDescription() {
		
		return updatedProgramDescription;
	}
	public String verifyEditedProgramname() throws Exception
	{
		Thread.sleep(1000);
		WebElement editbox = ldriver.findElement(By.xpath("//tr[1]//td[2]"));
		String updatedname= editbox.getText();
		return updatedname;
	}
	public String verifyEditedDescription() throws Exception
	{
		Thread.sleep(1000);
		WebElement editbox = ldriver.findElement(By.xpath("//tr[1]//td[3]"));
		String updatedname= editbox.getText();
		return updatedname;
	}
}

	
	
