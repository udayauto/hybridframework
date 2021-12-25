package com.framework.app.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.function.core.FunctionLibrary;

public class HomePage{
	
	public HomePage(WebDriver driver) { //constructor
		PageFactory.initElements(driver, this);
	}
	
	 //Home page objects - Locators --------------------define
	
	  @FindBy(name="q") // locate google Search box.
	  WebElement textBoxGooleSearch;

	  @FindBy(name="btnK")   //locate google search button
	  WebElement buttonSearch;
	  
	/*
	 * @FindBy(id="q") // locate google Search box. WebElement textBoxGooleSearch;
	 */
	 
	  String keyword = "sai";
	  
	  //functions ---specific to application
	  public void googleSearch(String keyword) {
		  textBoxGooleSearch.sendKeys(keyword);
		  buttonSearch.click();
		}

	
	/*
	 * //login public void Login(String userName, String Password) {
	 * textBoxSearch.sendKeys(userName); buttonSearch.click(); }
	 */
	/*
	 * public By searchbox = By.name("q"); public By searchButton = By.name("btnK");
	 */
	/*
	 * public void googleSearch(String keyword) {
	 * driver.findElement(searchbox).sendKeys(keyword);
	 * driver.findElement(searchButton).click(); }
	 */
}
