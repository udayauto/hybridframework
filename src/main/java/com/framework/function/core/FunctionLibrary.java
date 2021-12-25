package com.framework.function.core;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class FunctionLibrary{

	/**
	 * Contains generic functions deals with verifications and validations. it
	 * contains functions for waits and screen capture. functions for reading data
	 * from different sources like Excel, Properties and Java file. functions for
	 * Common Constants using Properties file.
	 * hanlding Alert
	 * handlingwindows
	 * switchWindow (getwndows)
	 * closewindow
	 * Mouse actions
	 * --hover
	 * double
	 * drag and drop
	 * slider
	 */

	  WebDriver driver;

// Constructor 
	  
	  public FunctionLibrary(WebDriver driver) 
	  { 
		  this.driver = driver; 
		  }
	 

	/**
	 * This method is to verify the title of a page.
	 * 
	 * @param expectedTitle
	 */
	public void verifyPageTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		/*
		 * if (actualTitle.equalsIgnoreCase(expectedTitle)) {
		 * 
		 * System.out.println("PASS: Title match is successful"); } else {
		 * System.out.println("Title match is not successful"); }
		 */
	}

	/**
	 * verify the expected content in page source
	 * 
	 * @param expectedSource
	 */
	public void verifyPageSource(String expectedSource) {
		String actualsource;
		applyPaddedwait();
		actualsource = driver.getPageSource();
		Assert.assertTrue(actualsource.contains(expectedSource)); // IF 
	}

	/**
	 * padded wait()
	 * 
	 * @param wait time unit
	 */

	public void applyPaddedwait() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * web driver wait
	 * 
	 * @param wait time unit
	 */

	public void waitUntilElementIsPresent() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void handlAlert() {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		System.out.println("alert has been handled and the text is:" + alertText);
	}

	
}
