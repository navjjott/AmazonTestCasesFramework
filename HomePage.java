package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	//Page Factory - OR:
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	WebElement hamburger;
	
	@FindBy(xpath="//a[@class='hmenu-item']//div[contains(text(),'Kindle')]")
	WebElement kindleItem;
	
	
	@FindBy(xpath="//a[text()='Kindle']")
	WebElement kindleEReader;
	
	

	
	//initializing the page objects
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}
	
	//Click on hamburger menu
	public void ClickHamburgerMenu()
	{
		hamburger.click();
		
		ClickKindleItem();
	}
	
	//Click on Kindle item under digital contents and devices
	public void ClickKindleItem()
	{
		wait.until(ExpectedConditions.elementToBeClickable(kindleItem));
		kindleItem.click();
		
	}
	
	//Click on Kindle Item under E-Reader
	public KindleShoppingPage ClickEReaderKindle()
	{
		
		kindleEReader.click();
		return new KindleShoppingPage();
	}
	

	
	
	
	
	
	
	
	

}
