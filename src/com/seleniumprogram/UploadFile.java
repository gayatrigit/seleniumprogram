package com.seleniumprogram;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class UploadFile {
	public static void test() throws IOException, InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://www.tinyupload.com/");
	driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
	Thread.sleep(3000);
	//call to Autoit
	Runtime.getRuntime().exec("D:\\MyProgram\\software\\autoIt\\FileUpload.exe");
	driver.findElement(By.xpath("//td[contains(text(),'File to upload :')]")).click();
	
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
test();
	}

}
