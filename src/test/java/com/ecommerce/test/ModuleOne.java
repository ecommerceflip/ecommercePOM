package com.ecommerce.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecommerce.driver.DriverObject;
import com.ecommerce.pages.LoginPage;
import com.ecommerce.pages.SearchPage;

public class ModuleOne extends DriverObject {

	private LoginPage loginPageObject;
	private SearchPage searchPageObject;

	@BeforeMethod
	public void beforeClass() {
		loginPageObject = new LoginPage();
		searchPageObject = new SearchPage();
	}

	@AfterMethod
	public void afterClass() {
		driver.quit();
	}

	@Test
	public void testcaseOne() {
		loginPageObject.loginIntoApp();
		searchPageObject.searchProduct("samsung");
	}

	@Test
	public void testcaseTwo() {
		
	}

}
