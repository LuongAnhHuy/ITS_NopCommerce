package object;

import common.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ui.MyAccountPageUI;

public class MyAccountPageObject extends AbstractPage {
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
}
