package object;

import common.AbstractPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ui.MyAccountPageUI;

import java.util.List;

public class MyAccountPageObject extends AbstractPage {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    public MyAccountPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void selectGender() {
        checkToCheckbox(driver, MyAccountPageUI.FEMALE_RADIO_BUTTON);
    }
    public void inputToFirstName(String firstName) {
        sendkeyToElement(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    public void inputToLastName(String lastName) {
        sendkeyToElement(driver, MyAccountPageUI.LASTNAME_TEXTBOX, lastName);
    }


    public void selectDateOfBirthDropdown(String day, String month, String year) {
        selectItemInDropdow(driver, MyAccountPageUI.DAY_DROPDOWN, day);
        selectItemInDropdow(driver, MyAccountPageUI.MONTH_DROPDOWN, month);
        selectItemInDropdow(driver, MyAccountPageUI.YEAR_DROPDOWN, year);
    }

    public void inputToEmailTextbox(String email) {
        sendkeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX, email);
    }


    public void inputCompanyTextbox(String company) {
        sendkeyToElement(driver, MyAccountPageUI.COMPANY_TEXTBOX, company);
    }

    public void clickToSaveButton() {
        clickToElement(driver, MyAccountPageUI.SAVE_BUTTON);
    }

    public void verifyGender() {
        isControlSelected(driver, MyAccountPageUI.FEMALE_RADIO_BUTTON);
    }

    public void verifyValueFirstName(String value, String expected) {
        String actualFirstName = getElementAttribute(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX, value);
        Assert.assertEquals(actualFirstName, expected);
    }

    public void verifyValueLastName(String value, String expected) {
        String actualLastName = getElementAttribute(driver, MyAccountPageUI.LASTNAME_TEXTBOX, value);
        Assert.assertEquals(actualLastName, expected);
    }

    public void verifyValueDateOfBirth(String expectedDay, String expectedMonth, String expectedYear) {
        isControlSelected(driver, MyAccountPageUI.DAY_SELECTED);
        isControlSelected(driver, MyAccountPageUI.MONTH_SELECTED);
        isControlSelected(driver, MyAccountPageUI.YEAR_SELECTED);
        String actualDay = getTextElement(driver, MyAccountPageUI.DAY_SELECTED);
        String actualMonth = getTextElement(driver, MyAccountPageUI.MONTH_SELECTED);
        String actualYear = getTextElement(driver, MyAccountPageUI.YEAR_SELECTED);
        Assert.assertEquals(actualDay, expectedDay);
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualYear, expectedYear);
    }

    public void verifyValueEmail(String value, String expected) {
        String actualEmail = getElementAttribute(driver, MyAccountPageUI.EMAIL_TEXTBOX, value);
        Assert.assertEquals(actualEmail, expected);
    }

    public void verifyValueCompanyName(String value, String expected) {
        String actualCompany = getElementAttribute(driver, MyAccountPageUI.COMPANY_TEXTBOX, value);
        Assert.assertEquals(actualCompany, expected);
    }

    public void clickToAddressLink() {
        clickToElement(driver, MyAccountPageUI.ADDRESSES_LINK);
    }

    public void clickToAddNewButton() {
        clickToElement(driver, MyAccountPageUI.ADD_NEW_BUTTON);
    }

    public void inputToFirstNameAddress(String firstName) {
        sendkeyToElement(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX_ADD, firstName);
    }

    public void inputToLastNameAddress(String lastName) {
        sendkeyToElement(driver, MyAccountPageUI.LASTNAME_TEXTBOX_ADD, lastName);
    }

