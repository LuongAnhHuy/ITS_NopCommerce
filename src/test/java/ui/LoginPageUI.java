package ui;

public class LoginPageUI {
    public static final String LOGIN_BUTTON = "//button[@class='button-1 login-button']";
    public static final String EMAIL_TEXTBOX = "//input[@class='email']";
    public static final String PASSWORD_TEXTBOX = "//input[@class='password']";

    public static final String EMAIL_ERROR_MESSAGE = "//span[@id='Email-error' and text()='Please enter your email']";
    public static final String EMAIL_WRONG_MESSAGE = "//span[@id='Email-error' and text()='Wrong email']";
    public static final String EMAIL_NOT_EXIST_MESSAGE = "//div[@class='message-error validation-summary-errors']";

}
