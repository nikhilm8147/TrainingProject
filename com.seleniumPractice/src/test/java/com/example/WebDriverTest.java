package com.example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverTest {
  
  
  @Test(enabled=false)
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://www.leafground.com/");
	  
	  driver.findElement(By.linkText("Edit")).click();
	  
	  //Text field
	  driver.findElement(By.id("email")).sendKeys("Nikhil");
	  
	  driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("M");
	  
	  driver.get("http://leafground.com/pages/Button.html");
	  
	  //Button
	  driver.findElement(By.id("home")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//img[@src='images/radio.png']")).click();
	  
	  //Radio Button
	  driver.findElement(By.id("yes")).click();
	  Thread.sleep(1000);
	  
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//img[@src='images/checkbox.png']")).click();
	  
	  //Checkbox
	  //driver.findElement(By.xpath("//div/input[contains(text(),'Java')]")).click();
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input")).click();
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//img[@src='images/dropdown.png']")).click();
	  
	  //Dropdown
	  Select select = new Select(driver.findElement(By.id("dropdown1")));
	  select.selectByVisibleText("Selenium");
	  
	  Select sel = new Select(driver.findElement(By.id("dropdown3")));
	  sel.selectByValue("2");
	  Thread.sleep(1500);
	  driver.navigate().back();
	  
	  driver.findElement(By.xpath("//img[@src='images/alert.png']")).click();
	  
	  //Alert
	  driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	  driver.switchTo().alert().accept();
	  
	  
	  //driver.findElement(By.xpath("//button[onclick='confirmAlert()']")).click();
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
	  
	  driver.switchTo().alert().dismiss();
	  
	  //Prompt
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button")).click();
	  Thread.sleep(1500);
	  driver.switchTo().alert().accept();
	  
	  
	  //Frames
	  
	  driver.get("http://www.leafground.com/pages/frame.html");
	  
	  driver.switchTo().frame(1);
	  driver.switchTo().frame("frame2");
	  
	  driver.findElement(By.id("Click1")).click();
	  Thread.sleep(2000);
	  driver.switchTo().defaultContent();
	  
	  
	  
	  
	  
	  //Multiple window
	  
	  driver.get("http://www.leafground.com/pages/Window.html");
	  
	  driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
	  //driver.findElement(By.id("home")).click();
	  
	  Set<String> windows=  driver.getWindowHandles();
	  
	  Iterator<String> itr=  windows.iterator();
	  
	  String w1=itr.next();
	  
	  System.out.println(w1);
	  
	  String w2= itr.next();
		  
	  System.out.println(w2);
	  
	  String w3= itr.next();
	  
	  System.out.println(w3);
	  
	  driver.switchTo().window(w3);
	  Thread.sleep(2000);
	  
	  System.out.println(driver.getTitle());
	  
	  driver.quit();
	  
  }
  
  @Test(enabled=false)
  public void drpdwn() {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://leafground.com/pages/Dropdown.html");
	  driver.manage().window().maximize();
	  
	  List<WebElement> drpcount = driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select/option"));
	  System.out.println(drpcount.size());
	  drpcount.get(4).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("app");
	  
	  Select sel = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
      if(sel.isMultiple())
        {
    	 sel.selectByIndex(3);
    	 sel.selectByIndex(1);
    	 sel.selectByIndex(2);
         }
      List<WebElement> selcount =sel.getAllSelectedOptions();
      System.out.println(selcount.size());
  
      driver.navigate().refresh();
      
//      Dimension dim=new Dimension(1000,500);
//	  
//	  driver.manage().window().setSize(dim);
      
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
      
      driver.navigate().to("http://leafground.com/pages/sortable.html");
      List<WebElement> drag =  driver.findElements(By.xpath("//*[@id='sortable']/li"));
      System.out.println(drag.size());
      Actions act = new Actions(driver);
      act.dragAndDrop(drag.get(1), drag.get(5)).build().perform();
      act.dragAndDropBy(drag.get(0), 500, 500);
      
      
  
  }
  
  @Test(enabled=false)
  public void setcp() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://leafground.com/pages/Dropdown.html");
	  driver.manage().window().maximize();
	  
	  Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
      System.out.println("Browser Name is : "+cap.getBrowserName());
      System.out.println("Browser version is : "+cap.getVersion());           
      System.out.println("Platform is : "+cap.getPlatform());
      driver.close();
  }
  
  @Test(enabled=false)
  public void chropt() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		//options.addArguments("headless");
		//options.addArguments("disable-infobars");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		ChromeDriver driver = new ChromeDriver(options);		
		driver.get("http://leafground.com/pages/Dropdown.html");
		//driver.manage().window().maximize();
		Thread.sleep(3500);
		driver.quit();
  }
  
  
  @Test(enabled=false)
  public void dragdrop() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://leafground.com/pages/Edit.html");
	  driver.manage().window().maximize();
	  
	  WebElement edit = driver.findElement(By.id("email"));
	  edit.sendKeys("nikhilhfhfajl");
	  
	  WebElement append = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
	  
	  Actions act = new Actions(driver);
	  act.doubleClick(edit).build().perform();
	  Thread.sleep(1500);
	  
	  
	  //act.dragAndDrop(edit, append).build().perform();
	  
	  act.clickAndHold(edit).build().perform();
	  act.moveToElement(append).build().perform();
	  act.click(append).build().perform();
                     
  
  
  
  
  }
  
  @Test(enabled=false)
  public void phptravels() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://phptravels.org/register.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  WebDriverWait wait = new WebDriverWait(driver, 45);
	  //Register
	  driver.findElement(By.id("inputFirstName")).sendKeys("Nikhil");
	  
	  driver.findElement(By.id("inputLastName")).sendKeys("Manjunath");
	  
	  
	  String email = "nikhil8@abcd.in";
	  
	  driver.findElement(By.id("inputEmail")).sendKeys(email);
	  
	  driver.findElement(By.id("inputPhone")).sendKeys("8147214187");
	  
	  driver.findElement(By.id("inputAddress1")).sendKeys("street number one ");
	  
	  driver.findElement(By.id("inputAddress2")).sendKeys("house no 101");
	  
	  driver.findElement(By.id("inputCity")).sendKeys("Bangalore");
	  
	  driver.findElement(By.id("inputCountry")).sendKeys("India");
	  
	  Select sel = new Select(driver.findElement(By.id("stateselect")));
	  
	  
	  
	  sel.selectByVisibleText("Karnataka");
	  
	  driver.findElement(By.id("inputPostcode")).sendKeys("562001");
	  
	  driver.findElement(By.id("customfield2")).sendKeys("8147214187");
	  
	  driver.findElement(By.id("inputNewPassword1")).sendKeys("qwerty123");
	  
	  driver.findElement(By.id("inputNewPassword2")).sendKeys("qwerty123");
	  
	  Thread.sleep(80000);
	  //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a"))));
	  
	  driver.findElement(By.xpath("//*[@id='frmCheckout']/p/input")).click();
	  
	  driver.findElement(By.xpath("//*[@id='header']/div/ul/li[3]/a")).click();
	  Thread.sleep(2000);
	  
	  //Login screen
	  
	  driver.findElement(By.id("inputEmail")).sendKeys(email);
	  
	  driver.findElement(By.id("inputPassword")).sendKeys("qwerty123");
	  
	  Thread.sleep(45000);
	  
	  
	  driver.findElement(By.id("login")).click();
	  Thread.sleep(2000);
	  //Add to cart and checkout
	  driver.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();
	  
	  driver.findElement(By.id("pid13")).click();
	  
	  driver.findElement(By.xpath("//*[@id='order-boxes']/div[3]/form/div[2]/button")).click();
	  
	  driver.findElement(By.id("checkout")).click();
	  Thread.sleep(45000);
	  
	  driver.findElement(By.id("btnCompleteOrder")).click();
	  Thread.sleep(12000);
	  driver.quit();
	  
	  
  }
  
  
  	@Test(enabled=false)
  	public void unordlist() throws InterruptedException, IOException, AWTException {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://demo.automationtesting.in/AutoComplete.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  //driver.findElement(By.xpath("//ul[@id,'ui-id-1']")).sendKeys("in");	  
	  driver.findElement(By.id("searchbox")).sendKeys("in");
	  Thread.sleep(1500);
	  
	  
	  //ul[@id'ui-id-1']/li
	  List<WebElement> suggst = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
	  
	  System.out.println(suggst.size());
	  Thread.sleep(1500);
	  
	  for(WebElement countries : suggst) {
		  System.out.println(countries.getText());
		  if(countries.getText().equals("Spain")) {
			  Thread.sleep(1500);
			  System.out.println("**************");
			  System.out.println(countries.getText());
			  countries.click();
			  break;
		  }
		  
	  }
	  
	    Robot r1=new Robot();

		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();


		Rectangle rect=new Rectangle(sc_size);
		
		BufferedImage source=	r1.createScreenCapture(rect);
		
		File Destination=new File("C:\\screenshots\\screen2.jpg");
		
		ImageIO.write(source, "jpg", Destination);
	  
	  
	  
	  
  
  } 
  	@Test
  	public void Selectmultiple() throws InterruptedException {
  		
  		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
  	  
  	  WebDriver driver=new ChromeDriver();
  	  
  	  driver.get("http://demo.automationtesting.in/Selectable.html");
  	  driver.manage().window().maximize();
  	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	  
  	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
  	Thread.sleep(2000);
  	List<WebElement> opt = driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
  	
  	System.out.println(opt.size());
  	
  	Actions act = new Actions(driver);
  	
  	act.keyDown(Keys.CONTROL).build().perform();
  	
  	opt.get(1).click();
  	opt.get(3).click();
  	opt.get(5).click();
  	opt.get(6).click();
  	
  	driver.quit();
  	
  	
  	
  	}
  	
  	
  	
  	
  	
  	
  	
}
