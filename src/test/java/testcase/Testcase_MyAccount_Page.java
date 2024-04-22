package testcase;

import common.BaseTest;
import object.HeaderPageObject;
import object.LoginPageObject;
import object.MyAccountPageObject;
import object.SearchObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.DataTests;

public class Testcase_MyAccount_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    HeaderPageObject headerPageObject;
    LoginPageObject loginPageObject;
    MyAccountPageObject myAccountPageObject;
    SearchObject searchObject;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);

        logger.info(" ----- Preconditons: Open Home Page ----- ");
        openUrl(driver, "https://demo.nopcommerce.com/");

        headerPageObject = new HeaderPageObject(driver);

        logger.info(" ----- Preconditons: Navigate to Login Page ----- ");
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info(" ----- Preconditons: Login to Home Page ----- ");
        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);
        loginPageObject.inputToPassword(DataTests.password);
        loginPageObject.clickToLoginButton();

    }

    @AfterClass
    public void afterClass() {
        quitBrowser();
    }

    @Test
    public void Testcase_01_Update_information_user() {
        logger.info("Testcase 01 --- Update information user ---");
        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 01 - Step 01: Click to My Account Link");
        headerPageObject.clickToMyAccountLink();

        myAccountPageObject = new MyAccountPageObject(driver);

        logger.info("Testcase 01 - Step 02: Select Gender is Female");
        myAccountPageObject.selectGender();

        logger.info("Testcase 01 - Step 03: Update first name");
        myAccountPageObject.inputToFirstName(DataTests.firstName_MA);

        logger.info("Testcase 01 - Step 04: Update last name");
        myAccountPageObject.inputToLastName(DataTests.lastName_MA);

        logger.info("Testcase 01 - Step 05: Update date of birth");
        myAccountPageObject.selectDateOfBirthDropdown(DataTests.day_MA, DataTests.month_MA, DataTests.year_MA);

        logger.info("Testcase 01 - Step 06: Update email");
        myAccountPageObject.inputToEmailTextbox(DataTests.email_MA);

        logger.info("Testcase 01 - Step 07: Update company name");
        myAccountPageObject.inputCompanyTextbox(DataTests.companyName_MA);

        logger.info("Testcase 01 - Step 08: Click save button");
        myAccountPageObject.clickToSaveButton();

        logger.info("Testcase 01 --- Verify information user ---");

        myAccountPageObject.verifyGender();

        logger.info("Testcase 01 - Step 09: Verify Female is selected");
        myAccountPageObject.verifyValueFirstName(DataTests.valueAttribute, DataTests.firstName_MA);

        logger.info("Testcase 01 - Step 10: Verify value of first name is updated is Automation");
        myAccountPageObject.verifyValueLastName(DataTests.valueAttribute, DataTests.lastName_MA);

        logger.info("Testcase 01 - Step 11: Verify value of last name is updated is FC");
        myAccountPageObject.verifyValueDateOfBirth(DataTests.day_MA, DataTests.month_MA, DataTests.year_MA);

        logger.info("Testcase 01 - Step 12: Verify value of email is updated is automationfc.vn@gmail.com");
        myAccountPageObject.verifyValueEmail(DataTests.valueAttribute, DataTests.email_MA);

        logger.info("Testcase 01 - Step 13: Verify value of Company Name is updated is Automation FC");
        myAccountPageObject.verifyValueCompanyName(DataTests.valueAttribute, DataTests.companyName_MA);

        refreshToPage(driver);

    }

    @Test
    public void Testcase_02_Add_address() {
        logger.info("Testcase 02 --- My account - Add new address ---");

        myAccountPageObject = new MyAccountPageObject(driver);

        logger.info("Testcase 02 - Step 01: Click to Address Link");
        myAccountPageObject.clickToAddressLink();

        logger.info("Testcase 02 - Step 02: Click to Add New button");
        myAccountPageObject.clickToAddNewButton();

        logger.info("Testcase 02 - Step 03: Input to first name textbox");
        myAccountPageObject.inputToFirstNameAddress(DataTests.firstName_ADD);

        logger.info("Testcase 02 - Step 04: Input to last name textbox");
        myAccountPageObject.inputToLastNameAddress(DataTests.lastName_ADD);

        logger.info("Testcase 02 - Step 05: Input to email textbox");
        myAccountPageObject.inputToEmailTextboxAddress(DataTests.email_ADD);

        logger.info("Testcase 02 - Step 06: Input to company textbox");
        myAccountPageObject.inputCompanyTextboxAddress(DataTests.company_ADD);

        logger.info("Testcase 02 - Step 07: Select value in country dropdown list");
        myAccountPageObject.selectCountryDropdown(DataTests.country_ADD);

        logger.info("Testcase 02 - Step 08: Input to city textbox");
        myAccountPageObject.inputToCityTextboxAddress(DataTests.city_ADD);

        logger.info("Testcase 02 - Step 09: Input to Address 1 textbox");
        myAccountPageObject.inputToAddress1Textbox(DataTests.address1_ADD);

        logger.info("Testcase 02 - Step 10: Input to Address 2 textbox");
        myAccountPageObject.inputToAddress2Textbox(DataTests.address2_ADD);

        logger.info("Testcase 02 - Step 11: Input to zip code textbox");
        myAccountPageObject.inputToZipCodeTextboxAddress(DataTests.zipCode_ADD);

        logger.info("Testcase 02 - Step 12: Input to phone number textbox");
        myAccountPageObject.inputToPhoneTextboxAddress(DataTests.phoneNumber_ADD);

        logger.info("Testcase 02 - Step 13: Input to fax number textbox");
        myAccountPageObject.inputToFaxTextboxAddress(DataTests.faxNumber_ADD);

        logger.info("Testcase 02 - Step 14: Click to Save button");
        myAccountPageObject.clickToSaveButtonAddress();

        logger.info("Testcase 02 --- Verify Add Address Successfully ---");

        logger.info("Testcase 02 - Step 15: Verify name (first + last name) is displayed");
        myAccountPageObject.verifyNameAddress(DataTests.name_verify);

        logger.info("Testcase 02 - Step 16: Verify email is displayed");
        myAccountPageObject.verifyEmailAddress(DataTests.email_verify);

        logger.info("Testcase 02 - Step 17: Verify phone number is displayed");
        myAccountPageObject.verifyPhoneNumberAddress(DataTests.phoneNumber_verify);

        logger.info("Testcase 02 - Step 18: Verify fax number is displayed");
        myAccountPageObject.verifyFaxNumberAddress(DataTests.faxNumber_verify);

        logger.info("Testcase 02 - Step 19: Verify company is displayed");
        myAccountPageObject.verifyCompanyAddress(DataTests.company_verify);

        logger.info("Testcase 02 - Step 20: Verify address 1 is displayed");
        myAccountPageObject.verifyAddress1(DataTests.address1_verify);

        logger.info("Testcase 02 - Step 21: Verify address 2 is displayed");
        myAccountPageObject.verifyAddress2(DataTests.address2_verify);

        logger.info("Testcase 02 - Step 22: Verify city + state + zip is displayed");
        myAccountPageObject.verifyCityStateZip(DataTests.city_state_zip_verify);

        logger.info("Testcase 02 - Step 23: Verify country is displayed");
        myAccountPageObject.verifyCountry(DataTests.country_verify);
        refreshToPage(driver);
    }

    @Test
    public void Testcase_03_Change_password(){
        logger.info("Testcase 03 --- My account - Change password ---");
        myAccountPageObject = new MyAccountPageObject(driver);

        myAccountPageObject.clickToChangePasswordLink();

        myAccountPageObject.inputToOldPasswordTextbox(DataTests.old_password);

        myAccountPageObject.inputToNewPasswordTextbox(DataTests.new_password);

        myAccountPageObject.inputToConfirmPasswordTextbox(DataTests.cf_password);

        myAccountPageObject.clickToChangePasswordButton();

        myAccountPageObject.verifyChangePasswordSuccessfully();

        refreshToPage(driver);

        loginPageObject = new LoginPageObject(driver);

        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        loginPageObject.inputToPassword(DataTests.old_password);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyNotExistEmail(DataTests.incorrectEmail);

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        loginPageObject.inputToPassword(DataTests.new_password);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyLoginSuccessfully();
        refreshToPage(driver);
    }

    @Test
    public void Testcase_04_My_Product_Review(){
        logger.info("Testcase 04 --- My account - My product reviews ---");

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToNopCommerceHeader();

        searchObject = new SearchObject(driver);

        searchObject.inputToSearchBox(DataTests.mac);

        searchObject.selectToItemInSearchBox();
    }
}
