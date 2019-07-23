package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	      
	       // find element using frame id
	       /*driver.switchTo().frame("a077aa5e");
	       driver.findElement(By.xpath("html/body/a/img")).click();*/
	       
	       // finding all the frame elements from a webpage
	       int size=driver.findElements(By.tagName("iframe")).size();
	       System.out.println(size);
	       // finding frame through webelement
	       for(int i=0; i<size; i++)
	       {
	    	   driver.switchTo().frame(i);
	    	   int total=driver.findElements(By.xpath("html/body/a/img")).size();
	    	   System.out.println(total);
	    	   //moving back to most parent frame
	    	   //driver.switchTo().defaultContent();
	    	   
	    	   //moving back to the recent parent frame
	    	   driver.switchTo().parentFrame();
	       } 
	       
	}

}
