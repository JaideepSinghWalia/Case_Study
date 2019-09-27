package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_3 {

	WebDriver driver = null;
	
	@Given("^User opens Application$")
	public void user_opens_Application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/");
	    }

	@Given("^User Logs into account$")
	public void user_Logs_into_account() throws Throwable {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("aravind.guggilla57@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("aravind");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		}

	@When("^User enters \"([^\"]*)\" with \"([^\"]*)\" check$")
	public void user_enters_with_check(String search, String Item) throws Throwable {
		driver.findElement(By.id("small-searchterms")).sendKeys(search);
		Thread.sleep(3000);
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.linkText(Item))).click().build().perform();
	    }

	@Then("^Testcase is successful$")
	public void testcase_is_successful() throws Throwable {
		System.out.println("URL of current page is: " + driver.getCurrentUrl());
		}
	
}
