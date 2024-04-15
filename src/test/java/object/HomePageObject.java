package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import ui.HomePageUI;

public class HomePageObject extends AbstractPage {
    WebDriver driver;
    public HomePageObject(WebDriver driver){
        this.driver = driver;
    }
    public void clickToRegisterLink() {
        waitToElementClickable(driver, HomePageUI.REGISTER_HYPERLINK);
        clickToElement(driver, HomePageUI.REGISTER_HYPERLINK);
    }

    public void clickToLoginButton() {
        waitToElementClickable(driver, HomePageUI.LOGIN_LINK);
        clickToElement(driver, HomePageUI.LOGIN_LINK);
    }
}
