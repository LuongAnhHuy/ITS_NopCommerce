package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.HeaderPageUI;
import ui.LoginPageUI;

public class LoginPageObject extends AbstractPage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click to Login button")
    public void clickToLoginButton() {
        waitToElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }

    @Step("Verify Email error message is displayed")
    public void verifyEmailErrorMessage() {
        waitToElementVisible(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
        isControlDisplayed(driver, LoginPageUI.EMAIL_ERROR_MESSAGE);
    }

    @Step("Input invalid data to mail textbox")
    public void inputInvalidEmail(String email) {
        waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    @Step("Verify Wrong Email message is displayed")
    public void verifyWrongEmailMessage() {
        waitToElementVisible(driver, LoginPageUI.EMAIL_WRONG_MESSAGE);
        isControlDisplayed(driver, LoginPageUI.EMAIL_WRONG_MESSAGE);
    }

    @Step("Input email to textbox with value {0}")
    public void inputToEmailTextbox(String email) {
        waitToElementVisible(driver, LoginPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, email);
    }

    @Step("Input password to textbox with value {0}")
    public void inputToPassword(String password) {
        waitToElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    }

    @Step("Verify message not exist email is displayed")
    public void verifyNotExistEmail(String expected) {
        isControlDisplayed(driver, LoginPageUI.ERROR_MESSAGE);
        String actual = getTextElement(driver, LoginPageUI.ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);

    }

    @Step("Verify error message is displayed")
    public void verifyErrorMessage(String expected) {
        isControlDisplayed(driver, LoginPageUI.ERROR_MESSAGE);
        String actual = getTextElement(driver, LoginPageUI.ERROR_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify login successfully and My Account is displayed")
    public void verifyLoginSuccessfully() {
        boolean myAccount = isControlDisplayed(driver, HeaderPageUI.MYACCOUNT_LINK);
        Assert.assertTrue(myAccount);
    }
}
