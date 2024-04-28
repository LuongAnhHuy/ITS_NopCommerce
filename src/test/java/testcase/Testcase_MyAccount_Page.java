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
    //private static final Logger logger = LogManager.getLogger();
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

    @Story("Update")
    @Severity(SeverityLevel.NORMAL)
    @Description("Update information and check update successfully")
    @Test()
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


    @Story("Add Address")
    @Severity(SeverityLevel.NORMAL)
    @Description("Add Address and check update successfully")
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
    public void Testcase_03_Change_password() {
        logger.info("Testcase 03 --- My account - Change password ---");
        myAccountPageObject = new MyAccountPageObject(driver);

        logger.info("Testcase 03 - Step 01: Click to Change Password Link");
        myAccountPageObject.clickToChangePasswordLink();

        logger.info("Testcase 03 - Step 02: Input Old Password to textbox");
        myAccountPageObject.inputToOldPasswordTextbox(DataTests.old_password);

        logger.info("Testcase 03 - Step 03: Input New Password to textbox");
        myAccountPageObject.inputToNewPasswordTextbox(DataTests.new_password);

        logger.info("Testcase 03 - Step 04: Input Confirm New Password to textbox");
        myAccountPageObject.inputToConfirmPasswordTextbox(DataTests.cf_password);

        logger.info("Testcase 03 - Step 05: Click to Change Password textbox");
        myAccountPageObject.clickToChangePasswordButton();

        logger.info("Testcase 03 - Step 06: Verify Change Password Successfully");
        myAccountPageObject.verifyChangePasswordSuccessfully();

        refreshToPage(driver);

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 03 - Step 07: Login - Input new email after update Customer Info");
        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        logger.info("Testcase 03 - Step 08: Login - Input old password to textbox");
        loginPageObject.inputToPassword(DataTests.old_password);

        logger.info("Testcase 03 - Step 09: Login - Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 03 - Step 10: Login - Verify message incorrect email is displayed");
        loginPageObject.verifyNotExistEmail(DataTests.incorrectEmail);

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 03 - Step 11: Login - Click to login link");
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 03 - Step 12: Login - Input new email after update Customer Info");
        loginPageObject.inputToEmailTextbox(DataTests.new_email);

        logger.info("Testcase 03 - Step 13: Login - Input new password after change password");
        loginPageObject.inputToPassword(DataTests.new_password);

        logger.info("Testcase 03 - Step 14: Login - CLick to login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 03 - Step 15: Login - Verify login successfully");
        loginPageObject.verifyLoginSuccessfully();
        refreshToPage(driver);
    }

    @Test
    public void Testcase_04_My_Product_Review() {
        logger.info("Testcase 04 --- My account - My product reviews ---");

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 04 - Step 01: Click to NopCommerce Header");
        headerPageObject.clickToNopCommerceHeader();

        searchObject = new SearchObject(driver);

        logger.info("Testcase 04 - Step 02: Input data to Search box");
        searchObject.inputToSearchBox(DataTests.search_mac);

        logger.info("Testcase 04 - Step 03: Select item to Search box");
        searchObject.selectToItemInSearchBox(DataTests.name_product);

        logger.info("Testcase 04 - Step 04: Click to Add Review link");
        searchObject.clickToAddReviewLink();

        productReviewsObject = new ProductReviewsObject(driver);

        logger.info("Testcase 04 - Step 05: Input Review Title to textbox");
        productReviewsObject.inputToReviewTitleTextbox(DataTests.review_title);

        logger.info("Testcase 04 - Step 06: Input Review Text to textbox");
        productReviewsObject.inputToReviewTextArea(DataTests.review_text);

        logger.info("Testcase 04 - Step 07: Select Rating radio button");
        productReviewsObject.clickRatingRadioButton();

        logger.info("Testcase 04 - Step 08: Click to Submit Review button");
        productReviewsObject.clickSubmitReviewButton();

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 04 - Step 09: Click to My Account link");
        headerPageObject.clickToMyAccountLink();

        myAccountPageObject = new MyAccountPageObject(driver);

        logger.info("Testcase 04 - Step 09: Click to My Product Reviews link");
        myAccountPageObject.clickToMyProductReviewsLink();

        logger.info("Testcase 04 - Step 10: Verify Review Title is displayed");
        myAccountPageObject.verifyTitleIsDisplayed(DataTests.review_title);

        logger.info("Testcase 04 - Step 11: Verify content Review Text is displayed");
        myAccountPageObject.verifyContentReviewTextIsDisplayed(DataTests.review_text);

        logger.info("Testcase 04 - Step 12: Verify Product added is displayed");
        myAccountPageObject.verifyProductAdded(DataTests.product_added);
    }
}
