package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Datepicker {
	@Test
	  public void selectdate()  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.get("http://demo.automationtesting.in/Datepicker.html");

			
	        JavascriptExecutor jse=(JavascriptExecutor) driver;
	        
	        jse.executeScript("document.getElementById('datepicker2').value='29/08/2021'");
}
}
