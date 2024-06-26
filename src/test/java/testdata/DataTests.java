package testdata;

import commons.AbstractPage;

public class DataTests extends AbstractPage {
    // Data: Register Page
    public static final String firstName = "Van A";
    public static final String lastName = "Nguyen";
    public static final String email = "automationfc" + randomNumber() + "@gmail.com";

    public static final String emailRegistered = email;
    public static final String errorMail = "automationfc@gmail";
    public static final String password = "huy123456";
    public static final String errorPassword = "12345";
    public static final String cfPassword = password;

    // Data: Login Page
    public static final String emailNotRegister = "automationfc@gmail.com";
    public static final String passwordIncorrect = "hahaha123";

    // Expected Error Message
    public static final String notFoundEmail = "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found";
    public static final String incorrectEmail = "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect";

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

    // Data: Add Address
    public static final String firstName_ADD = "Automation";
    public static final String lastName_ADD = "FC";
    public static final String email_ADD = "automationfc.vn@gmail.com";
    public static final String company_ADD = "Automation FC";
    public static final String country_ADD = "Viet Nam";
    public static final String city_ADD = "Da Nang";
    public static final String address1_ADD = "123/04 Le Lai";
    public static final String address2_ADD = "234/05 Hai Phong";
    public static final String zipCode_ADD = "550000";
    public static final String phoneNumber_ADD = "0123456789";
    public static final String faxNumber_ADD = "0987654321";

    // Data: Verify Add Address
    public static final String name_verify = firstName_ADD + " " +lastName_ADD;
    public static final String email_verify = "Email: " + email_ADD;
    public static final String phoneNumber_verify = "Phone number: " + phoneNumber_ADD;
    public static final String faxNumber_verify = "Fax number: " + faxNumber_ADD;
    public static final String company_verify = company_ADD;
    public static final String address1_verify = address1_ADD;
    public static final String address2_verify = address2_ADD;
    public static final String city_verify = city_ADD;
    public static final String zip_code_verify = zipCode_ADD;
    public static final String country_verify = country_ADD;

    // Data Change Password
    public static final String new_email = email_MA;
    public static final String old_password = password;
    public static final String new_password = "123456";
    public static final String cf_password = new_password;

    // Data Search
    public static final String search_mac = "mac";
    public static final String name_product = "Apple MacBook Pro 13-inch";

    // Data: Product Review
    public static final String review_title = "automation";
    public static final String review_text = "test";
    public static final String product_added = name_product;

}
