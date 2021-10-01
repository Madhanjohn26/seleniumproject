package com.selenium.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllIcons {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	//	WebElement user = driver.findElement(By.id("username"));
		//WebElement pass = driver.findElement(By.id("password"));
		driver.close();
		
		
		/*WebElement SignIn= driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		SignIn.click();
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(SignIn);
		driver.findElement(By.id("createAccountSubmit")).click();
		*/
	/*	List<WebElement> icons = driver.findElements(By.xpath("//div[@id=\"nav-xshop\"]//following-sibling::a"));
		int size = icons.size();
		System.out.println(size);
		for (WebElement icon : icons) {
			System.out.println(icon.getText());
			System.out.println(icon.getAttribute("href"));
		}
		*/
		
	}

}
