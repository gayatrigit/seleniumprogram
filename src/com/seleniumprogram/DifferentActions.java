package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentActions {
		

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\MyProgram\\software\\jar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	
//Right click
	
	

	
	Actions action = new Actions(driver);

	WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
	
	// Right click the button to launch right click menu options
	action.contextClick(link).perform();
	
	//double click
	action.doubleClick(link).perform();
	
	//MouseHover
	action.moveToElement(link).build().perform();
	
	// moving up
	
	

	}

}
