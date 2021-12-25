package com.framework.function.core;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import com.framework.testng.listerners.FrameworkListners;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver = null;

	// @BeforeTest
	public WebDriver startBrowser(String browser) {
		// String browser = PropReader.readProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			// ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless");
		//	System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\grid\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void tearDown() {
		

		String value = PropReader.readProperty("session");
		if (value.equalsIgnoreCase("true")) {

			driver.close();
		}
	}

	public void openApplication(String url) {
		driver.get(url);

	}

	public void openApplication() {
		String testURL = PropReader.readProperty("appURL");
		driver.get(testURL);

	}
	
	public void captureScreenshot() {
		
		Date dt = new Date();
		// highlight screenshot - use java script executor
		/*
		 * JavascriptExecutor js = ((JavascriptExecutor) driver);
		 * js.executeScript("arguments[0].style.border='3px solid red'", ele);
		 */
		TakesScreenshot capture = ((TakesScreenshot) driver);
		// capture screenshot
		File source = capture.getScreenshotAs(OutputType.FILE);
		// provide destination where screensot will be saved.
		String path = ".\\src\\main\\resources\\screenshot";
		File destFile = new File(path + dt.getDate() +"_" + "\\screenshot.png");
		try {
			FileUtils.copyFile(source, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
