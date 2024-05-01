package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.MyAccountPageUI;

public class MyAccountPageObject extends AbstractPage {
    WebDriver driver;

    public MyAccountPageObject(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Select Gender is Famale")
    public void selectGender() {
        checkToCheckbox(driver, MyAccountPageUI.FEMALE_RADIO_BUTTON);
    }

    @Step("Update First Name textbox with value {0}")
    public void inputToFirstName(String firstName) {
        sendkeyToElement(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX, firstName);
    }

    @Step("Update last name with value {0}")
    public void inputToLastName(String lastName) {
        sendkeyToElement(driver, MyAccountPageUI.LASTNAME_TEXTBOX, lastName);
    }

    @Step("Update date of birth with value {0} {1} {2}")
    public void selectDateOfBirthDropdown(String day, String month, String year) {
        selectItemInDropdow(driver, MyAccountPageUI.DAY_DROPDOWN, day);
        selectItemInDropdow(driver, MyAccountPageUI.MONTH_DROPDOWN, month);
        selectItemInDropdow(driver, MyAccountPageUI.YEAR_DROPDOWN, year);
    }

    @Step("Update email with value {0}")
    public void inputToEmailTextbox(String email) {
        sendkeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX, email);
    }

    @Step("Update company name with value {0}")
    public void inputCompanyTextbox(String company) {
        sendkeyToElement(driver, MyAccountPageUI.COMPANY_TEXTBOX, company);
    }

    @Step("Click save button")
    public void clickToSaveButton() {
        clickToElement(driver, MyAccountPageUI.SAVE_BUTTON);
    }

    @Step("Verify Gender is Famale")
    public void verifyGender() {
        isControlSelected(driver, MyAccountPageUI.FEMALE_RADIO_BUTTON);
    }

    @Step("Verify value of first name is updated is {0}")
    public void verifyValueFirstName(String value, String expected) {
        String actualFirstName = getElementAttribute(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX, value);
        Assert.assertEquals(actualFirstName, expected);
    }

    @Step("Verify value of last name is updated is {0}")
    public void verifyValueLastName(String value, String expected) {
        String actualLastName = getElementAttribute(driver, MyAccountPageUI.LASTNAME_TEXTBOX, value);
        Assert.assertEquals(actualLastName, expected);
    }

    @Step("Verify value of Date Of Birth is updated is {0} {1} {2}")
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

    @Step("Verify value of email is updated is {0}")
    public void verifyValueEmail(String value, String expected) {
        String actualEmail = getElementAttribute(driver, MyAccountPageUI.EMAIL_TEXTBOX, value);
        Assert.assertEquals(actualEmail, expected);
    }

    @Step("Verify value of Company Name is updated is {0}}")
    public void verifyValueCompanyName(String value, String expected) {
        String actualCompany = getElementAttribute(driver, MyAccountPageUI.COMPANY_TEXTBOX, value);
        Assert.assertEquals(actualCompany, expected);
    }

    @Step("Click to Address Link")
    public void clickToAddressLink() {
        clickToElement(driver, MyAccountPageUI.ADDRESSES_LINK);
    }

    @Step("Click to Add New button")
    public void clickToAddNewButton() {
        clickToElement(driver, MyAccountPageUI.ADD_NEW_BUTTON);
    }

    @Step("Input to first name textbox with value {0}")
    public void inputToFirstNameAddress(String firstName) {
        sendkeyToElement(driver, MyAccountPageUI.FIRSTNAME_TEXTBOX_ADD, firstName);
    }

    @Step("Input to last name textbox with value {0}")
    public void inputToLastNameAddress(String lastName) {
        sendkeyToElement(driver, MyAccountPageUI.LASTNAME_TEXTBOX_ADD, lastName);
    }

    @Step("Input to email textbox with value {0}")
    public void inputToEmailTextboxAddress(String email) {
        sendkeyToElement(driver, MyAccountPageUI.EMAIL_TEXTBOX_ADD, email);
    }

    @Step("Input to company textbox with value {0}")
    public void inputCompanyTextboxAddress(String company) {
        sendkeyToElement(driver, MyAccountPageUI.COMPANY_TEXTBOX_ADD, company);
    }

    @Step("Select value in country dropdown list with value {0}")
    public void selectCountryDropdown(String valueCountry) {
        selectItemInDropdow(driver, MyAccountPageUI.COUNTRY_DROPDOWN, valueCountry);
    }

    @Step("Input to city textbox with value {0}")
    public void inputToCityTextboxAddress(String city) {
        sendkeyToElement(driver, MyAccountPageUI.CITY_TEXTBOX, city);
    }

