package com.ng;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
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
	System.out.println("before suit ----sestem property for set up");
	}
	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("Before test---launch google chrome");
	}
	@BeforeClass(alwaysRun=true)
	public void loin()
	{
		System.out.println("before class---login to app");
	}
	
	@BeforeMethod
	public void enterURL()
	{
		System.out.println("before method---enter URL");
	}
	@Test
	public void googleTitletest()
	{
		System.out.println("test1---google title test");
	}
	@Test
	public void googleTitletest1()
	{
		System.out.println("test2---google title test");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("After method---logout from app");
	}
	@AfterClass(alwaysRun=true)
	public void classbrowser()
	{
		System.out.println("After class---class browser");
	}
	@AfterTest
	public void deletecookies()
	{
		System.out.println("After test---delete cookies");
	}
	
	@AfterSuite
	public void generatetestReport()
	{
		System.out.println("After suite---Generate test Report");
	}
	

}
