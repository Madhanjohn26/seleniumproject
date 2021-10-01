package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTestingg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("apple3@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Madhan");
		driver.findElement(By.id("customer_lastname")).sendKeys("John");
		//driver.findElement(By.id("email")).sendKeys("aroma@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Jack123");
		
		WebElement bDay = driver.findElement(By.id("days"));
		Select s = new Select(bDay);
		s.selectByValue("15");
		
		WebElement bMonth = driver.findElement(By.id("months"));
		Select s1 = new Select(bMonth);
		s1.selectByVisibleText("September ");
		
		WebElement bYear = driver.findElement(By.id("years"));
		Select s3 = new Select(bYear);
		s3.selectByValue("1986");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("firstname")).sendKeys("Madhan");
		driver.findElement(By.id("lastname")).sendKeys("John");
		driver.findElement(By.id("company")).sendKeys("Green");
		driver.findElement(By.name("address1")).sendKeys("South street");
		driver.findElement(By.name("address2")).sendKeys("12/75");
		driver.findElement(By.id("city")).sendKeys("Tirunelveli");
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4 = new Select(state);
		s4.selectByVisibleText("Arizona");
		driver.findElement(By.id("postcode")).sendKeys("902598078");
		WebElement country = driver.findElement(By.id("id_country"));
		Select s5 = new Select(country);
		s5.selectByVisibleText("United States");
		driver.findElement(By.id("other")).sendKeys("good");
		driver.findElement(By.name("phone")).sendKeys("6369980979");
		driver.findElement(By.id("phone_mobile")).sendKeys("6369980979");
		driver.findElement(By.name("alias")).sendKeys("oldpallavaram");
		driver.findElement(By.id("submitAccount")).click();
		
		
		
	}

}
