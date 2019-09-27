package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_1 {

	WebDriver driver = null;
	
	@Given("^The Signup Page is opened$")
	public void the_Signup_Page_is_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_b6b.01.16\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignUp")).click();
	}

	@When("^The user enters username as \"([^\"]*)\"$")
	public void the_user_enters_username_as(String arg1) throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^The user enters First Name as \"([^\"]*)\"$")
	public void the_user_enters_First_Name_as(String arg1) throws Throwable {
	    driver.findElement(By.name("firstName")).sendKeys(arg1);
	}

	@When("^User eneters Last Name as \"([^\"]*)\"$")
	public void user_eneters_Last_Name_as(String arg1) throws Throwable {
	    driver.findElement(By.name("lastName")).sendKeys(arg1);
	}

	@When("^User enters Password as \"([^\"]*)\"$")
	public void user_enters_Password_as(String arg1) throws Throwable {
	    driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@When("^User enters Confirm Password as \"([^\"]*)\"$")
	public void user_enters_Confirm_Password_as(String arg1) throws Throwable {
	    driver.findElement(By.name("confirmPassword")).sendKeys(arg1);
	}

	@When("^User selects gender")
	public void user_selects_gender() throws Throwable {
	    driver.findElement(By.xpath("//input[@id='gender' and @value='Male']")).click();
	}

	@When("^User enters email as \"([^\"]*)\"$")
	public void user_enters_email_as(String arg1) throws Throwable {
	    driver.findElement(By.name("emailAddress")).sendKeys(arg1);
	}

	@When("^User enters Mobile Number as \"([^\"]*)\"$")
	public void user_enters_Mobile_Number_as(String arg1) throws Throwable {
	    driver.findElement(By.name("mobileNumber")).sendKeys(arg1);
	}

	@When("^User enters DOB as \"([^\"]*)\"$")
	public void user_enters_DOB_as(String arg1) throws Throwable {
	    driver.findElement(By.name("dob")).sendKeys(arg1);
	}

	@When("^User enters Address as \"([^\"]*)\"$")
	public void user_enters_Address_as(String arg1) throws Throwable {
	    driver.findElement(By.name("address")).sendKeys(arg1);
	}

	@When("^User selects Security question")
	public void user_selects_Security_question_() throws Throwable {
	    Select sq = new Select(driver.findElement(By.name("securityQuestion")));
	    sq.selectByIndex(1);
	}

	@When("^User enters Answer")
	public void user_enters_Answer() throws Throwable {
	    driver.findElement(By.name("answer")).sendKeys("Red");
	}

	@When("^The user clicks on Signup button$")
	public void the_user_clicks_on_Signup_button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("^The user is redirected to the Login Page$")
	public void the_user_is_redirected_to_the_Login_Page() throws Throwable {
	    System.out.println("Url of the current page is: " + driver.getCurrentUrl());
	}
	
}
