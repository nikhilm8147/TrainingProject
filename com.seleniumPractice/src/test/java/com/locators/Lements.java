package com.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lements {
	
		
		@FindBy(id="inputFirstName")
		public static WebElement firstname;
		
		//Register
		// WebElement firstname = driver.findElement(By.id("inputFirstName"));
		
		
		  
	   
	     @FindBy(id="inputLastName")
			public static WebElement lastname;  
		  
		
		@FindBy(id="inputEmail")
		public static WebElement emailid;
		
		
		@FindBy(id="inputPhone")
		public static WebElement mblno;
		
		
		@FindBy(id="inputAddress1")
		public static WebElement addressline1;
		
		
		@FindBy(id="inputAddress2")
		public static WebElement addressline2;
		
		
		@FindBy(id="inputCity")
		public static WebElement city;
		
		
		@FindBy(id="inputCountry")
		public static WebElement country;
		

		
		@FindBy(id="stateselect")
		public static WebElement state;
		
		
		@FindBy(id="inputPostcode")
		public static WebElement postalcode;
		
		
		@FindBy(id="customfield2")
		public static WebElement alternateno;
		
		
		@FindBy(id="inputNewPassword1")
		public static WebElement inputpwd;
		
		
		@FindBy(id="inputNewPassword2")
		public static WebElement confirmpwd;
		
		
		@FindBy(xpath="//*[@id='frmCheckout']/p/input")
		public static WebElement submit;
		
		
		@FindBy(xpath="//*[@id='header']/div/ul/li[3]/a")
		public static WebElement loginbutton;
		
		
		@FindBy(id="inputNewPassword2")
		public static WebElement lemail;
		
		
		@FindBy(id="inputEmail")
		public static WebElement lpwd;
		
		
		@FindBy(id="login")
		public static WebElement loginbutton1;
		
		
		@FindBy(id="Secondary_Sidebar-Client_Shortcuts-Order_New_Services")
		public static WebElement ordernewservices;
		
		
		@FindBy(id="pid13")
		public static WebElement selectopt1;
		
		
		@FindBy(xpath="//*[@id='order-boxes']/div[3]/form/div[2]/button")
		public static WebElement addtocart;
		
		
		@FindBy(id="checkout")
		public static WebElement checkout;
		
		
		@FindBy(id="btnCompleteOrder")
		public static WebElement completeorder;
		
		
		
		
		
	
}
