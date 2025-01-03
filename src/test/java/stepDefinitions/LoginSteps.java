package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {
    static WebDriver driver;

    @Given("User is on Login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/v1/");
    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("Click on Login Button")
    public void click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User is navigated to Homepage")
    public void user_is_navigated_to_login_page() {
        //Get a list of web elements then check the size return should be 1 => true
        Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User is navigated to Homepage");
    }
    @And("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
