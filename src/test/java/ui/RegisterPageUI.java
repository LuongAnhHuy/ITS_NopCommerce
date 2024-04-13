package ui;

public class RegisterPageUI {
    public static final String REGISTER_BUTTON = "//button[@name='register-button']";
    public static final String FIRSTNAME_MESSAGE = "//span[@id='FirstName-error']";
    public static final String LASTNAME_MESSAGE = "//span[@id='LastName-error']";
    public static final String EMAIL_MESSAGE = "//span[@id='Email-error']";
    public static final String PASSWORD_MESSAGE = "//span[@id='Password-error']";
    public static final String CONFIRM_PASSWORD_MESSAGE = "//span[@id='ConfirmPassword-error']";

    public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
    public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']";
    public static final String EMAIL_TEXTBOX = "//input[@id='Email']";
    public static final String PASSWORD_TEXTBOX = "//input[@id='Password']";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmPassword']";
    public static final String WRONG_EMAIL_MESSAGE = "//span[@id='Email-error']";

    public static final String SUCCESS_MESSAGE = "//div[@class='result']";
    public static final String CONTINUE_BUTTON = "//a[@class='button-1 register-continue-button']";
    public static final String DUPLICATE_MESSAGE = "//div[@class='message-error validation-summary-errors']//li";

    public static final String PASSWORD_LESS_THAN_MESSAGE = "//span[@id='Password-error']";
    public static final String PASSWORD_NOT_MATCH_MESSAGE = "//span[@id='ConfirmPassword-error']";
}
