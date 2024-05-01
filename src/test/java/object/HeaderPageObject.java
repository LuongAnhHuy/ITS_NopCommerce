package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ui.HeaderPageUI;

public class HeaderPageObject extends AbstractPage {
    WebDriver driver;
    public HeaderPageObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Click to Register Link")
    public void clickToRegisterLink() {
        clickToElement(driver, HeaderPageUI.REGISTER_HYPERLINK);
    }

    @Step("Click to Log-in Link")
    public void clickToLoginLink() {
        waitToElementClickable(driver, HeaderPageUI.LOGIN_LINK);
        clickToElement(driver, HeaderPageUI.LOGIN_LINK);
    }

    @Step("Click to My Account Link")
    public void clickToMyAccountLink() {
        waitToElementClickable(driver, HeaderPageUI.MYACCOUNT_LINK);
        clickToElement(driver, HeaderPageUI.MYACCOUNT_LINK);
    }


    @Step("Click to Logout Link")
    public void clickToLogoutLink() {
        waitToElementClickable(driver, HeaderPageUI.LOGOUT_LINK);
        clickToElement(driver, HeaderPageUI.LOGOUT_LINK);
    }

    @Step("Click to NopCommerce Header")
    public void clickToNopCommerceHeader(){
        clickToElement(driver, HeaderPageUI.NOPCOMMERCE_HEADER);
    }
}
