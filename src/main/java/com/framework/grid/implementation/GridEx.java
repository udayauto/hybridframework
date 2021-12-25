package com.framework.grid.implementation;
import org.testng.annotations.Test;

public class GridEx extends BaseClass{

	@Test
	public void getTitle() throws Exception {
		startBrowser("edge");
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}
