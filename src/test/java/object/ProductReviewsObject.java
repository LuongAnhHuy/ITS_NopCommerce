package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ui.ProductReviewsUI;

public class ProductReviewsObject extends AbstractPage {
    WebDriver driver;
    public ProductReviewsObject (WebDriver driver){
        this.driver = driver;
    }

    @Step("Input Review Title to textbox with value {0}")
    public void inputToReviewTitleTextbox(String value) {
        sendkeyToElement(driver, ProductReviewsUI.REVIEW_TITLE_TEXTBOX, value);
    }

    @Step("Input Review Text to textbox with value {0}")
    public void inputToReviewTextArea(String value) {
        sendkeyToElement(driver, ProductReviewsUI.REVIEW_TEXTAREA, value);
    }

    @Step("Select Rating radio button with value {0}")
    public void clickRatingRadioButton() {
        clickToElement(driver, ProductReviewsUI.GOOD_RADIOBUTTON);
    }

    @Step("Click to Submit Review button with value {0}")
    public void clickSubmitReviewButton() {
        clickToElement(driver, ProductReviewsUI.SUBMIT_REVIEW_BUTTON);
    }
}
