package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip {
	@Test
	  public void tooltipp() throws InterruptedException  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.get("http://leafground.com/pages/tooltip.html");
		  
		  Actions act = new Actions(driver);
		  
		  WebElement ele1 = driver.findElement(By.id("age"));
		  String tooltip = ele1.getAttribute("title");
		  System.out.println(tooltip);
		  
		 
		  
		  act.moveToElement(ele1).build().perform();
		  Thread.sleep(1000);
		  WebElement tooltip1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
		  String tooltiptext = tooltip1.getText();
		  System.out.println(tooltiptext + "2");
	
	
	
	
	}
}
