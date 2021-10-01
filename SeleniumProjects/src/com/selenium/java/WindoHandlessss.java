package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandlessss {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		
		driver.manage().window().maximize();
		
		WebElement gro = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(gro).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fah = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(fah).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement idono = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(idono).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//to get all the title of the window
		
		Set<String> allIds = driver.getWindowHandles();
		for (String eachId : allIds) {
			String title = driver.switchTo().window(eachId).getTitle();
			System.out.println(title);
		}
		
		
		//actual window tilte
		String actualWindow = "Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
		for (String eachIds : allIds) {
			if (driver.switchTo().window(eachIds).getTitle().equals(actualWindow)) {
				break;
			}
			
		}
		
		Thread.sleep(4000);
		
		driver.quit();
	}

}
