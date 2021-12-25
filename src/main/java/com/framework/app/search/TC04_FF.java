package com.framework.app.search;
import org.testng.annotations.Test;

import com.framework.function.core.BaseTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC04_FF extends BaseTest{
	
	@Test
	public void testFF(){
		
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	tearDown();
		
		//driver.quit();
		
		
	}

}
