package com.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OuterInnerFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("http://demo.guru99.com/test/guru99home/");
      driver.manage().window().maximize();
      // moving to the outer frame
     driver.switchTo().frame(0);
     System.out.println(driver.findElement(By.xpath("xpath")).getText()); 
     
	}

}
