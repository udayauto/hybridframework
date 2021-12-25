package module1.webelements.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// CSS selector using ID (#)
		driver.get("https://www.amazon.com/");
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("laptops");
		
		// CSS using Class name(.)
		driver.findElement(By.cssSelector("input.nav-input[type=submit]")).click();
		//CSS Selector ClassName (.)
		
		// Methods --> isDislayed
		if (driver.findElement(By.cssSelector("a[aria-label=Amazon]")).isDisplayed()) 
		{
			// CSS using attribute 
			driver.findElement(By.cssSelector("a[aria-label=Amazon]")).click();
			System.out.println("Amazon Logo is found");
			
		}else {
			System.out.println("Amazon Logo is not found");
		}
		
		
	}
	
}
