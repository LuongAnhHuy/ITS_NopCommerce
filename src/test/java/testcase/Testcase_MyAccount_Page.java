package testcase;

import commons.BaseTest;
import io.qameta.allure.*;
import object.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.DataTests;

@Epic("Regresstion Test")
@Feature("User")
public class Testcase_MyAccount_Page extends BaseTest {
    WebDriver driver;
    HeaderPageObject headerPageObject;
    LoginPageObject loginPageObject;
    MyAccountPageObject myAccountPageObject;
    SearchObject searchObject;
    ProductReviewsObject productReviewsObject;

    @Story("Create and Run Browser")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Run On Browser")
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

    @Severity(SeverityLevel.NORMAL)
    @Description("Update information user and verify update successfully")
    @Test()
    public void Testcase_01_Update_information_user() {
        logger.info("Testcase 01 --- Update information user ---");
        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToMyAccountLink();

        myAccountPageObject = new MyAccountPageObject(driver);

        myAccountPageObject.selectGender();

        myAccountPageObject.inputToFirstName(DataTests.firstName_MA);

        myAccountPageObject.inputToLastName(DataTests.lastName_MA);

        myAccountPageObject.selectDateOfBirthDropdown(DataTests.day_MA, DataTests.month_MA, DataTests.year_MA);

        myAccountPageObject.inputToEmailTextbox(DataTests.email_MA);

        myAccountPageObject.inputCompanyTextbox(DataTests.companyName_MA);

        myAccountPageObject.clickToSaveButton();

        logger.info("Testcase 01 --- Verify information user ---");

        myAccountPageObject.verifyGender();

        myAccountPageObject.verifyValueFirstName(DataTests.valueAttribute, DataTests.firstName_MA);

        myAccountPageObject.verifyValueLastName(DataTests.valueAttribute, DataTests.lastName_MA);

        myAccountPageObject.verifyValueDateOfBirth(DataTests.day_MA, DataTests.month_MA, DataTests.year_MA);

        myAccountPageObject.verifyValueEmail(DataTests.valueAttribute, DataTests.email_MA);

        myAccountPageObject.verifyValueCompanyName(DataTests.valueAttribute, DataTests.companyName_MA);

        refreshToPage(driver);

    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Add new address and check update successfully")
    @Test
    public void Testcase_02_Add_address() {
        logger.info("Testcase 02 --- My account - Add new address ---");

        myAccountPageObject = new MyAccountPageObject(driver);

        myAccountPageObject.clickToAddressLink();

        myAccountPageObject.clickToAddNewButton();

        myAccountPageObject.inputToFirstNameAddress(DataTests.firstName_ADD);

        myAccountPageObject.inputToLastNameAddress(DataTests.lastName_ADD);

        myAccountPageObject.inputToEmailTextboxAddress(DataTests.email_ADD);

        myAccountPageObject.inputCompanyTextboxAddress(DataTests.company_ADD);

        myAccountPageObject.selectCountryDropdown(DataTests.country_ADD);

        myAccountPageObject.inputToCityTextboxAddress(DataTests.city_ADD);

        myAccountPageObject.inputToAddress1Textbox(DataTests.address1_ADD);

        myAccountPageObject.inputToAddress2Textbox(DataTests.address2_ADD);

        myAccountPageObject.inputToZipCodeTextboxAddress(DataTests.zipCode_ADD);

        myAccountPageObject.inputToPhoneTextboxAddress(DataTests.phoneNumber_ADD);

        myAccountPageObject.inputToFaxTextboxAddress(DataTests.faxNumber_ADD);

        myAccountPageObject.clickToSaveButtonAddress();

        logger.info("Testcase 02 --- Verify Add Address Successfully ---");

        myAccountPageObject.verifyNameAddress(DataTests.name_verify);

        myAccountPageObject.verifyEmailAddress(DataTests.email_verify);

        myAccountPageObject.verifyPhoneNumberAddress(DataTests.phoneNumber_verify);

        myAccountPageObject.verifyFaxNumberAddress(DataTests.faxNumber_verify);

        myAccountPageObject.verifyCompanyAddress(DataTests.company_verify);

        myAccountPageObject.verifyCity(DataTests.city_verify);

        myAccountPageObject.verifyAddress1(DataTests.address1_verify);

        myAccountPageObject.verifyAddress2(DataTests.address2_verify);

        myAccountPageObject.verifyZipCode(DataTests.zip_code_verify);

        myAccountPageObject.verifyCountry(DataTests.country_verify);
        refreshToPage(driver);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Change password and verify login successfully after change password")
    @Test
    public void Testcase_03_Change_password() {
        logger.info("Testcase 03 --- My account - Change password ---");
        myAccountPageObject = new MyAccountPageObject(driver);

        myAccountPageObject.clickToChangePasswordLink();

        myAccountPageObject.inputToOldPasswordTextbox(DataTests.old_password);

        myAccountPageObject.inputToNewPasswordTextbox(DataTests.new_password);

        myAccountPageObject.inputToConfirmPasswordTextbox(DataTests.cf_password);

        myAccountPageObject.clickToChangePasswordButton();

        myAccountPageObject.verifyChangePasswordSuccessfully();

        refreshToPage(driver);

        headerPageObject = new HeaderPageObject(driver);
        headerPageObject.clickToLogoutLink();
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 03 - Login - Input new email after update Customer Info");
        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        logger.info("Testcase 03 - Login - Input old password to textbox");
        loginPageObject.inputToPassword(DataTests.old_password);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyNotExistEmail(DataTests.incorrectEmail);

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 03 - Login - Input new email after update Customer Info");
        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        logger.info("Testcase 03 - Login - Input new password after change password");
        loginPageObject.inputToPassword(DataTests.new_password);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyLoginSuccessfully();
        refreshToPage(driver);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Update information product review and verify information display correct")
    @Test
    public void Testcase_04_My_Product_Review() {
        logger.info("Testcase 04 --- My account - My product reviews ---");

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToNopCommerceHeader();

        searchObject = new SearchObject(driver);

        searchObject.inputToSearchBox(DataTests.search_mac);

        searchObject.selectToItemInSearchBox(DataTests.name_product);

        searchObject.clickToAddReviewLink();

        productReviewsObject = new ProductReviewsObject(driver);

        productReviewsObject.inputToReviewTitleTextbox(DataTests.review_title);

        productReviewsObject.inputToReviewTextArea(DataTests.review_text);

        productReviewsObject.clickRatingRadioButton();

        productReviewsObject.clickSubmitReviewButton();

        refreshToPage(driver);

        headerPageObject = new HeaderPageObject(driver);
        headerPageObject.clickToMyAccountLink();

        myAccountPageObject = new MyAccountPageObject(driver);

        myAccountPageObject.clickToMyProductReviewsLink();

        myAccountPageObject.verifyTitleIsDisplayed(DataTests.review_title);

        myAccountPageObject.verifyContentReviewTextIsDisplayed(DataTests.review_text);

        myAccountPageObject.verifyProductAdded(DataTests.product_added);
    }
}