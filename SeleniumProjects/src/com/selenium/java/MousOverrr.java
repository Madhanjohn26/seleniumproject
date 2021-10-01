package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousOverrr {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naamtamilar.org/");
		
		WebElement mousOver = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(mousOver).build().perform();
		
		
	}

}
