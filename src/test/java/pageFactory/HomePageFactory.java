package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
    WebDriver driver;

    public HomePageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[name()='path' and contains(@fill, 'currentCol')]")
    WebElement icon_cart;

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement lbl_logo;

    public boolean isCartDisplayed(){
        return  icon_cart.isDisplayed();
    }

    public boolean isLogoDisplayed(){
        return lbl_logo.isDisplayed();
    }
}
