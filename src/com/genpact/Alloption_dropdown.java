package com.genpact;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Alloption_dropdown {
 
	

	public static <T> void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		    WebDriver driver = new ChromeDriver();
			driver.get(baseURL);
			

			Select dd = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			List<WebElement> ss=dd.getOptions();
			
			System.out.println(ss.size());
			// Get the ArrayList 
			ArrayList<String> countryList = new ArrayList<String>();
		
			for(int i=0; i<ss.size(); i++)
			{
				//System.out.println(ss.get(i).getText());			
				countryList.add(ss.get(i).getText());				
			}
			
			// Sorting ArrayList in ascending Order using Collection.sort() method 
	        Collections.sort(countryList); 
	        Collections.reverse(countryList);
	  
	        // Print the sorted ArrayList
	        for(int i=0;i<countryList.size();i++)
	        System.out.println("Sorted ArrayList in Ascending order : " +countryList.get(i)); 
	}

}
