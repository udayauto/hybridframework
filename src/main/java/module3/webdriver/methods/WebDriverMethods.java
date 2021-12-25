package module3.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverMethods {

	@Test
	public void testChrome() {
		String URL = "https://www.google.com/";
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(URL);
		//getPageSource
		String sourceGoogle = driver.getPageSource();
		System.out.println(sourceGoogle);
		if (sourceGoogle.contains("Gmail")) {
			System.out.println("Pass: " + "source contains Gmail");
		} else {
			System.out.println("fail");
		}

		driver.quit();

	}

}
