package testcase;

import common.BaseTest;
import object.HomePageObject;
import object.LoginPageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testdata.DataTests;

public class Testcase_Login_Page extends BaseTest {
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;
    HomePageObject homePageObject;
    LoginPageObject loginPageObject;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName){
        driver = getBrowserDriver(browserName);

        logger.info(" ----- Preconditons: Open Home Page ----- ");
        openUrl(driver, "https://demo.nopcommerce.com/");

        homePageObject = new HomePageObject(driver);

        logger.info(" ----- Preconditions: Navigate to Login page ----- ");
        homePageObject.clickToLoginButton();
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
        loginPageObject.inputInvalidEmail(DataTests.invalid_email);

        logger.info("Testcase 02 - Step 02: Click to Login button");
        loginPageObject.clickToLoginButton();

        logger.info("Testcase 02 - Step 03: Verify Wrong Email message is displayed");
        loginPageObject.verifyWrongEmailMessage();
    }

    @Test
    public void Testcase_03_Login_with_email_not_register() {
        logger.info("Testcase 03 --- Login with email not register ---");

        homePageObject.clickToLoginButton();

        loginPageObject.inputNotExistEmail(DataTests.email);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyNotExistEmail();
    }
}
