package com.amazon.qa.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.KindleShoppingPage;
import com.amazon.qa.pages.VerifyPage;
import com.amazon.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	Logger log=Logger.getLogger(HomePageTest.class);
	HomePage homepage;
	KindleShoppingPage kindleshoppingpage;
	VerifyPage verifypage;
	TestUtil testutil;
	
	
	public HomePageTest() { super(); }
	
	//@Parameters({"browserName"})
	@BeforeTest
	public void setUp() {
		
		initialization();
		log.info("***********************Browserlaunching**********************");
		testutil = new TestUtil();
		homepage=new HomePage();
		
		  kindleshoppingpage= new KindleShoppingPage(); 
		  verifypage =new VerifyPage();
		
			homepage.ClickHamburgerMenu();
		    kindleshoppingpage=homepage.ClickEReaderKindle();
			verifypage=kindleshoppingpage.Button();
			//kindleshoppingpage.Button();
		 
		
	}
	
	@Test
	public void ValidateSignInText()
	{
	log.info("***********************Starting TestCases************************");	
	log.info("***********************AmazonTestCases************************");	
	String signintext=verifypage.getsignInText();
	log.info("Validation");
    Assert.assertEquals(signintext,"E-mail address or mobile phone number","Text does not matched");
   
    log.info("***********************Ending TestCases************************");	
	log.info("***********************AmazonTestCases************************");		
	}
	
	
	
	
	@AfterTest
	public void tearDown(){
		log.info("***********************Browser is closed**********************");
		driver.quit();
	}
	
	
	
	
	
	
	

}
