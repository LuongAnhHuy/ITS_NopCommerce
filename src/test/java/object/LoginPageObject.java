package object;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.HeaderPageUI;
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

    public void inputToEmailTextbox(String email) {
        waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    public void inputToPassword(String password) {
        waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public void verifyNotExistEmail(String expected) {
        isControlDisplayed(driver, LoginPageUI.ERROR_MESSAGE);
        String actual = getTextElement(driver, LoginPageUI.ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);

    }

    public void verifyErrorMessage(String expected) {
        isControlDisplayed(driver, LoginPageUI.ERROR_MESSAGE);
        String actual = getTextElement(driver, LoginPageUI.ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyLoginSuccessfully() {
        boolean myAccount = isControlDisplayed(driver, HeaderPageUI.MYACCOUNT_LINK);
        Assert.assertTrue(myAccount);
    }
}
