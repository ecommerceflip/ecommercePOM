package com.ecommerce.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class DriverObject {
	
	public static WebDriver driver;
	public static final String SYSTEM_PATH = System.getProperty("user.dir");
	
	
	@BeforeSuite
	public void beforeSuite(){
		System.setProperty("webdriver.chrome.driver", SYSTEM_PATH + "//resources//chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	
	
}
