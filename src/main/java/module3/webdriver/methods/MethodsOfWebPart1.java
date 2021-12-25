package module3.webdriver.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsOfWebPart1 {

	public static void main(String[] args) {
		
		String expectedTitle = "selenium - Google Search";

		// One way -- System.setproperty --browser .exe file//path
		// path of file
		// Other way way - easy
		WebDriverManager.chromedriver().setup(); // Maven integration
		WebDriver driver = new ChromeDriver();

		// Step1: Open Google application
		driver.get("https://www.google.com/");
		
		//Step2: Search for any content - selenium
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
		// Step1: Open Google application
		//Step2: Search for any content - selenium
		//Step3: Verify PageTitle after Google search.
		//Verify: Ensure that the expected Title should be: selenium - Google Search. 
		
		String actualGoogleTitile = driver.getTitle();
		//validation
		if(actualGoogleTitile.equals(expectedTitle)) {
			System.out.println("PASS -- search is successful and tile does match");
		}else {
			System.out.println("Search is unsuccessful as Title doesn't match");
		}

     // getCurrentUrl -- Verify and ensure URL contains "selenium" keyword after successful search
	  String url = driver.getCurrentUrl();
		//verify
		if (url.contains("https://www.google.com/search?q=selenium")) {
			System.out.println("Pass -- Current URL does match the keyword search" + url);
		}else {
		System.out.println("Fail - search is no luck");
		}
		
	}

}
