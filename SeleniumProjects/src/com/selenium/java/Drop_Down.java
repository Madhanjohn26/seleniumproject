package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement crtBtn = driver.findElement(By.xpath("//a[@rel='async']"));
		crtBtn.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Madhan");
		driver.findElement(By.name("lastname")).sendKeys("ASdf");
		driver.findElement(By.name("reg_email__")).sendKeys("adkabka@gmail");
		driver.findElement(By.name("reg_passwd__")).sendKeys("shfj");
		
		WebElement bDay = driver.findElement(By.id("day"));
		Select s = new Select(bDay);
		s.selectByValue("15");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jun");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByValue("2000");
		
		WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		male.click();
	}

}
