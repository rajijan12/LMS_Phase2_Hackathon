package com.driver.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver =new ThreadLocal<>();

	public WebDriver init_driver()
	{
		tldriver.set(new ChromeDriver());
		return getDriver();
	
	}
	
	public static WebDriver getDriver()
	{
		
		return tldriver.get();
	}
	
}
