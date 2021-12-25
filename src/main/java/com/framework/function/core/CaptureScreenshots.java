package com.framework.function.core;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshots{
	
	public static void captureScreenshot() {
	Date dt = new Date();
	// highlight screenshot - use java script executor
	/*
	 * JavascriptExecutor js = ((JavascriptExecutor) driver);
	 * js.executeScript("arguments[0].style.border='3px solid red'", ele);
	 */
	TakesScreenshot capture = ((TakesScreenshot) BaseTest.driver);
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
