package com.funtionality;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.locators.Lements;


public class Checkout {

	@Test
	  public void phptravels() throws InterruptedException, IOException {
		
		  FileInputStream ist = new FileInputStream("Config.properties");
		  Properties prop = new Properties();
		  prop.load(ist);
		  String browser_name = prop.getProperty("browser");
		  String driverr_path = prop.getProperty("driver_path");
		  WebDriver driver;
		  
		  if (browser_name.equalsIgnoreCase("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver",driverr_path);
		   driver=new ChromeDriver();
		  }
		  
		  else
		  {
			  System.setProperty("webdriver.ie.driver",driverr_path);
			   driver=new InternetExplorerDriver();
		  }
			  
			  
			  
		  
		  
		  
		  driver.get("https://phptravels.org/register.php");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  PageFactory.initElements(driver, Lements.class);
		  
		  
		//Register
			  Lements.firstname.sendKeys("Nikhil");
			  
			
			  
			 Lements.lastname.sendKeys("Manjunath");
			  
			  String email = "nikhill1@abcd.in";
			  
			  Lements.emailid.sendKeys(email);
			  
			  Lements.mblno.sendKeys("8147214187");
			  
			  Lements.addressline1.sendKeys("street number one ");
			  
			  Lements.addressline2.sendKeys("house no 101");
			  
			  Lements.city.sendKeys("Bangalore");
			  
			  Lements.country.sendKeys("India");
			
			  Select sel = new Select(Lements.state);
			  
			  sel.selectByVisibleText("Karnataka");
			  
			  Lements.postalcode.sendKeys("562001");
			  
			  Lements.alternateno.sendKeys("8147214187");
			  
			  Lements.inputpwd.sendKeys("qwerty123");
			  
			  Lements.confirmpwd.sendKeys("qwerty123");
			  
			  Thread.sleep(80000);
			  
			  Lements.submit.click();
			  
			  Lements.loginbutton.click();
			  
			  Thread.sleep(2000);
	
			  Lements.lemail.sendKeys(email);
			  
			  Lements.lpwd.sendKeys("qwerty123");
			  
			  Thread.sleep(45000);
			  
			  Lements.ordernewservices.click();
			  
			  Lements.selectopt1.click();
			  
			  Lements.addtocart.click();
			  
			  Lements.checkout.click();
			  
			  Thread.sleep(45000);
			  
			  Lements.completeorder.click();
			  
			  driver.quit();
			  
			  
	
	
	
	
	}	  
}
