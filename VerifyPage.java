package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class VerifyPage extends TestBase {
	
	public  String text;
	@FindBy(xpath="//div[@class='a-row a-spacing-base']//label[contains(text(),'E-mail')]")
	WebElement verifyText;
	
	
	// Initializing the Page Objects:
		public VerifyPage() {
			PageFactory.initElements(driver, this);
		}
		
	public String getsignInText()
	{
		return verifyText.getText();
		
	}
	
	public boolean ValidateText()
	{
		return verifyText.isDisplayed();
		
		
	}

}
