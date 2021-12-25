package module1.webelements.locators;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameEx {

	public static void main(String[] args) {

		// web driver initialization
		WebDriver driver;
		String urlGoogle = "https://www.google.com/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\maven\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open google application
		driver.get(urlGoogle);

		// finding no# of links in web page
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Display count
		int count = links.size();
		System.out.println("number of LInks in Google page: " + count);

		
	  Iterator<WebElement> linkValues = links.iterator();
		
		while (linkValues.hasNext()) {
			
			
			System.out.println(linkValues.next().getText());
			
		}
		
		
		
		/*for (int i = 0; i < count; i++) {
		if(!links.get(i).getText().isEmpty()) {
			System.out.println("Link Name: " + links.get(i).getText());

		}*/
		//	System.out.println("Link Name: " + links.get(i).getAttribute("href"));
		
	//	}

	}

}
