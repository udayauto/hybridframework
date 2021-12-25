package com.framework.testng.listerners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.framework.function.core.BaseTest;
import com.framework.function.core.CaptureScreenshots;
import com.framework.function.core.FunctionLibrary;

public class FrameworkListners implements ITestListener{

@Override
public void onTestStart(ITestResult result) {
	
	System.out.println("Test case execution started ..");
	
}

@Override
public void onTestSuccess(ITestResult result) {
	
	System.out.println("Test case execution successfull ..");
	
}

@Override
public void onTestFailure(ITestResult result) {
	
	System.out.println("Test case execution failed ..");
	CaptureScreenshots.captureScreenshot();
}


}
