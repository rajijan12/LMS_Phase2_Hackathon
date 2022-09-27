package pageObjects;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class AssignmentPage  { 
	
	WebDriver ldriver;
	public AssignmentPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
			}
	
	
	@FindBy(xpath="//div[3]/button/span[2]")
	WebElement NewAssignment;
	
	@FindBy(xpath="//div[text()=' Manage Assignment']")
	public WebElement manageAssignment;
	
	@FindBy (xpath="//span[@class=\'p-dialog-title ng-tns-c132-48 ng-star-inserted\']")
	WebElement AssignmentDet;
	
	@FindBy(xpath="//span [@class='p-paginator-current ng-star-inserted']")
	public WebElement pageinatorText;
	
	@FindBy(xpath="//div[contains(text(),'In total there are ')]")
	public WebElement footerText;
	
	@FindBy(xpath="//span/input")
		public	WebElement Searchbartext;
	
	//header check box select all
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	WebElement chboxkHeader;
	
	//arrow icon for ascending and descending
	
	@FindBy(xpath="//table/thead/tr/th[2]/p-sorticon/i")
	WebElement iconsort;	
	
	@FindBy(xpath="//button[4]")
	WebElement Assignment;
	
	@FindBy(xpath="//input[@id='assignment']")
	public WebElement aname;
	@FindBy(id="assignmentDescription")
	public WebElement adesc;
	
	public void adescinput()
	{
		adesc.sendKeys("programs");
	}
	
	
	public void enteaname()
	{
		
		aname.sendKeys("Pythonbasics");
	}
	
	public void clickAssignment()
	{
		Assignment.click();
	}

	
	public void isManageAssignmentPresent() {
		/*
        try {
            this.manageAssignment.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
        */
	}
	
	public void manageAssignmentClick()
	{
		manageAssignment.click();
	}
	public void clickNewAssignment()
	{
		NewAssignment.click();
	}
	
	public boolean isAssignDetDisplayed()
	{
		try {
            this.manageAssignment.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
		}
	
	
	//Assignment Details Dialog webelements
	
	@FindBy(xpath="//input[@id='assignment']")
	
	
	public WebElement AssignName;
	
	
	public void inputName()
	
	{
	//	nameInput.sendKeys("test@test.com")
		AssignName.sendKeys("SeleniumBDD");
	}
	
@FindBy(xpath="//input[@id='assignmentDescription']")
WebElement assignDesc;

@FindBy(xpath="//input[@id='assignmentGraderId']")
WebElement assignGrade;

@FindBy(xpath="//input[@id='icon']")
WebElement assignduedate;

@FindBy(xpath="//button[@ng-reflect-label='Save']")
WebElement SaveAssign;

@FindBy (xpath="//button[@ng-reflect-label='Cancel']")
WebElement CancelAssign;

public void clickCancelAssign()
{
	CancelAssign.click();
	
}

public void clickSaveAssign()
{
	
SaveAssign.click();
	}
public void assignduedate()
{
	assignduedate.sendKeys("02/10/2022");}

public void Gradeinput()
{
assignGrade.sendKeys("A");
}

public void Descinput()
{
	assignDesc.sendKeys("learning");
}


	
	public boolean isPagintionTextPresent() {
        try {
            this. pageinatorText.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
	
	public boolean isFooterTextPresent() {
        try {
            this. footerText.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
	
	public boolean isSearchBarTextPresent() {
        try {
            this. Searchbartext.isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    
	}
	
	
	
	//table check box selected when clicked
	public void selectCheckbox()
	{
	// Selecting the check boxes by class name
	List<WebElement> checkbox = ldriver.findElements(By. className("p-checkbox-box p-component"));
	 
	       int Size = checkbox.size();    
	        // Finding the number of check boxes
	 
	        for(int i=0; i <= Size; i++)          // Starts the loop from first check box to the last one
	        {   
	String val = checkbox.get(i).getAttribute("value");
	// check box name stored to the string variable, using ‘Value' attribute
	 
	if (val.equalsIgnoreCase("p-checkbox-box p-component "))
	// equalsIgnoreCase is ignore case (upper/ lower)   
	    {       
	                 // Selecting the check box if its value is same as that we are looking for
	        checkbox.get(i).click();
	        break;
	     }
	   }

}
	public void chkPagesource()
	{
		if (ldriver.getPageSource().contains(" Manage Assignment"))
		{
			Assert.assertTrue(true);}
		else
			{
				Assert.assertTrue(false);
			}
	}
	
	public void chksortlist()
	{
		List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[2]"));
		List<Object> originalList=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<Object> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		System.out.println("Sorted successfully");
	}
	
	//sorting table values
	
	//Click on Column
	public void sort()
	{
		//Click on Column
		ldriver.findElement(By.xpath("//tr/th[2]")).click();
		//capture all web elements into list
		List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[2]"));
		//capture text of all webelements into new(original) list
		List<String> originalList=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on original list of step 3
		List<String> sortedList= originalList.stream().sorted().collect(Collectors.toList());
		
		//Compare the lists
		Assert.assertTrue(originalList.equals(sortedList));
		
	}
	
	public void Descendsort()
	{
		//Click on Column
		ldriver.findElement(By.xpath("//tr/th[2]")).click();
	
		//capture all web elements into list
		List<WebElement> elementlist = ldriver.findElements(By.xpath("//tr/td[2]"));
		//capture text of all webelements into new(original) list
		List<String> originalList=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
	
		//sort on original list of step 3
		List<String> sortedList= originalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		//Compare the lists
		Assert.assertFalse(originalList.equals(sortedList));
		
	}
	
	/*public void sortdata()
	{
	boolean flag = false;
	// List<WebElement> list = WebDriverFactory.getWebDriver().findElements(By.xpath(".//*[@id='paymentFormsTable']//tbody//tr"));
	 //int size = list.size();
	 String[] actual = new String[size]; 
	 String[] sorted = new String[size];

	 for (int i = 0; i < size; i++) 
	 {
	//    actual[i]=sorted[i] = WebDriverFactory.getWebDriver().findElement(By.xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i+ "]//td[starts-with(@id,'payment-forms-form-name')]")).getText();
	 }

	 //Sorting the array
	 Arrays.sort(sorted);

	 //Validating the existing with sorted array. shows no message if both are same
	 for(int i = 0;i<size;i++)
	 {
	     if(!actual[i].equals(sorted[i]))
	     {
	         System.out.println("The elements the webpage are not sorted");
	         System.out.println("expected "+sorted[i]+" but actual "+actual[i]+" at row "+i);
	         flag = true;
	     }
	 }
	}*/
}
