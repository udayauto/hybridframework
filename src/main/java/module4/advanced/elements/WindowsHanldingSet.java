package module4.advanced.elements;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHanldingSet {

	public static void main(String[] args) {

		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Test case
		// Open some applciation

		driver.get("https://www.officedepot.com/");

		// click on credit cards link
		driver.findElement(By.xpath(
				"//div[@class='od-col od-col-gutter']//a[@class='od-menu-link'][normalize-space()='Credit Cards']"))
				.click();

		// Clik on Buiness Account Credit Apply now button
		driver.findElement(By.xpath(
				"//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']"))
				.click();

		// New tab

		String mainWindow = driver.getWindowHandle();

		System.out.println("main Window name is: " + mainWindow);

		Set<String> windows = driver.getWindowHandles();

		System.out.println("number of windows count" + windows.size());
		System.out.println(windows);

		// Switch to new window

		// iterator ---for // get some value from collection ---Next
		Iterator<String> allwindows = windows.iterator();

		String parentWindow = allwindows.next();
		String childWindow = allwindows.next();

		// Switch to Child window
		driver.switchTo().window(childWindow);

		// GetURL
		String URL = driver.getCurrentUrl();
		System.out.println("Url of new window is: " + URL);
		
		if (URL.contains("https://citiretailservices.citibankonline.com")) {
			System.out.println("URL contains citibank");
		}else
		{
			System.out.println("URL doesn't contain citibank");
		}
		// Close the child window
		driver.close();

		// Switch back to Main window
		
		driver.switchTo().window(parentWindow);
		// close browser
		driver.close();

	}

}
