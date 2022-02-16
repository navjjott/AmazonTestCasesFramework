package com.amazon.qa.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.amazon.qa.base.TestBase;

public class WebEventListener extends TestBase implements  WebDriverEventListener{

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to"+ url + " ");
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After navigating to"+ url + " ");
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Trying to click on"+element.toString());
		
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After clicked on"+element.toString());
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
	      System.out.println("Value of the:"+ element.toString()+ "before any changes mode");
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		System.out.println("element value changed"+ element.toString());
		
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable error, WebDriver driver) {
	System.out.println("Exception occured:"+error);
	
	try
	{
		TestUtil.takeScreenshotAtEndOfTest();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("before get the text"+element.toString());
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After get the text"+element.toString());
		
	}

}
