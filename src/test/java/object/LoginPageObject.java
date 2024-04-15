package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.LoginPageUI;

public class LoginPageObject extends AbstractPage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public void clickToLoginButton() {
        waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }

    public void verifyEmailErrorMessage() {
        waitToElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
        isControlDisplayed(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
    }

    public void inputInvalidEmail(String email) {
        waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    public void verifyWrongEmailMessage() {
        waitToElementVisible(driver, LoginPageUI.EMAIL_WRONG_MESSAGE);
        isControlDisplayed(driver, LoginPageUI.EMAIL_WRONG_MESSAGE);
    }

    public void inputNotExistEmail(String email) {
        waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputToPassword(String password) {
        waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public void verifyNotExistEmail() {
        //waitToElementVisible(driver, LoginPageUI.EMAIL_NOT_EXIST_MESSAGE);
        isControlDisplayed(driver, LoginPageUI.EMAIL_NOT_EXIST_MESSAGE);
    }
}
