package ui;

public class MyAccountPageUI {
    public static final String FEMALE_RADIO_BUTTON = "//input[@id='gender-female']";
    public static final String FIRSTNAME_TEXTBOX = "//input[@id='FirstName']";
    public static final String LASTNAME_TEXTBOX = "//input[@id='LastName']";
    public static final String DAY_DROPDOWN = "//select[@name='DateOfBirthDay']";
    public static final String MONTH_DROPDOWN = "//select[@name='DateOfBirthMonth']";
    public static final String YEAR_DROPDOWN = "//select[@name='DateOfBirthYear']";
    public static final String EMAIL_TEXTBOX = "//input[@name='Email']";
    public static final String COMPANY_TEXTBOX = "//input[@name='Company']";
    public static final String SAVE_BUTTON = "//button[@name='save-info-button']";
    public static final String DAY_SELECTED = "//select[@name='DateOfBirthDay']//option[@selected]";
    public static final String MONTH_SELECTED = "//select[@name='DateOfBirthMonth']//option[@selected]";
    public static final String YEAR_SELECTED = "//select[@name='DateOfBirthYear']//option[@selected]";
    public static final String ADDRESSES_LINK = "//li[@class='customer-addresses inactive']//a[text()='Addresses']";
    public static final String ADD_NEW_BUTTON = "//button[@type='button' and text() ='Add new']";

    public static final String FIRSTNAME_TEXTBOX_ADD = "//input[@id='Address_FirstName']";
    public static final String LASTNAME_TEXTBOX_ADD = "//input[@id='Address_LastName']";
    public static final String EMAIL_TEXTBOX_ADD = "//input[@id='Address_Email']";
    public static final String COMPANY_TEXTBOX_ADD = "//input[@id='Address_Company']";
    public static final String COUNTRY_DROPDOWN = "//select[@id='Address_CountryId']";
    public static final String CITY_TEXTBOX = "//input[@id='Address_City']";
    public static final String ADDRESS1_TEXTBOX = "//input[@id='Address_Address1']";
    public static final String ADDRESS2_TEXTBOX = "//input[@id='Address_Address2']";
    public static final String ZIPCODE_TEXTBOX = "//input[@id='Address_ZipPostalCode']";
    public static final String PHONE_TEXTBOX = "//input[@id='Address_PhoneNumber']";
    public static final String FAX_TEXTBOX = "//input[@id='Address_FaxNumber']";
    public static final String SAVE_BUTTON_ADD = "//button[@class='button-1 save-address-button']";

    public static final String NAME = "//li[@class='name']";
    public static final String EMAIL = "//li[@class='email']";
    public static final String PHONE = "//li[@class='phone']";
    public static final String FAX = "//li[@class='fax']";
    public static final String COMPANY = "//li[@class='company']";
    public static final String ADDRESS1 = "//li[@class='address1']";
    public static final String ADDRESS2 = "//li[@class='address2']";
    public static final String CITY_STATE_ZIP = "//li[@class='city-state-zip']";
    public static final String COUNTRY = "//li[@class='country']";

    public static final String CHANGE_PASSWORD_LINK = "//li[@class='change-password inactive']//a[text()='Change password']";
    public static final String OLD_PASSWORD_TEXTBOX = "//input[@id='OldPassword']";
    public static final String NEW_PASSWORD_TEXTBOX = "//input[@id='NewPassword']";
    public static final String CONFIRM_PASSWORD_TEXTBOX = "//input[@id='ConfirmNewPassword']";
    public static final String CHANGE_PASSWORD_BUTTON = "//button[@type='submit' and text()='Change password']";
    public static final String NOTICE_SUCCESSFULLY = "//p[@class='content']";
    public static final String CLOSE_BUTTON = "//span[@class='close']";

    public static final String PRODUCT_REVIEW_LINK = "//li[@class='customer-reviews inactive']//a";
    public static final String REVIEW_TITLE = "//div[@class='page-body']//div//div//div//strong";
    public static final String REVIEW_CONTENT = "//div[@class='page-body']//div//div[@class='review-content']//div[@class='review-text']";
    public static final String PRODUCT_ADDED_TEXT = "//div[@class='review-info']//span//a";

}