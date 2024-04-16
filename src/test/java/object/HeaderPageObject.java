package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import ui.HeaderPageUI;

public class HeaderPageObject extends AbstractPage {
    WebDriver driver;
    public HeaderPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void clickToRegisterLink() {
        waitToElementClickable(driver, HeaderPageUI.REGISTER_HYPERLINK);
        clickToElement(driver, HeaderPageUI.REGISTER_HYPERLINK);
    }

    public void clickToLoginLink() {
        waitToElementClickable(driver, HeaderPageUI.LOGIN_LINK);
        clickToElement(driver, HeaderPageUI.LOGIN_LINK);
    }


    public void clickToMyAccountLink() {
        waitToElementClickable(driver, HeaderPageUI.MYACCOUNT_LINK);
        clickToElement(driver, HeaderPageUI.MYACCOUNT_LINK);
    }
}
