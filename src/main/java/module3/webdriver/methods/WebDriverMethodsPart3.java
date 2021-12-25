package module3.webdriver.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsPart3 {
	public static void main(String[] args) {
		// open browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// Step1: Open HRM application
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// click on forgot password link
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();

		// Navigation methods
		driver.navigate().back();
		driver.navigate().forward();
		// scenario - submit forgot password request
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnSearchValues']")).click();
		// go back to main page
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh(); // F5 key to refresh
	}

}
