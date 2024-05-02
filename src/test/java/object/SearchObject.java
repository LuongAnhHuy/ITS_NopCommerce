package object;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import ui.SearchUI;

public class SearchObject extends AbstractPage {
    WebDriver driver;
    public SearchObject(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input data to Search box with value {0}")
    public void inputToSearchBox(String value) {
        sendkeyToElement(driver, SearchUI.SEARCH_BOX, value);
    }

    @Step("Select item to Search box with value {0}")
    public void selectToItemInSearchBox(String expected) {
        clickItemInListItem(driver, SearchUI.SEARCH_ITEM, expected);
    }

    @Step("Click to Add Review link")
    public void clickToAddReviewLink() {
        waitToElementClickable(driver, SearchUI.ADD_YOUR_REVIEW);
        clickToElement(driver, SearchUI.ADD_YOUR_REVIEW);
    }
}
