package testcase;

import commons.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import object.HeaderPageObject;
import object.LoginPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.DataTests;

public class TestLoginPage extends BaseTest {
    WebDriver driver;
    HeaderPageObject headerPageObject;
    LoginPageObject loginPageObject;

    @Story("Create and Run Browser")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Run On Browser")
    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName){
        driver = getBrowserDriver(browserName);

        logger.info(" ----- Preconditons: Open Home Page ----- ");
        openUrl(driver, "https://demo.nopcommerce.com/");

        headerPageObject = new HeaderPageObject(driver);
        headerPageObject.clickToLoginLink();
    }

    @AfterClass
    public void afterClass() {
        quitBrowser();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with empty data")
    @Test
    public void Testcase_01_Login_with_empty_data(){
        logger.info("Testcase 01 --- Login with empty data ---");
        loginPageObject = new LoginPageObject(driver);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyEmailErrorMessage();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with empty email")
    @Test
    public void Testcase_02_Login_with_invalid_email() {
        logger.info("Testcase 02 --- Login with empty email ---");
        refreshToPage(driver);

        loginPageObject.inputInvalidEmail(DataTests.errorMail);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyWrongEmailMessage();
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with email not register")
    @Test
    public void Testcase_03_Login_with_email_not_register() {
        logger.info("Testcase 03 --- Login with email not register ---");

        refreshToPage(driver);

        loginPageObject.inputToEmailTextbox(DataTests.emailNotRegister);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyNotExistEmail(DataTests.notFoundEmail);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with email registered and not input password")
    @Test
    public void Testcase_04_Login_with_email_registered_and_not_input_password(){
        logger.info("Testcase 04 --- Login with email registered and not input password ---");

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyErrorMessage(DataTests.incorrectEmail);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Login with email registered and password incorrect")
    @Test
    public void Testcase_05_Login_with_email_registered_and_password_incorrect(){
        logger.info("Testcase 05 --- Login with email registered and password incorrect ---");

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        loginPageObject.inputToPassword(DataTests.passwordIncorrect);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyErrorMessage(DataTests.incorrectEmail);
    }

    @Severity(SeverityLevel.MINOR)
    @Description("Login with correct email and correct password")
    @Test
    public void Testcase_06_Login_with_correct_email_and_correct_password() {
        logger.info("Testcase 06 --- Login with correct email and correct password ---");

        headerPageObject = new HeaderPageObject(driver);

        headerPageObject.clickToLoginLink();

        loginPageObject = new LoginPageObject(driver);

        loginPageObject.inputToEmailTextbox(DataTests.emailRegistered);

        loginPageObject.inputToPassword(DataTests.password);

        loginPageObject.clickToLoginButton();

        loginPageObject.verifyLoginSuccessfully();
    }
}
