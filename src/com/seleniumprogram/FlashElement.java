package com.seleniumprogram;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//javaScriptExecutor is a class & we have to cast our driver to javascript executor
//executeScript method is used to execute javascript code

public class FlashElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
		flash(login,driver);
		System.out.println("color changed");
	}
	public static void flash(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String bgcolor=element.getCssValue("backgroundcolor");
		for(int i=0;i<5;i++)
		{
			changecolor("rgb(0,100,0)",element,driver);
			changecolor(bgcolor,element,driver);
		}
	}
	public static void changecolor(String color,WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'",element);
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
		}
		}
	}

	
