package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
WebDriver driver;
	
	@Given("navigate to login screen")
	public void navigate_to_login_screen() {
	    
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		

		driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/index.php?rp=/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("given done");
	}
	
	@When("enter username and password")
	public void enter_username_and_password() throws InterruptedException {
		
		driver.findElement(By.id("inputEmail")).sendKeys("nikhil8@abcd.in");
		  
		  driver.findElement(By.id("inputPassword")).sendKeys("qwerty123");
		  
		  Thread.sleep(45000);
		
		System.out.println("when done");
	}
	
	@Then("login success")
	public void login_success() throws InterruptedException {
	    
		driver.findElement(By.id("login")).click();
		  Thread.sleep(2000);
		
		System.out.println("then done");
	}
	
	@Given("navigate to home screen")
	public void navigate_to_home_screen() throws InterruptedException {
		System.out.println("3rd given");
		driver.get("https://phptravels.org/index.php?rp=/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("inputEmail")).sendKeys("nikhil8@abcd.in");
		driver.findElement(By.id("inputPassword")).sendKeys("qwerty123");
		Thread.sleep(45000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();
		  
	}
	
	@When("add a product to cart")
	public void add_a_product_to_cart() throws InterruptedException {
		driver.findElement(By.id("Secondary_Sidebar-Client_Shortcuts-Order_New_Services")).click();
		  
		  driver.findElement(By.id("pid13")).click();
		  
		  driver.findElement(By.xpath("//*[@id='order-boxes']/div[3]/form/div[2]/button")).click();
		  
		  driver.findElement(By.id("checkout")).click();
		  Thread.sleep(45000);  
	}

	@Then("checkout success")
	public void checkout_success() throws InterruptedException {
		driver.findElement(By.id("btnCompleteOrder")).click();
		  Thread.sleep(12000);
		  driver.quit();
	}
	
	
}
