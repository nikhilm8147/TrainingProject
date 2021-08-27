package com.example;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Filedownload {
	@Test
	  public void download() throws InterruptedException, IOException, AWTException {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("http://www.leafground.com/pages/download.html");
		  driver.findElement(By.linkText("Download Excel")).click(); 
		  File flocation=new File("C:\\Users\\nikhil.m\\Downloads");
		  File [] total_files= flocation.listFiles(); 
		  
		  for (File file:total_files)
		   if (file.getName().equalsIgnoreCase("testleaf.xlsx")) { 
			  System.out.println("File is downloaded"); 
			  break;
		  }
		  
		  
		  
		  
		  
		  
		  
}
}
