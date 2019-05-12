package com.ecommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.driver.DriverObject;

public class SearchPage extends DriverObject{

	@FindBy (name = "q")
	public WebElement searchTextBox;
	
	@FindBy (xpath = "//button[@type='submit' and contains(@class, 'eN')]")
	public WebElement searchBTN;
	
	@FindBy (xpath = "(//a/descendant::div[contains(text(), 'Samsung')])[1]")
	public WebElement firstProductLNK;
	
	public SearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String productName) {
		searchTextBox.sendKeys(productName);
		searchBTN.click();
		firstProductLNK.click();
	}
	
	
}
