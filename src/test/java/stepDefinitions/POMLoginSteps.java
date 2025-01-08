package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageObjects.LoginPage;

import java.time.Duration;

public class POMLoginSteps {

//    WebDriver driver;
//    LoginPage lg ;
//
//    @Given("User is on Login page")
//    public void user_is_on_login_page() {
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.get("https://www.saucedemo.com/v1/");
//    }
//    @When("User enters valid {string} and {string}")
//    public void user_enters_valid_username_and_password(String username, String password) {
//        lg = new LoginPage(driver);
//        lg.enterUsername(username);
//        lg.enterPassword(password);
//    }
//    @And("Click on Login Button")
//    public void click_on_login_button() {
//        lg.clickLogin();
//    }
//    @Then("User is navigated to Homepage")
//    public void user_is_navigated_to_login_page() {
//        //Get a list of web elements then check the size return should be 1 => true
//        Assert.assertTrue(lg.isLogoDisplayed(),"User is navigated to Homepage");
//    }
//    @And("Close the browser")
//    public void close_the_browser() {
//        driver.quit();
//    }
}
