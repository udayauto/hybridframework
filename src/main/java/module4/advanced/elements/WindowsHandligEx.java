package module4.advanced.elements;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandligEx {

	public static void main(String[] args) throws InterruptedException {

		String expectedCCPageTitle = "Compare Credit Cards";

		// open application
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Sync
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open application
		driver.get("https://www.officedepot.com/");

		// click on Credit cards link
		driver.findElement(By.linkText("Credit Cards")).click();

		String actualCCTitle = driver.findElement(By.xpath("//h1")).getText();

		// verify header of CC page
		if (expectedCCPageTitle.equalsIgnoreCase(actualCCTitle)) {
			System.out.println("Both are equal");
			
		}else {
			System.out.println("they ar not equal");
		}

		// click on button called - Apply now
		driver.findElement(By.xpath(
				"//a[@href='https://www.officedepot.com/business-credit-account-apply?cm_sp=credit_promotions-_-BUSINESS-ACCOUNT_apply-now_-_-&promo_name=credit_promotions&promo_id=credit_promotions-BUSINESS-ACCOUNT-apply-now&promo_creative=BUSINESS-ACCOUNT_apply-now'][normalize-space()='Apply Now']"))
				.click();

		// get parent window name
		String parentWindowId = driver.getWindowHandle();
		System.out.println("parent Window name: " + parentWindowId);

		// Get all winowds names-
		Set<String> allWindows = driver.getWindowHandles();
		int windowsCount = allWindows.size();

		System.out.println("windows Count: " + windowsCount);
		System.out.println("all Windows" + allWindows);

		// Convert the Set values into List
		List<String> windows = new ArrayList<String>(allWindows);

		// Switch to Child window.
		driver.switchTo().window(windows.get(1));
		String citbackURL = driver.getCurrentUrl();

		// verify URL contains "citibankonline.com"

		if (citbackURL.contains("https://citiretailservices.citibankonline.com/")) {

			System.out.println("Pass : Url contains citibank");

		} else

		{
			System.out.println("fail" + "url doesn not contain citibank");
		}

		// Close child window.
		driver.close();

		driver.switchTo().window(windows.get(0)); // switch to parent window.
		Thread.sleep(3000);
		driver.close();

	}

}
