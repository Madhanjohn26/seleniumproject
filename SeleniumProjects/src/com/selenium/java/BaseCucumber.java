package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.OutputType;

public class BaseCucumber {
	
	protected static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		
		
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
			}else if (browsername.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.getko.driver", System.getProperty("user.dir"+"//Driver//chromedriver.exe"));
				driver = new FirefoxDriver();
			
			}else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
		public static void navigateto(String url) {
			try {
				driver.navigate().to(url);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		public static void navigateback() {
			driver.navigate().back();
		}
		
		public static  void navigateforward() {
			driver.navigate().forward();
		}
		
		private void navigaterefresh() {
			driver.navigate().refresh();
		}
		
		public static void getLink(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public static void gettitle() {
			driver.getTitle();

		}
		
		public static void dropdownSelection(WebElement element, String option, String input) {
			
			try {
				Select s = new Select(element);
				if (option.equals("index")) {
					int parseInt = Integer.parseInt(input);
					s.selectByIndex(parseInt);
					
				}else if (option.equals("value")) {
					s.selectByValue(input);
					
				}else if (option.equals("text")) {
					s.selectByVisibleText(input);
					
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void inputtext(WebElement element,String inputvalue) {
			element.sendKeys(inputvalue);

		}
		public static void isEnabled(WebElement element) {
			try {
				element.isEnabled();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void promptalert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		public static void quit() {
			try {
				driver.quit();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void action(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).build().perform();
		}
		
		public static void frames(WebElement iframe) {
			try {
				iframe.click();
				driver.switchTo().frame(0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void takesnap(String path) {
			
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File des = new File(path);
				FileUtils.copyFile(src, des);
			} catch (WebDriverException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public static void isSelected(WebElement element) {
			try {
				element.isSelected();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void simplealert() {
			try {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		public static void robot() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static  void implicitwait() {
			try {
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public static void expli(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void Close() {
			try {
				driver.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void getCurrentUrl() {
			try {
				System.out.println(driver.getCurrentUrl());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void dragdrop(WebElement drag, WebElement drop) {
			try {
				Actions ac = new Actions(driver);
				ac.dragAndDrop(drag, drop).build().perform();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void windhowhandle() {
			try {
				driver.getWindowHandle();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void windhowhandles() {
			try {
				driver.getWindowHandles();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void getSelected(WebElement element) {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
		
		
}
