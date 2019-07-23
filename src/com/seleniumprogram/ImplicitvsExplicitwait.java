package com.seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitvsExplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement firstname =driver.findElement(By.name("firstname"));
		WebElement lastname =driver.findElement(By.name("laststname"));
		WebElement mobileno=driver.findElement(By.name("reg_email"));
		
		sendKeysMyMethod(driver,firstname,10,"gayatri");
		sendKeysMyMethod(driver,lastname,5,"charchi");
		sendKeysMyMethod(driver,mobileno,5,"9686590097");

	}
	public static void sendKeysMyMethod(WebDriver driver,WebElement element,int timeout, String value){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
		
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	

}
