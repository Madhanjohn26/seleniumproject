package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frammm {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement frame = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame.click();
		WebElement firstFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(firstFrame);
		
		WebElement secondFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(secondFrame);
		
		
		WebElement value1 = driver.findElement(By.xpath("//input[@type='text']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(value1));
		
		value1.sendKeys("Tested");
		
		

		
		
	}

}
