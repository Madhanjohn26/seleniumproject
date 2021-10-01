package com.selenium.java;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTabl {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		/*
		 * driver.manage().window().maximize();
		 * 
		 * //All Data
		 * 
		 * List<WebElement> allData =
		 * driver.findElements(By.xpath("//table/tbody/tr/td")); for (WebElement all :
		 * allData) {
		 * 
		 * System.out.print(all.getText()); }
		 */
		
		//Row Data
		//driver.findElements(By.xpath("//table/tbody/tr[2/t"));
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
		Map<String,Integer> li = new LinkedHashMap<String, Integer>();
		
		for (WebElement kword : alldata) {
			String text = kword.getText();
			if (li.containsKey(text)) {
				//int i = li.get(text);
				int i=0;
				i=li.get(text);
				li.put(text, i+1);
			}
			else {
				li.put(text, 1);
			}
			
		}
	System.out.println(li);
	
	}
}
