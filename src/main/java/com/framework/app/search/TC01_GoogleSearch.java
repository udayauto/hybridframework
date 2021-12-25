package com.framework.app.search;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.app.pages.HomePage;
import com.framework.function.core.BaseTest;
import com.framework.function.core.FunctionLibrary;

public class TC01_GoogleSearch extends BaseTest{
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("Step1: initialize browser");
		startBrowser("chrome");
	}
	
	@Test
	public void verifyGoogleSearch() {
		FunctionLibrary lib = new FunctionLibrary(driver);
		HomePage homePage = new HomePage(driver);
		
		String expectedTitle = "selenium - Google Search";
		
		System.out.println("Step2: Open application");
		openApplication("https://www.google.com/");
		
	//	openApplication();
		
		// verifying source
		String expectedValue="Gmail";
		lib.verifyPageSource(expectedValue);
		
		
		// Google search
		System.out.println("Step3: perfrom google search");
		homePage.googleSearch("sai");
		
		//step: verifyTitle
		System.out.println("Step4: verify page tile and ensure search is successful");
		lib.verifyPageTitle(expectedTitle);
		
		//lib.handlAlert();
	
	
	}
	
	  @AfterMethod
	  public void closeSession() {
		  tearDown(); 
		  }	
}
