package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolKitExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/08/tooltip-in-selenium-or-help-text-example.html");
		WebElement findxpath = driver.findElement(By.cssSelector("div.tooltip"));
		Actions ac = new Actions(driver);
		ac.moveToElement(findxpath).perform();
		WebElement tool = driver.findElement(By.xpath("//span[@class='tooltiptext']"));
		System.out.println(tool .getText());
	}
	
	

}
