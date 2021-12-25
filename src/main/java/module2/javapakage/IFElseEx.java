package module2.javapakage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFElseEx {
	
	public static void main(String[] args) {
		String expectedTitle = "Google";
		String actualTitle;
		//open browser
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Google application
		
		driver.get("https://www.google.com/");
		// getTitle from application
		
		actualTitle = driver.getTitle();
		
		// ensure that Title is Google.
	
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {// extact match
			System.out.println("PASS: Google Title does matches");
			
		}else {
			System.out.println("FAIL: Google Title doesn't match");
			System.out.println("expected Title : " + expectedTitle);
			System.out.println("actual Title : " + actualTitle);
		
		}
		
		
	/*	int a =10;
		int b=20;
		if(a==b) {
		
		System.out.println("they are equal");
	}else
	{
		System.out.println("they are not equal");
	}
		
	}*/
	}
	
	
	


}
