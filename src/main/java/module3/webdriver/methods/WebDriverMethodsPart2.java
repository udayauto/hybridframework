package module3.webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsPart2 {
	
	public static void main(String[] args) {
		// open browser
		WebDriverManager.chromedriver().setup(); // Maven integration
		WebDriver driver = new ChromeDriver();
		// Step1: Open Google application
		driver.get("https://www.google.com/");
		//Step2: getpage source
		String pageSource = driver.getPageSource();		
		if(pageSource.contains("https://mail.google.com")) {
			System.out.println("Gmail content in place");
			
		}else
			System.out.println("fail");
	}

}
