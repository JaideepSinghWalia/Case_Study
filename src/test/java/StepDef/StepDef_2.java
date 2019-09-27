package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_2 {

	WebDriver driver = null;
	
	@Given("^User opens the application$")
	public void user_opens_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("^User click on signin Link$")
	public void user_click_on_signin_Link() throws Throwable {
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.name("Login")).click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	    driver.close();
	}
	
}
