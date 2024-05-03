package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {
    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click to Register button")
    public void clickToRegisterButton() {
        waitToElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);
    }

    @Step("Verify displays First Name error message")
    public void verifyFirstNameErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.FIRSTNAME_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify displays Last Name error message")
    public void verifyLastNameErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.LASTNAME_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify displays Email error message")
    public void verifyEmailErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.EMAIL_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify displays Password error message")
    public void verifyPasswordErrorMessage(String expected) {
        waitToElementVisible(driver, RegisterPageUI.PASSWORD_MESSAGE);
        String actual = getTextElement(driver, RegisterPageUI.PASSWORD_MESSAGE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify displays Confirm Password error message")
    public boolean verifyConfirmPasswordErrorMessage() {
        return isControlDisplayed(driver, RegisterPageUI.CONFIRM_PASSWORD_MESSAGE);
    }

    @Step("Input to First Name textbox")
    public void inputToFirstNameTextbox(String firstName) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    @Step("Input to Last Name textbox")
    public void inputToLastNameTextbox(String lastName) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
    }

    @Step("Input to Email textbox")
    public void inputToEmailNameTextbox(String email) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    @Step("Input valid Password to textbox")
    public void inputToPasswordTextbox(String password) {
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    @Step("Input to Confirm Password textbox")
    public void inputToConfirmPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    @Step("Verify displays Wrong Email message")
    public boolean VerifyWrongEmailMessage() {
        return isControlDisplayed(driver, RegisterPageUI.WRONG_EMAIL_MESSAGE);
    }

    @Step("Input valid First Name to textbox")
    public void inputValidFirstNameTextbox(String firstName) {
        waitToElementVisible(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    @Step("Input valid Last Name to textbox")
    public void inputValidLastNameTextbox(String lastName) {
        waitToElementVisible(driver, RegisterPageUI.LASTNAME_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, lastName);
    }

    @Step("Input valid Email to textbox")
    public void inputValidEmailTextbox(String email) {
        waitToElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    @Step("Input valid Password to textbox")
    public void inputValidPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    @Step("Input valid Confirm Password to textbox")
    public void inputValidConfirmPasswordTextbox(String password) {
        waitToElementVisible(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    @Step("Verify success message is displayed")
    public boolean verifySuccessMessage() {
        return isControlDisplayed(driver, RegisterPageUI.SUCCESS_MESSAGE);
    }

    @Step("Click to Continue button")
    public void clickToContinueButton() {
        waitToElementClickable(driver, RegisterPageUI.CONTINUE_BUTTON);
        clickToElement(driver, RegisterPageUI.CONTINUE_BUTTON);
    }

    @Step("Verify displays Duplicate Email message")
    public boolean verifyDuplicateErrorMessage() {
        return isControlDisplayed(driver, RegisterPageUI.DUPLICATE_MESSAGE);
    }

    @Step("Verify displays error message input Password less than 6 characters")
    public boolean verifyMessageLessThanDisplay() {
        return isControlDisplayed(driver, RegisterPageUI.PASSWORD_LESS_THAN_MESSAGE);
    }


    @Step("Verify Message Confirm Password not match Password is displayed")
    public boolean verifyMessageNotMatch() {
        return isControlDisplayed(driver, RegisterPageUI.PASSWORD_NOT_MATCH_MESSAGE);
    }
}
