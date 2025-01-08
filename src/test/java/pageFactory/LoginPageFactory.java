package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

    WebDriver driver;
    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "login-button")
    WebElement btn_login;

//    @FindBy(xpath = "//div[@class='app_logo']")
//    WebElement lbl_logo;

    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickLogin() {
        btn_login.click();
    }

    public void userLogin(String username, String password){
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
    }
//    public boolean isLogoDisplayed(){
//        return lbl_logo.isDisplayed();
//    }
}
