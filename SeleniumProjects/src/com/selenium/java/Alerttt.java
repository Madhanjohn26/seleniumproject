package com.selenium.java;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttt {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		//simple Alert
		WebElement altBtn = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		altBtn.click();
		Alert selectt = driver.switchTo().alert();
		selectt.accept();
		
		//confirm alert
		
		WebElement confoale = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		confoale.click();
		WebElement cofmalert = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		cofmalert.click();
		Alert calert = driver.switchTo().alert();
		calert.accept();
		
		//prompt alert
		WebElement promt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		promt.click();
		WebElement promt1 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		promt1.click();
		Thread.sleep(2000);
		Alert promtalert = driver.switchTo().alert();
		promtalert.sendKeys("Madhan");
		promtalert.accept();
		

	}
}