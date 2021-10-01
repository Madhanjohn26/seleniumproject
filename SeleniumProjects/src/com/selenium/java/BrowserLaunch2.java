package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//contains
		WebElement findElement = driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]"));
		findElement.sendKeys("MadhanJohntamilarasan@gmail.com");
		
		//Basic xpath
		WebElement findElement2 = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		findElement2.sendKeys("Jegan369");
		
		//to find the index[1 of 1]
		WebElement findElement3 = driver.findElement(By.xpath("(//a[contains(@role,'button')])[2]"));
		Thread.sleep(4000);
		findElement3.click();
		Thread.sleep(4000);
		driver.close();
	}
	

}