    @Step("Input to Address 1 textbox with value {0}")
    public void inputToAddress1Textbox(String address1) {
        sendkeyToElement(driver, MyAccountPageUI.ADDRESS1_TEXTBOX, address1);
    }

    @Step("Input to Address 2 textbox with value {0}")
    public void inputToAddress2Textbox(String address2) {
        sendkeyToElement(driver, MyAccountPageUI.ADDRESS2_TEXTBOX, address2);
    }

    @Step("Input to zip code textbox with value {0}")
    public void inputToZipCodeTextboxAddress(String zipCode) {
        sendkeyToElement(driver, MyAccountPageUI.ZIPCODE_TEXTBOX, zipCode);
    }

    @Step("Input to phone number textbox with value {0}")
    public void inputToPhoneTextboxAddress(String phone) {
        sendkeyToElement(driver, MyAccountPageUI.PHONE_TEXTBOX, phone);
    }

    @Step("Input to fax number textbox with value {0}")
    public void inputToFaxTextboxAddress(String fax) {
        sendkeyToElement(driver, MyAccountPageUI.FAX_TEXTBOX, fax);
    }

    @Step("Click to Save button")
    public void clickToSaveButtonAddress() {
        clickToElement(driver, MyAccountPageUI.SAVE_BUTTON_ADD);
    }

    @Step("Verify name (first + last name) is displayed is {0}")
    public void verifyNameAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.NAME);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify email is displayed is {0}")
    public void verifyEmailAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.EMAIL);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify phone number is displayed is {0}")
    public void verifyPhoneNumberAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.PHONE);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify fax number is displayed is {0}")
    public void verifyFaxNumberAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.FAX);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify company is displayed is {0}")
    public void verifyCompanyAddress(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.COMPANY);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify address 1 is displayed is {0}")
    public void verifyAddress1(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.ADDRESS1);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify address 2 is displayed is {0}")
    public void verifyAddress2(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.ADDRESS2);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify city + state + zip is displayed is {0}")
    public void verifyCityStateZip(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.CITY_STATE_ZIP);
        Assert.assertEquals(actual, expected);
    }

    @Step("Verify country is displayed is {0}")
    public void verifyCountry(String expected) {
        String actual = getTextElement(driver, MyAccountPageUI.COUNTRY);
        Assert.assertEquals(actual, expected);
    }

    @Step("Click to Change Password Link")
    public void clickToChangePasswordLink() {
        clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_LINK);
    }

    @Step("Input Old Password to textbox with value {0}")
    public void inputToOldPasswordTextbox(String oldPassword) {
        sendkeyToElement(driver, MyAccountPageUI.OLD_PASSWORD_TEXTBOX, oldPassword);
    }

    @Step("Input New Password to textbox with value {0}")
    public void inputToNewPasswordTextbox(String newPassword) {
        sendkeyToElement(driver, MyAccountPageUI.NEW_PASSWORD_TEXTBOX, newPassword);
    }

    @Step("Input Confirm New Password to textbox with value {0}")
    public void inputToConfirmPasswordTextbox(String cfPassword) {
        sendkeyToElement(driver, MyAccountPageUI.CONFIRM_PASSWORD_TEXTBOX, cfPassword);
    }

    @Step("Click to Change Password button")
    public void clickToChangePasswordButton() {
        clickToElement(driver, MyAccountPageUI.CHANGE_PASSWORD_BUTTON);
    }

    @Step("Verify Change Password Successfully")
    public void verifyChangePasswordSuccessfully() {
        boolean notice = isControlDisplayed(driver, MyAccountPageUI.NOTICE_SUCCESSFULLY);
        Assert.assertTrue(notice);
    }

    @Step("Click to My Product Reviews link")
    public void clickToMyProductReviewsLink() {
        clickToElement(driver, MyAccountPageUI.PRODUCT_REVIEW_LINK);
    }

    @Step("Verify Review Title is displayed is {0}")
    public void verifyTitleIsDisplayed(String expected) {
        getItemInListItem(driver, MyAccountPageUI.REVIEW_TITLE, expected);
    }

    @Step("Verify content Review Text is displayed is {0}")
    public void verifyContentReviewTextIsDisplayed(String expected) {
        getItemInListItem(driver, MyAccountPageUI.REVIEW_CONTENT, expected);
    }

    @Step("Verify Product added is displayed is {0}")
    public void verifyProductAdded(String expected) {
        getItemInListItem(driver, MyAccountPageUI.PRODUCT_ADDED_TEXT, expected);
    }
}


