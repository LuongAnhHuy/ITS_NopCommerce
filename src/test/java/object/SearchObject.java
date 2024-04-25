package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.SearchUI;

import java.util.List;

public class SearchObject extends AbstractPage {
    WebDriver driver;
    public SearchObject(WebDriver driver){
        this.driver = driver;
    }

    public void inputToSearchBox(String value) {
        sendkeyToElement(driver, SearchUI.SEARCH_BOX, value);
    }

    public void selectToItemInSearchBox(String expected) {
        clickItemInListItem(driver, SearchUI.SEARCH_ITEM, expected);
    }

    public void clickToAddReviewLink() {
        clickToElement(driver, SearchUI.ADD_YOUR_REVIEW);
    }
}
