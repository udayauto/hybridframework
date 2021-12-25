package module1.webelements.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCSSSelector {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// Dynamic CSS using starts-with (^)
		driver.findElement(By.cssSelector("a[id^=u_0_2_]")).click();
		
		
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();
		
		// Dynamic CSS using starts-with ($)
		driver.findElement(By.cssSelector("a[data-testid$=form-button]")).click();
		
		
		// Dynamic CSS using contains (*)
		driver.findElement(By.cssSelector("a[id*=u_0_2_]")).click();
		driver.findElement(By.cssSelector("a[data-testid*=form-button]")).click();
		
		
	}

}
