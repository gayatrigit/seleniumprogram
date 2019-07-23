package com.ng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeMethod
	public void launchbrwser()
	{
	
	String driverpath="D:\\MyProgram\\software\\jar\\geckodriver.exe";
	
	System.out.println("launching firefox");
	System.setProperty("webdriver.gecko.driver", driverpath);
	driver=new FirefoxDriver();
	}
	
	
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/newtours/");
	  String expectedresult="Welcome: Mercury Tours";
	  String actualressult=driver.getTitle();
	  Assert.assertEquals(actualressult, expectedresult);
  }
}
