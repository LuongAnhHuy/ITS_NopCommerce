package testcase;

import common.BaseTest;
import object.HeaderPageObject;
import object.LoginPageObject;
import object.MyAccountPageObject;
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
    }

}
