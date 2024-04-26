package testcase;

import commons.BaseTest;
import object.HeaderPageObject;
import object.LoginPageObject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.DataTests;

public class Testcase_Login_Page extends BaseTest {
//    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    HeaderPageObject headerPageObject;
    LoginPageObject loginPageObject;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName){
        driver = getBrowserDriver(browserName);

        logger.info(" ----- Preconditons: Open Home Page ----- ");
        openUrl(driver, "https://demo.nopcommerce.com/");

        headerPageObject = new HeaderPageObject(driver);

        logger.info(" ----- Preconditions: Navigate to Login page ----- ");
        headerPageObject.clickToLoginLink();
    }

    @AfterClass
    public void afterClass() {
        quitBrowser();
    }

    @Test
    public void Testcase_01_Login_with_empty_data(){
        logger.info("Testcase 01 --- Login with empty data ---");
        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 01 - Step 01: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 01 - Step 02: Verify Email error message is displayed");
        loginPageObject.verifyEmailErrorMessage();
    }

    @Test
    public void Testcase_02_Login_with_invalid_email() {

        logger.info("Testcase 02 --- Login with empty email ---");
        refreshToPage(driver);

        logger.info("Testcase 02 - Step 01: Input invalid data to mail textbox");
        loginPageObject.inputInvalidEmail(DataTests.errorMail);

        logger.info("Testcase 02 - Step 02: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 02 - Step 03: Verify Wrong Email message is displayed");
        loginPageObject.verifyWrongEmailMessage();
    }

    @Test
    public void Testcase_03_Login_with_email_not_register() {
        logger.info("Testcase 03 --- Login with email not register ---");

        refreshToPage(driver);

        logger.info("Testcase 03 - Step 01: Input not exist email to textbox");
        loginPageObject.inputToEmailTextbox(DataTests.emailNotRegister);

        logger.info("Testcase 03 - Step 02: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 03 - Step 03: Verify message not exist email is displayed");
        loginPageObject.verifyNotExistEmail(DataTests.notFoundEmail);
    }

    @Test
    public void Testcase_04_Login_with_email_registered_and_not_input_password(){
        logger.info("Testcase 04 --- Login with email registered and not input password ---");

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 04 - Step 01: Click to Login link");
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 04 - Step 02: Input email registered to textbox");
        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        logger.info("Testcase 04 - Step 03: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 04 - Step 04: Verify error message is displayed");
        loginPageObject.verifyErrorMessage(DataTests.incorrectEmail);
    }

    @Test
    public void Testcase_05_Login_with_email_registered_and_password_incorrect(){
        logger.info("Testcase 05 --- Login with email registered and password incorrect ---");

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 05 - Step 01: Click to Login link");
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 05 - Step 02: Input email registered to textbox");
        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        logger.info("Testcase 05 - Step 03: Input incorrect password to textbox");
        loginPageObject.inputToPassword(DataTests.passwordIncorrect);

        logger.info("Testcase 05 - Step 04: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 05 - Step 05: Verify error message is displayed");
        loginPageObject.verifyErrorMessage(DataTests.incorrectEmail);
    }

    @Test
    public void Testcase_06_Login_with_correct_email_and_correct_password() {
        logger.info("Testcase 06 --- Login with correct email and correct password ---");

        headerPageObject = new HeaderPageObject(driver);

        logger.info("Testcase 06 - Step 01: Click to Login link");
        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        logger.info("Testcase 06 - Step 02: Input correct email to textbox");
        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        logger.info("Testcase 06 - Step 03: Input correct password to textbox");
        loginPageObject.inputToPassword(DataTests.password);

        logger.info("Testcase 06 - Step 04: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 06 - Step 05: Verify login successfully and My Account is displayed");
        loginPageObject.verifyLoginSuccessfully();
    }
}
