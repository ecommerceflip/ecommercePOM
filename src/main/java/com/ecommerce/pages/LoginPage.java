package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.driver.DriverObject;

public class LoginPage extends DriverObject{
	
	@FindBy (xpath = "//input[contains(@class, 'pKA')]")
	public WebElement usernameTXT;
	
	@FindBy (xpath = "(//input[contains(@class, 'pKA')])[2]")
	public WebElement passwordTXT;
	
	@FindBy (xpath = "(//span[text()='Login'])[last()]")
	public WebElement loginBTN;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void loginIntoApp() {
		usernameTXT.sendKeys("9603255059");
		passwordTXT.sendKeys("987654321");
		loginBTN.click();
	}
	
	public void loginIntoApp(String username, String password) {
		usernameTXT.sendKeys(username);
		passwordTXT.sendKeys(password);
		loginBTN.click();
	}
	

}
