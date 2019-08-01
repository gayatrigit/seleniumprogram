package com.seleniumprogram;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.naukri.com/");

	    //Get the address of main window
	    String p = driver.getWindowHandle();

	    //get address of all windows
	    Set<String> allWH = driver.getWindowHandles();

	    //get address of all windows and store it in ArrayList
	    ArrayList<String> allWHCopy = new ArrayList<String>(allWH);

	    //close the 2nd window
	    for(int i=0;i<allWHCopy.size();i++)
	    {
	        if(i==1)
	        {
	            driver.switchTo().window(allWHCopy.get(i));
	            driver.close();
	        }
	    }

	    //To switch to main window
	    driver.switchTo().window(p);
	    //driver.switchTo().defaultContent();

	    //perform action in main window

	}

}
