package com.selenium.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
	
		//property setting
		//key - driver name
		//value - driver path
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		//webdriver import
		//interface				//class
		WebDriver driver = new ChromeDriver(); 
		
		//driver method
		//get
		
		driver.get("https://www.cricbuzz.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate methods
		driver.navigate().to("https://www.amazon.in/");
		
		//back
		driver.navigate().back();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//forward
		driver.navigate().forward();
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//refresh
		driver.navigate().refresh();
		
		
		//close
		driver.close();
		
	}
	
}
