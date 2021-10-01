package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolllll {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//scroll to Element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement eleScroll = driver.findElement(By.xpath("(//span[@class='a-color-base'])[5]"));
		js.executeScript("arguments[0].scrollIntoView();", eleScroll);
		
		//XY axis
		js.executeScript("window.scrollBy(0,1000)");
				
		//end of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		
		
	}

}
