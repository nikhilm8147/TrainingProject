package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step1 {
	WebDriver driver;
	
	@Given("open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");

		

		driver=new ChromeDriver();
		
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("given done");
	}
	
	@When("enter all valid credentials")
	public void enter_all_valid_credentials() throws InterruptedException {
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
		  
		  Thread.sleep(8000);
		
		System.out.println("when done");
	}
	
	@Then("Register success")
	public void register_success() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='frmCheckout']/p/input")).click();
		Thread.sleep(2500);
		driver.quit();
		System.out.println("then done");
	}

	
	
}
