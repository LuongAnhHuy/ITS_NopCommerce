package testdata;

import common.BaseTest;

public class DataTests extends BaseTest {
    // Data: Register Page
    public static final String firstName = "Van A";
    public static final String lastName = "Nguyen";
    public static final String email = "automationFC" + randomNumber() + "@gmail.com";
    public static final String dupEmail = email;
    public static final String errorMail = "automationFC";
    public static final String password = "huy123456";
    public static final String errorPassword = "12345";
    public static final String cfPassword = password;

    // Data: Login Page
    public static final String invalid_email = "automationFC";

}
