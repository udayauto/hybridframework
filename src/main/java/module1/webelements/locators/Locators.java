package module1.webelements.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		// declare 
		WebDriver driver;
		String urlGoogle = "https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(urlGoogle);
		
		// locator using Classname
		//driver.findElement(By.className("gb_f")).click();
		
		// navigation methods
		/*
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().back(); driver.navigate().refresh();
		 */
		
		// locator --Id
		
		//driver.findElement(By.id("identifierId")).sendKeys("test@gmail.com");
		
		// Name - Locator
		//driver.findElement(By.name("q")).sendKeys("SELENIUM TRAINING");
		
		// locator -- linktext
		driver.findElement(By.linkText("Gmail")).click();
		driver.navigate().back();
		
		
		// locator -- partiallinktext (dynamic element)
		
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.quit();
	}

}
