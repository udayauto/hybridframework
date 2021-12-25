package module4.advanced.elements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitibankWindow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\workspace\\maven\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.citi.com/");
		driver.findElement(By.xpath("//li[@id='navCreditCards']/citi-cta/a")).click();
		
		
		
	}

}
