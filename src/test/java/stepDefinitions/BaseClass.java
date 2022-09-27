package stepDefinitions;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import com.lms.utilities.ReadConfig;
public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String url= readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password =readconfig.getPassword();
	
	
	
	


public void CaptureScreen(WebDriver driver, String name) throws IOException {
	
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
	File destinationFile=new File("/Users/raji/eclipse-workspace/DSAlgoproject/screenshots/"+name+".png");
	FileHandler.copy(sourceFile, destinationFile);
	System.out.println("Screenshot taken");
}

}

