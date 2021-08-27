//package com.funtionality;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import com.locators.Lements;
//
//public class Pomcheckout {
//	@Test
//	  public void phptravels() throws InterruptedException {
//		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//		  
//		  WebDriver driver=new ChromeDriver();
//		  
//		  driver.get("https://phptravels.org/register.php");
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		  
//		  
//		  
//		//Register
//			  Lements.firstname(driver).sendKeys("Nikhil");
//			  
//			
//			  
//			 Lements.lastname(driver).sendKeys("Manjunath");
//			  
//			  String email = "nikhill1@abcd.in";
//			  
//			  Lements.emailid(driver).sendKeys(email);
//			  
//			  Lements.mblno(driver).sendKeys("8147214187");
//			  
//			  Lements.addressline1(driver).sendKeys("street number one ");
//			  
//			  Lements.addressline2(driver).sendKeys("house no 101");
//			  
//			  Lements.city(driver).sendKeys("Bangalore");
//			  
//			  Lements.country(driver).sendKeys("India");
//			
//			  Select sel = new Select(Lements.state(driver));
//			  
//			  sel.selectByVisibleText("Karnataka");
//			  
//			  Lements.postalcode(driver).sendKeys("562001");
//			  
//			  Lements.alternateno(driver).sendKeys("8147214187");
//			  
//			  Lements.inputpwd(driver).sendKeys("qwerty123");
//			  
//			  Lements.confirmpwd(driver).sendKeys("qwerty123");
//			  
//			  Thread.sleep(80000);
//			  
//			  Lements.submit(driver).click();
//			  
//			  Lements.loginbutton(driver).click();
//			  
//			  Thread.sleep(2000);
//	
//			  Lements.lemail(driver).sendKeys(email);
//			  
//			  Lements.lpwd(driver).sendKeys("qwerty123");
//			  
//			  Thread.sleep(45000);
//			  
//			  Lements.ordernewservices(driver).click();
//			  
//			  Lements.selectopt1(driver).click();
//			  
//			  Lements.addtocart(driver).click();
//			  
//			  Lements.checkout(driver).click();
//			  
//			  Thread.sleep(45000);
//			  
//			  Lements.completeorder(driver).click();
//			  
//			  driver.quit();
//			  
//			  
//	
//	
//	
//}
