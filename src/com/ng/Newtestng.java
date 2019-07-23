package com.ng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtestng {
	/* @BeforeSuite
	 *@BeforeTest
	 *@BeforeClass
	 *@BeforeMethod
	 *@test
	 *@AfterMethod
	 *@AfterClass
	 *@AfterTest
	 *@AfterSuite
	 
	 */
	
	@BeforeSuite
	public void setUp()
	{
	System.out.println("sestem property for set up");
	}
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("launch google chrome");
	}
	@BeforeClass
	public void loin()
	{
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter URL");
	}
	@Test
	public void googleTitletest()
	{
		System.out.println("google title test");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("logout from app");
	}
	@AfterClass
	public void classbrowser()
	{
		System.out.println("class browser");
	}
	@AfterTest
	public void deletecookies()
	{
		System.out.println("delete cookies");
	}
	
	@AfterSuite
	public void generatetestReport()
	{
		System.out.println("Generate test Report");
	}
	

}
