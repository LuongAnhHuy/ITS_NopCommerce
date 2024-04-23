package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import ui.ProductReviewsUI;

public class ProductReviewsObject extends AbstractPage {
    WebDriver driver;
    public ProductReviewsObject (WebDriver driver){
        this.driver = driver;
    }

    public void inputToReviewTitleTextbox(String value) {
        sendkeyToElement(driver, ProductReviewsUI.REVIEW_TITLE_TEXTBOX, value);
    }

    public void inputToReviewTextArea(String value) {
        sendkeyToElement(driver, ProductReviewsUI.REVIEW_TEXTAREA, value);
    }

    public void clickRatingRadioButton() {
        clickToElement(driver, ProductReviewsUI.GOOD_RADIOBUTTON);
    }

    public void clickSubmitReviewButton() {
        clickToElement(driver, ProductReviewsUI.SUBMIT_REVIEW_BUTTON);
    }
}
