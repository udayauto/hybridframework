package module2.javapakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IfElseSeleniumEx {

	public void startBrowser(String browserName) {

		String browser = browserName;
		// Open Chrome browser when the browser vaue is Chrome
		// Display that its not a valid browser

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome browser opened successfully");

			System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.com/");

		} else {
			System.out.println("browser is not valid");
		}

	}

	public static void main(String[] args) {

		IfElseSeleniumEx obj = new IfElseSeleniumEx();
		obj.startBrowser("edge");

	}
}