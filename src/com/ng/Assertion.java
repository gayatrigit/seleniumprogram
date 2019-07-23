package com.ng;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
	WebDriver driver;
	@BeforeMethod
	public void  setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\MyProgram\\software\\jar\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void title()
	{
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "Google");
		// not matched
		//Assert.assertEquals(Title, "Google", "Title is nt matched");
	}
	@Test
	public void logo()
	{
		Boolean b=driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		//Assert.assertEquals(b,True)
	}
	
}


