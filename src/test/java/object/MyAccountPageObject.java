package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
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
}
