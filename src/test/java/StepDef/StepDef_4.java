package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_4 {

	WebDriver driver = null;
	
	@Given("^Alex has registered in TestMeApp$")
	public void alex_has_registered_in_TestMeApp() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	    driver.findElement(By.name("userName")).sendKeys("Lalitha");
		 driver.findElement(By.name("password")).sendKeys("Password123");
		 driver.findElement(By.name("Login")).click();
	}

	@When("^Alex searches a particular product like Carpet$")
	public void alex_searches_a_particular_product_like_Carpet() throws Throwable {
	    driver.findElement(By.name("products")).sendKeys("Carpet");
	    driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("^Tries to proceed to payment without adding any item in cart$")
	public void tries_to_proceed_to_payment_without_adding_any_item_in_cart() throws Throwable {
	    try {
	    	driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	        }
	    catch (Exception e) {
	    	System.out.println("Cart option is not available when it is empty");
	    }
	    
	    	driver.findElement(By.xpath("//a[@class='btn btn-success btn-product']")).click();
	    	driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	    	driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
	    	driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	    	Thread.sleep(5000);
	    	driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div/div[1]/div[5]/div")).click();
	    	driver.findElement(By.id("btn")).click();
	    	driver.findElement(By.name("username")).sendKeys("123458");
	    	driver.findElement(By.name("password")).sendKeys("Pass@458");
	    	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	    	driver.findElement(By.name("transpwd")).sendKeys("Trans@458");
	    	driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	    	driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
	    
	    
	}

	@Then("^TestMeApp doesn't display the cart icon$")
	public void testmeapp_doesn_t_display_the_cart_icon() throws Throwable {
	    driver.close();
	}
	
}
