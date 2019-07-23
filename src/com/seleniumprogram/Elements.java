package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		//Men's Outerwear
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Men's Outerwear')]")).click();

	}

}
