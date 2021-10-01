package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch1 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		//web Element methond
		
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("Test@gmail.com");
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("12345@#&");
		
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();
		
		
	}

}
