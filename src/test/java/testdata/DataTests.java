package testdata;

import common.AbstractPage;
import common.BaseTest;

public class DataTests extends AbstractPage {
    // Data: Register Page
    public static final String firstName = "Van A";
    public static final String lastName = "Nguyen";
    public static final String email = "automationfc" + randomNumber() + "@gmail.com";

    public static final String emailRegistered = email;
    public static final String errorMail = "automationfc";
    public static final String password = "huy123456";
    public static final String errorPassword = "12345";
    public static final String cfPassword = password;

    // Data: Login Page
    public static final String emailNotRegister = "automationfc@gmail.com";
    public static final String passwordIncorrect = "hahaha123";

    // Expected Error Message
    public static final String notFoundEmail = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
    public static final String incorrectEmail = "Login was unsuccessful. Please correct the errors and try again.\n" + "The credentials provided are incorrect";

    // Data: My Account
    public static final String firstName_MA = "Automation";
    public static final String lastName_MA = "FC";
    public static final String day_MA = "1";
    public static final String month_MA = "January";
    public static final String year_MA = "1999";
    public static final String email_MA = "automationfc.vn" + randomNumber() + "@gmail.com";
    public static final String companyName_MA = "Automation FC";

    // Data: Attribute
    public static final String valueAttribute = "value";
    public static final String valueAttributeDOB = "selected";
}
