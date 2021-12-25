package com.framework.function.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropReader {

	public static String readProperty(String constantName) {
		
		Properties prop = new Properties();
		InputStream fopen;
		String propValue = " ";

		try {
			fopen = new FileInputStream(new File(".\\src\\main\\resources\\config\\config.properties"));
			prop.load(fopen);
			propValue = prop.getProperty(constantName);

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("properties file is not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return propValue;
	}
}
