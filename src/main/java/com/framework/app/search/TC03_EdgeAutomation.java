package com.framework.app.search;

import org.testng.annotations.Test;

import com.framework.function.core.BaseTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TC03_EdgeAutomation extends BaseTest {
	
	@Test
	public void testEdge() {
		
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.edge.driver", "C:\\grid\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	tearDown();
		
		
	}

}
