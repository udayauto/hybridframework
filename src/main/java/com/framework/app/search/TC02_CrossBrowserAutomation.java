package com.framework.app.search;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC02_CrossBrowserAutomation {

	@Test
	public void edge() {
		WebDriver driver;
		String URL = "https://www.google.com/";
		String userDirPath = System.getProperty("user.dir");
		// Edge browser
		System.setProperty("webdriver.edge.driver", userDirPath + "\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get(URL);
		driver.close();

	}

	@Test
	public void chrome() {
		WebDriver driver;
		String URL = "https://www.google.com/";
	//	String userDirPath = System.getProperty("user.dir");

		// Chrome
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		driver.close();
	}

	@Test
	public void ff() {
		WebDriver d2;

// FireFox
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		d2 = new FirefoxDriver();
		d2.get("https://www.google.com/");
//Thread.sleep(10000);
		d2.close();

		/*
		 * System.out.println("user.dir: " + System.getProperty("user.dir"));
		 * 
		 * // Fetches the property set with 'home' key System.out.println("home: " +
		 * System.getProperty("home")); // Resulting in Null as no property is present
		 * 
		 * // Printing 'name of Operating System' System.out.println("os.name: " +
		 * System.getProperty("os.name"));
		 * 
		 * // Printing 'JAVA Runtime version' System.out.println("version: " +
		 * System.getProperty("java.runtime.version"));
		 * 
		 * // Printing 'name' property System.out.println("name: " +
		 * System.getProperty("name")); // Resulting in Null as no property is present
		 */
	}
}
