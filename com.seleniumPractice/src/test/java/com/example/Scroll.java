package com.example;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {
	@Test
	  public void scrolldwn()  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");


			JavascriptExecutor jse=(JavascriptExecutor) driver;
			WebElement ele1=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));

			jse.executeScript("arguments[0].scrollIntoView(true);",ele1);

			ele1.sendKeys("nikhil");
		  
	}
}
