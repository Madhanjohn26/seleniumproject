package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\SeleniumProjects\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
			
			List<WebElement> colums = driver.findElements(By.tagName("th"));
			int colcount=colums.size();
			System.out.println(colcount);
			List<WebElement> rows = driver.findElements(By.tagName("tr"));
			int rowcount=rows.size();
			System.out.println(rowcount);
			WebElement city = driver.findElement(By.xpath("//td[text()='A. Satou']//following::td[2]"));
			System.out.println(city.getText());
			
			 List<WebElement> age = driver.findElements(By.xpath("//td[4]"));
			 for (WebElement allage : age) {
				 String ag=allage.getText();
				 System.out.println(Integer.parseInt(ag));
				
			}
		}
}
