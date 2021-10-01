package com.selenium.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\eclipse-workspace\\SeleniumProjects\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		//to find out multiple dropdown
		WebElement multiplee = driver.findElement(By.id("multi-select"));
		
		Select s = new Select(multiplee);
		boolean multi = s.isMultiple();
		System.out.println("Is Multiple :"+multi);
		
		//to get all option
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}
			//size
			int size = options.size();
			System.out.println("Size : "+size);
			
			for (int i = 0; i <size; i++) {
				if (i==3 || i==7 || i==1) {
					s.selectByIndex(i);
					
				}
				
			}
			//get all selected option
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
			for (WebElement allselected : allSelectedOptions) {
				String text = allselected.getText();
				System.out.println(text);
			}
			
			//first selected
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
			
	}
}