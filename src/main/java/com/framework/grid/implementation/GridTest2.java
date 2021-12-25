package com.framework.grid.implementation;
import org.testng.annotations.Test;

public class GridTest2 extends BaseClass{

	@Test
	public void verifylogo() throws Exception {
		startBrowser("chrome");
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}
