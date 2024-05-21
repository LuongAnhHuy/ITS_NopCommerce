package testcase;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import object.HeaderPageObject;
import object.RegisterPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.DataTests;

public class TestRegisterPage extends BaseTest {
    WebDriver driver;
    RegisterPageObject registerPageObject;
    HeaderPageObject headerPageObject;
    String currentURL;

    @Story("Create and Run Browser")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Run On Browser")
    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }
    @AfterClass
    public void afterClass() {
        quitBrowser();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Register with empty data")
    @Test
    public void Testcase_01_Register_with_empty_data() {
        logger.info("Testcase 01 --- Register with empty data ---");

        logger.info("Testcase 01 - Step 01: Open Nopcommerce Page");
        openUrl(driver, "https://demo.nopcommerce.com/");
        currentURL = getCurrentUrl(driver);

        headerPageObject = new HeaderPageObject(driver);
        headerPageObject.clickToRegisterLink();

        registerPageObject = new RegisterPageObject(driver);
        registerPageObject.clickToRegisterButton();

        registerPageObject.verifyFirstNameErrorMessage("First name is required.");

        registerPageObject.verifyLastNameErrorMessage("Last name is required.");

        registerPageObject.verifyEmailErrorMessage("Email is required.");

//        logger.info("Testcase 01 - Step 07: Verify displays Password error message");
//        registerPageObject.verifyPasswordErrorMessage("Password is required.");

        verifyTrue(registerPageObject.verifyConfirmPasswordErrorMessage());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Register with invalid email")
    @Test
    public void Testcase_02_Register_with_invalid_email() {

        logger.info("Testcase 02 --- Register with invalid email ---");
        refreshToPage(driver);

        registerPageObject.inputToFirstNameTextbox(DataTests.firstName);

        registerPageObject.inputToLastNameTextbox(DataTests.lastName);

        registerPageObject.inputToEmailNameTextbox(DataTests.errorMail);

        registerPageObject.inputToPasswordTextbox(DataTests.password);

        registerPageObject.inputToConfirmPasswordTextbox(DataTests.cfPassword);

        verifyTrue(registerPageObject.VerifyWrongEmailMessage());
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Register successfully")
    @Test
    public void Testcase_03_Register_successfully() {
        logger.info("Testcase 03 --- Register successfully ---");
        refreshToPage(driver);

        registerPageObject.inputValidFirstNameTextbox(DataTests.firstName);

        registerPageObject.inputValidLastNameTextbox(DataTests.lastName);

        registerPageObject.inputValidEmailTextbox(DataTests.email);

        registerPageObject.inputValidPasswordTextbox(DataTests.password);

        registerPageObject.inputValidConfirmPasswordTextbox(DataTests.cfPassword);

        registerPageObject.clickToRegisterButton();

        verifyTrue(registerPageObject.verifySuccessMessage());

        registerPageObject.clickToContinueButton();

        headerPageObject = new HeaderPageObject(driver);
        headerPageObject.clickToLogoutLink();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Register with duplicate email")
    @Test
    public void Testcase_04_Register_duplicate_email(){
        logger.info("Testcase 04 --- Register with duplicate email ---");

        headerPageObject.clickToRegisterLink();

        registerPageObject = new RegisterPageObject(driver);

        registerPageObject.inputToFirstNameTextbox(DataTests.firstName);

        registerPageObject.inputToLastNameTextbox(DataTests.lastName);

        registerPageObject.inputToEmailNameTextbox(DataTests.emailRegistered);

        registerPageObject.inputToPasswordTextbox(DataTests.password);

        registerPageObject.inputToConfirmPasswordTextbox(DataTests.cfPassword);

        registerPageObject.clickToRegisterButton();

        verifyTrue(registerPageObject.verifyDuplicateErrorMessage());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Register with password less than 6 characters")
    @Test
    public void Testcase_05_Register_with_password_less_than_6_characters(){

        logger.info("Testcase 05 --- Register with password less than 6 characters ---");
        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToRegisterLink();

        registerPageObject = new RegisterPageObject(driver);

        registerPageObject.inputToPasswordTextbox(DataTests.errorPassword);

        registerPageObject.clickToRegisterButton();

        //verifyTrue(registerPageObject.verifyMessageLessThanDisplay());
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Register with confirm password not match password")
    @Test
    public void Testcase_06_Register_with_confirm_password_not_match_password() {
        logger.info("Testcase 06 --- Register with confirm password not match password ---");
        refreshToPage(driver);

        registerPageObject.inputToPasswordTextbox(DataTests.password);

        registerPageObject.inputToConfirmPasswordTextbox(DataTests.errorPassword);

        registerPageObject.clickToRegisterButton();

        verifyTrue(registerPageObject.verifyMessageNotMatch());
    }
}
