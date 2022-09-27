package AppHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.driver.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
		
		
		@Before
		public void launchBrowser()
		{
			driverFactory=new DriverFactory();
			driver=driverFactory.init_driver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			
		}
		
	@After
		public void quitBrowser()
		{
			driver.quit();
		}
		
		
	

}
