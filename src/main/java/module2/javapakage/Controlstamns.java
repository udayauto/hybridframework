package module2.javapakage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Controlstamns {
	
	
public static void main(String[] args) {
	
	int a =20;
	int b=10;
	
	// condition 
	if (a==b) {
		System.out.println("both are equal");
		
	}else 
		System.out.println(" they are not equal");
	
	
	// IF using selenium 
	// nested If
	
	String browser ="firefox";
	
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}else if (browser.equals("edge")){
		
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
	}else if (browser.equals("firefox")){
		
		System.out.println("Display firefox browser");
	}else
	{
		System.out.println("browser is not valid");
		
	}	

}
}
