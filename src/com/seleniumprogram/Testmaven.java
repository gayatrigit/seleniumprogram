package com.seleniumprogram;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testmaven {
	@BeforeMethod
	public void method1(){
		System.out.println("execute befre methd");
	}
	
	@AfterMethod
	public void method2(){
		System.out.println("execute after methd");
	}
	
	@BeforeSuite
	public void method3(){
		System.out.println("execute befre suite");
	}
	
	@AfterSuite
	public void method4(){
		System.out.println("execute after suite");
	}
	
	@BeforeTest
	public void method5(){
		System.out.println("execute befre test");
	}
	
	
	@AfterTest
	public void method6(){
		System.out.println("execute after test");
	}
	
	
	@Test(priority = 2)
	public void method7(){
		System.out.println("execute main methd");
	}
	
	@Test(priority = 1)
	public void method8(){
		System.out.println("execute main methd tw");
	}
	
	@BeforeClass
	public void method10(){
		System.out.println("execute befre class");
	}
	
	@AfterClass
	public void method9(){
		System.out.println("execute after class");
	}


}

