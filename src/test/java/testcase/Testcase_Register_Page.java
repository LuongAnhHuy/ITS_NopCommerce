package testcase;

import common.BaseTest;
import object.RegisterPageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase_Register_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    RegisterPageObject registerPageObject;
    String currentURL, firstName, lastName, email, errorMail, password, cfPassword;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }
    @AfterClass
    public void afterClass() {
        closedBrowser();
    }

    @Test
    public void Testcase_01_Register_with_empty_data() {
        logger.info("Testcase 01 --- Register with empty data ---");

        logger.info("Testcase 01 - Step 01: Open Nopcommerce Page");
        openUrl(driver, "https://demo.nopcommerce.com/");
        currentURL = getCurrentUrl(driver);

        registerPageObject = new RegisterPageObject(driver);

        logger.info("Testcase 01 - Step 02: Click to Register Link");
        registerPageObject.clickToRegisterLink();

        logger.info("Testcase 01 - Step 03: Click to Register Button");
        registerPageObject.clickToRegisterButton();

        logger.info("Testcase 01 - Step 04: Verify displays First Name error message");
        registerPageObject.verifyFirstNameErrorMessage("First name is required.");

        logger.info("Testcase 01 - Step 05: Verify displays Last Name error message");
        registerPageObject.verifyLastNameErrorMessage("Last name is required.");

        logger.info("Testcase 01 - Step 06: Verify displays Email error message");
        registerPageObject.verifyEmailErrorMessage("Email is required.");

        logger.info("Testcase 01 - Step 07: Verify displays Password error message");
        registerPageObject.verifyPasswordErrorMessage("Password is required.");

        logger.info("Testcase 01 - Step 08: Verify displays Confirm Password error message");
        registerPageObject.verifyConfirmPasswordErrorMessage("Password is required.");
    }

    @Test
    public void Testcase_02_Register_with_invalid_email() {
        firstName = "Van A";
        lastName = "Nguyen";
        errorMail = "automationFC";
        email = "automationFC" + randomNumber() + "@gmail.com";
        password = "huy123456";
        cfPassword = password;

        logger.info("Testcase 02 --- Register with invalid email ---");
        refreshToPage(driver);

        logger.info("Testcase 02 - Step 01: Input to First Name textbox");
        registerPageObject.inputToFirstNameTextbox(firstName);

        logger.info("Testcase 02 - Step 02: Input to Last Name textbox");
        registerPageObject.inputToLastNameTextbox(lastName);

        logger.info("Testcase 02 - Step 03: Input to Email textbox");
        registerPageObject.inputToEmailNameTextbox(errorMail);

        logger.info("Testcase 02 - Step 04: Input to Password textbox");
        registerPageObject.inputToPasswordTextbox(password);

        logger.info("Testcase 02 - Step 05: Input to Confirm Password textbox");
        registerPageObject.inputToConfirmPasswordTextbox(cfPassword);

        logger.info("Testcase 02 - Step 06: Verify displays Wrong Email message");
        registerPageObject.VerifyWrongEmailMessage("Wrong email");
    }

    @Test
    public void Testcase_03_Register_successfully() {
        logger.info("Testcase 03 --- Register successfully ---");
        refreshToPage(driver);

        logger.info("Testcase 03 - Step 01: Input valid First Name to textbox");
        registerPageObject.inputValidFirstNameTextbox(firstName);

        logger.info("Testcase 03 - Step 02: Input valid Last Name to textbox");
        registerPageObject.inputValidLastNameTextbox(lastName);

        logger.info("Testcase 03 - Step 03: Input valid Email to textbox");
        registerPageObject.inputValidEmailTextbox(email);

        logger.info("Testcase 03 - Step 04: Input valid Password to textbox");
        registerPageObject.inputValidPasswordTextbox(password);

        logger.info("Testcase 03 - Step 05: Input valid Confirm Password to textbox");
        registerPageObject.inputValidConfirmPasswordTextbox(cfPassword);

        logger.info("Testcase 03 - Step 06: Click to Register button");
        registerPageObject.clickToRegisterButton();

        logger.info("Testcase 03 - Step 07: Verify success message is displayed");
        registerPageObject.verifySuccessMessage("Your registration completed");
    }

    @Test
    public void Testcase_04_Register_duplicate_email(){
        logger.info("Testcase 02 --- Register with duplicate email ---");
        openUrl(driver, currentURL);


    }
}