    public void inputToEmailTextboxAddress(String email) {
        sendkeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX_ADD, email);
    }

    public void inputCompanyTextboxAddress(String company) {
        sendkeyToElement(driver, MyAccountPageUI.COMPANY_TEXTBOX_ADD, company);
    }

    public void selectCountryDropdown(String valueCountry) {
        selectItemInDropdow(driver, MyAccountPageUI.COUNTRY_DROPDOWN, valueCountry);
    }

    public void inputToCityTextboxAddress(String city) {
        sendkeyToElement(driver, MyAccountPageUI.CITY_TEXTBOX, city);
    }

    public void inputToAddress1Textbox(String address1) {
        sendkeyToElement(driver, MyAccountPageUI.ADDRESS1_TEXTBOX, address1);
    }

    public void inputToAddress2Textbox(String address2) {
        sendkeyToElement(driver, MyAccountPageUI.ADDRESS2_TEXTBOX, address2);
    }

    public void inputToZipCodeTextboxAddress(String zipCode) {
        sendkeyToElement(driver, MyAccountPageUI.ZIPCODE_TEXTBOX, zipCode);
    }

    public void inputToPhoneTextboxAddress(String phone) {
        sendkeyToElement(driver, MyAccountPageUI.PHONE_TEXTBOX, phone);
    }

    public void inputToFaxTextboxAddress(String fax) {
        sendkeyToElement(driver, MyAccountPageUI.FAX_TEXTBOX, fax);
    }

    public void clickToSaveButtonAddress() {
        clickToElement(driver, MyAccountPageUI.SAVE_BUTTON_ADD);
    }

    public void verifyNameAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.NAME);
        Assert.assertEquals(actual, expected);
    }

    public void verifyEmailAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.EMAIL);
        Assert.assertEquals(actual, expected);
    }

    public void verifyPhoneNumberAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.PHONE);
        Assert.assertEquals(actual, expected);
    }

    public void verifyFaxNumberAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.FAX);
        Assert.assertEquals(actual, expected);
    }

    public void verifyCompanyAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.COMPANY);
        Assert.assertEquals(actual, expected);
    }

    public void verifyAddress1(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.ADDRESS1);
        Assert.assertEquals(actual, expected);
    }

    public void verifyAddress2(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.ADDRESS2);
        Assert.assertEquals(actual, expected);
    }

    public void verifyCityStateZip(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.CITY_STATE_ZIP);
        Assert.assertEquals(actual, expected);
    }

    public void verifyCountry(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.COUNTRY);
        Assert.assertEquals(actual, expected);
    }

    public void clickToChangePasswordLink() {
        clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_LINK);
    }

    public void inputToOldPasswordTextbox(String oldPassword) {
        sendkeyToElement(driver, MyAccountPageUI.OLD_PASSWORD_TEXTBOX, oldPassword);
    }

    public void inputToNewPasswordTextbox(String newPassword) {
        sendkeyToElement(driver, MyAccountPageUI.NEW_PASSWORD_TEXTBOX, newPassword);
    }

    public void inputToConfirmPasswordTextbox(String cfPassword) {
        sendkeyToElement(driver, MyAccountPageUI.CONFIRM_PASSWORD_TEXTBOX, cfPassword);
    }

    public void clickToChangePasswordButton() {
        clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_BUTTON);
    }

    public void verifyChangePasswordSuccessfully() {
        boolean notice = isControlDisplayed(driver, MyAccountPageUI.NOTICE_SUCCESSFULLY);
        Assert.assertTrue(notice);
    }

    public void clickToMyProductReviewsLink() {
        clickToElement(driver, MyAccountPageUI.PRODUCT_REVIEW_LINK);
    }

    public void verifyTitleIsDisplayed(String expected) {
        getItemInListItem(driver, MyAccountPageUI.REVIEW_TITLE, expected);
    }

    public void verifyContentReviewTextIsDisplayed(String expected) {
        getItemInListItem(driver, MyAccountPageUI.REVIEW_CONTENT, expected);
    }

    public void verifyProductAdded(String expected) {
        getItemInListItem(driver, MyAccountPageUI.PRODUCT_ADDED_TEXT, expected);
    }
}


