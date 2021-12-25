package module2.javapakage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ListExample {
	
	public static void main(String[] args) {
		
		// open face book
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		// Go to Create account page
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		// Get month dropdown values 
		
		// List - data type
	
		List<WebElement> values = driver.findElements(By.xpath("//select[@id='month']/option"));
			
		System.out.println("count of the values: " + values.size());
		
		System.out.println(values);
		
		
		
	}

}
