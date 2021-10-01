package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestWork {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		for (int i = 1; i < 6; i=i+2) {
			
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
			
		for (int i = 3; i>=1; i=i-2) {
			for (int j = 1; j <=i; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		}
	}

