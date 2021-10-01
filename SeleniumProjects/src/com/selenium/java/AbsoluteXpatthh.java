package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpatthh {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dir.indiamart.com/impcat/led-television.html");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"Pos1\"]/div/div[2]/a")).click();
	}

}
