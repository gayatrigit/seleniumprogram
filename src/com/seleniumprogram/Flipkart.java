package com.seleniumprogram;

import java.io.File;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Flipkart {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// opening chrome
		System.setProperty("webdriver.chrome.driver", "D:\\MyProgram\\software\\jar\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<WebElement> lis=driver.findElements(By.xpath("//*"));
		int i=lis.size();
		String s=lis.get(1).getText();
		System.out.println(s);
		
		// Mouse hover action by tapping on Electronics section
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(10000);

		Actions act=new Actions(driver);
		//WebElement electronics=driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).build().perform();
		Thread.sleep(3000);
		System.out.println("go to electronics");
		Thread.sleep(5000);
		WebElement oppo=driver.findElement(By.xpath("//li[@class='_1KCOnI _3ZgIXy']//a[contains(text(),'OPPO')]"));
		////li[@class='_1KCOnI _3ZgIXy']//a[contains(text(),'OPPO')]
	    Thread.sleep(5000);
		act.moveToElement(oppo).click().perform();
		System.out.println("Go to oppo");
		
		// Scroll till the element found
		JavascriptExecutor Js=(JavascriptExecutor)driver;
	
		System.out.println("thread1");
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("//a[contains(text(),'OPPO A83 (2018 Edition) (Red, 64 GB)')]"));
		System.out.println("thread2");
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy("+x1+","+y1+")");
		j.executeScript("window.scrollBy(0,-100)");
		Thread.sleep(3000);
		//Js.executeScript("arguments[0].scrollIntoView();", e1);
	    System.out.println("scroll till element found");
	   
	
	    e1.click();
	    System.out.println("clicked");
	    
	    // moving to child window
	    
	    String Parentwindow=driver.getWindowHandle();
	    
	    Set<String> allwindow=driver.getWindowHandles();
	    Iterator<String> i1= allwindow.iterator();
	    
	    while(i1.hasNext())
	    {
	    	String Childwindow= i1.next();
	    	if(!Parentwindow.equalsIgnoreCase(Childwindow))
	    	{
	    		driver.switchTo().window(Childwindow);
	    		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK'] ")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//img[@class='_1e_EAo']")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//div[@class='_2dcihZ']")).isDisplayed();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//span[contains(text(),'Cart')] ")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//span[contains(text(),'Place Order')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).click();
	    		driver.findElement(By.xpath("//input[@class='_2zrpKA _14H79F']")).sendKeys("9686590097");
	    		driver.findElement(By.xpath("//span[contains(text(),'CONTINUE')]")).click();
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _14H79F']")).click(); 
	    		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _14H79F']")).sendKeys("flipkart@123");
	    		System.out.println("Entered");
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//button[@class='_2AkmmA _1poQZq _7UHT_c']")).click(); 
	    		Thread.sleep(3000);
	    		System.out.println("Continue");
	    		driver.findElement(By.xpath("//button[@class='_2AkmmA _I6-pD _7UHT_c']")).click();
	    		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Q4i61 _7UHT_c']")).click();
	    		
	    		//scrll t netbanking
	    		Thread.sleep(3000);
	    		WebElement n=driver.findElement(By.xpath("//label[@for='NET_OPTIONS']/div[1]"));
	    		int x2=n.getLocation().getX();
	    		int y2=n.getLocation().getY();
	    		
	    		j.executeScript("window.scrollBy("+x2+","+y2+")");
	    		j.executeScript("window.scrollBy(0,-100)");
	    		System.out.println("second scroll");
	    		n.click();
	    		Thread.sleep(3000);
	    		//j.executeScript("window.scrollBy(0,-100)");
	    		
	    		//select bank
	    		Select s1=new Select(driver.findElement(By.xpath("//select[@class='_1CV081']")));
	    		Thread.sleep(3000);
	    		/* s1.selectByVisibleText("Corporation Bank");
	    		Thread.sleep(3000);
	    		driver.findElement(By.xpath("//button[@class='_2AkmmA _2BikcQ _7UHT_c']")).click();
	    		Thread.sleep(3000); */
	    		
	    	// selecting last element of a drop down
	    		
	    		List<WebElement> allopts=s1.getOptions();
	    		int size=allopts.size();
	    		s1.selectByIndex(size-1);
	    		
	    		
	    		
	    		// taking screensht
	    		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		 FileUtils.copyFile(screenshotFile, new File("D:\\MyProgram\\payment.png"));
	    		 driver.close();
	    		 /* 
	    		 TakesScreenshot srcfile=(TakesScreenshot)driver;
	    		 File scr=srcfile.getScreenshotAs(OutputType.FILE);
	    		 File dest=new File("D:\\My Program\\payment.png");
	    		 FileUtils.copyFile(scr,dest); */
	    	}
	    }

	}

}
