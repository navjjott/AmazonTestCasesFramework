package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class KindleShoppingPage extends TestBase {

	
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	WebElement buyNow_Button;
	
	
	
	//initializing the page objects
	public KindleShoppingPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//Click on buy now button
	public VerifyPage Button()
	{
		buyNow_Button.click();
		
		return new VerifyPage();
	}
	
	
	
	
	
}
