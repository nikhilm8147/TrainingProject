package com.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fileupload {
		
		@Test
		  public void uploadd() throws InterruptedException, IOException, AWTException {
			  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			  
			  WebDriver driver=new ChromeDriver();
			  
			  
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.get("https://www.ilovepdf.com/word_to_pdf");
				
				driver.findElement(By.id("pickfiles")).click();
			  
			  String file="C:\\Users\\nikhil.m\\Documents\\TestData.xlsx";
				
				StringSelection sel=new StringSelection(file);
				
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
				
				Thread.sleep(3000);
				
				Robot robot1=new Robot();
				
				robot1.keyPress(KeyEvent.VK_CONTROL);
				
				robot1.keyPress(KeyEvent.VK_V);
				
				robot1.keyRelease(KeyEvent.VK_V);
				
				robot1.keyRelease(KeyEvent.VK_CONTROL);
				
				robot1.keyPress(KeyEvent.VK_ENTER);
		
		
		}
	
}
