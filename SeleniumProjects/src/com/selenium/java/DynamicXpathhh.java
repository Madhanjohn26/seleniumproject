package com.selenium.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathhh {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/s?k=offer&ref=nb_sb_noss");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> all = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> prizelist = new ArrayList<>();
		
		try {
			for (int i = 0; i < all.size(); i++) {
				String prize = all.get(i).getText();
				System.out.println(prize);
				
			int parseInt = Integer.parseInt(prize);
			prizelist.add(parseInt);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(prizelist);
		
		System.out.println(prizelist.size());
		System.out.println(Collections.min(prizelist));
		driver.close();
	}

}
