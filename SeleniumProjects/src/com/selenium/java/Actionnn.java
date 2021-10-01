package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionnn {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		//Actions class
		Actions ac = new Actions(driver);
		WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_g'])[1]"));
		ac.contextClick(gmail).build().perform();
		
		//Robot class
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 driver.navigate().to("");
	}
	

}
