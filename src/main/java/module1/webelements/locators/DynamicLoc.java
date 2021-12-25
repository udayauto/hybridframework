package module1.webelements.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoc {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// id -- dynamic
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(@id, 'u_0_2_')]")).click();


	}
}
