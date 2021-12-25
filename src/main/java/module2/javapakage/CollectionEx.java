package module2.javapakage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionEx {
	public static void main(String[] args) {
		// browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\maven\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		// get values from drop-down //collection

		List<WebElement> monthList = driver.findElements(By.xpath("//select[@id='month']/option"));
		int count = monthList.size();

		System.out.println("month values count: " + count);

		// getText from the drop down values
		for (int i = 0; i < count; i++) {
			String monthNames = monthList.get(i).getText();

			System.out.println(monthNames);
			
			if (monthNames.contains("Dec")) {
				System.out.println("Dec is available");
			}
		}
	// webpage -- how can find no of links, input, button on the page -// tagname - List 
		
	}
}
