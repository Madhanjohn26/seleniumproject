package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreeShott {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.redbus.in/");
		
	//	WebElement email_Id = driver.findElement(By.id("src"));
	//	email_Id.sendKeys("madhanjohntamilarasan@gamil.com");
		
	//	WebElement pass = driver.findElement(By.id("dest"));
	//	pass.sendKeys("Jackson");
		
		
	//	driver.navigate().to("https://www.google.com/");
	//	WebElement enterText = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	//	enterText.sendKeys("Green Technology");
	
		//driver.navigate().to("https://www.lvbankonline.in/index.html?module=login");
		//WebElement lax = driver.findElement(By.id("login_username|input"));
		//lax.sendKeys("Madhanjohn");
		
		//WebElement laxpass = driver.findElement(By.id("login_password|input"));
		//laxpass.sendKeys("madhanjohn");
		
	//	driver.navigate().to("https://twitter.com/login");
	//	driver.findElement(By.name("session[username_or_email]")).sendKeys("jack");
	//	driver.findElement(By.name("session[password]")).sendKeys("rose");
		
	//	driver.navigate().to("https://netbanking.hdfcbank.com/");
	//	driver.findElement(By.name("fldLoginUserId")).sendKeys("404489");
		
	//	driver.navigate().to("https://www.swiggy.com/");
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter ')]")).sendKeys("Pallavaram");;
		
	//	driver.navigate().to("https://www.snapdeal.com/login");
	//	driver.findElement(By.id("userName")).sendKeys("Madhan@gmail.com");
		
	//	driver.navigate().to("https://www.instagram.com/accounts/login/");
	//	driver.findElement(By.xpath("//input[contains(@aria-label,'Phone')]")).sendKeys("Madhan@gmail.com");
		
	//	driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	//	driver.findElement(By.xpath("//input[contains(@aria-autocomplete,'list')]"));
		
	//	driver.navigate().to("https://adactinhotelapp.com/");
	//	driver.findElement(By.id("username")).sendKeys("Madhan@gamil.com");
	//	driver.findElement(By.id("password")).sendKeys("jairo");
		
		Thread.sleep(2000);
		driver.close();

}
}
