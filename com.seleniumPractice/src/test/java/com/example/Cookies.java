package com.example;

import java.awt.AWTException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies {
	  @Test
	  public void createcookie() throws InterruptedException, IOException, AWTException {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  driver.get("https://ksrtc.in/oprs-web/login/show.do");
		  driver.findElement(By.id("userName")).sendKeys("username");
		  driver.findElement(By.id("password")).sendKeys("password");
		  driver.findElement(By.id("submitBtn")).click();
		  File file1=new File("C:\\reports\\cookies.data");
		  try {
		  file1.createNewFile();
		  FileWriter fw=new FileWriter(file1);
		  BufferedWriter bw=new BufferedWriter(fw);
		  Cookie name = new Cookie("mycookie", "12345678911111111");
		  driver.manage().addCookie(name);
		  //driver.manage().deleteCookieNamed("mycookie");
		  //driver.manage().deleteAllCookies();
		  for(Cookie ck:driver.manage().getCookies()) {
		  bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
		  bw.newLine();
          }
		  Thread.sleep(3000);
		  
		  
		  bw.close();
		  fw.close();
		  Thread.sleep(3000);
		  driver.close();
		  
		  
		  }
		  catch(Exception e) {
		  System.out.println(e);
		  }}
	      
}

