package com.framework.grid.implementation;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass {
	public WebDriver driver = null;

	public void startBrowser(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\grid\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// options.addArguments("--headless");
			options.setHeadless(true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);

		} else if (browser.equalsIgnoreCase("firefox")) {

			/*
			 * FirefoxOptions options = new FirefoxOptions();
			 * options.setCapability("browserName", "firefox");
			 * options.setCapability("platformName", "WIN10");
			 * options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			 */
			System.setProperty("webdriver.gecko.driver", "C:\\grid\\geckodriver.exe");
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), new FirefoxOptions());
			/*
			 * Options.setPlatformName("Windows 10"); Options.setCapability("browserName",
			 * "firefox"); Options.setBrowserVersion("91");
			 * Options.setAcceptInsecureCerts(true);
			 */

		} else if (browser.equalsIgnoreCase("edge")) {

			/*
			 * EdgeOptions options = new EdgeOptions(); options.setCapability("browserName",
			 * "edge"); options.setCapability("platformName", "WIN10");
			 */
			System.setProperty("webdriver.edge.driver", "C:\\grid\\msedgedriver.exe");
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());

		}
	}

}
