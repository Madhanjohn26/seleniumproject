package com.selenium.java;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerScreenshot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;//narrow
		File source =ts.getScreenshotAs(OutputType.FILE);
		//path
		File destination = new File("C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Screenshot\\email.png");
		//File Utils
		FileUtils.copyFile(source, destination);
		
	}

}
