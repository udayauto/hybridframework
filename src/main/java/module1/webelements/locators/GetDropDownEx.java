package module1.webelements.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDropDownEx {

	public static void main(String[] args) {

// open browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\maven\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// open facebook
		driver.get("https://www.facebook.com/");

		// Click on Crete new acount button
		driver.findElement(By.linkText("Create New Account")).click();

		// get values from dropdwon

		List<WebElement> list = driver.findElements(By.xpath("//select[@id='month']/option"));
		int count = list.size();
		
		System.out.println("count is : " + count );
		
		// Display values
		for (int i = 0; i < count; i++) {
			System.out.println(list.get(i).getText());

		}
		

		
	}

}
