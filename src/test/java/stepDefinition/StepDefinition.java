package stepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


public class StepDefinition {
	
	public static WebDriver driver;
	
	@Given("^Initialize the browser with Chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/ombagade/Desktop/Supported_Files/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		System.out.println(driver.getTitle());
        
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" with click on Login button$")
    public void user_enters_something_and_something_with_click_on_login_button(String strArg1, String strArg2) throws Throwable {
    	
    	driver.findElement(By.id("email")).sendKeys("test@gmail.com");

		driver.findElement(By.name("passwd")).sendKeys("Test@123");
		
		driver.findElement(By.name("SubmitLogin")).click();
       
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	
    	System.out.println("Login Successful...!");
        
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	
    	System.out.println("User is on Main Page...!");
        
    }


}
