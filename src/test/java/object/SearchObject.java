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

    public void selectToItemInSearchBox(String equal) {
        List<WebElement> allItems = finds(driver, SearchUI.SEARCH_ITEM);
        for (WebElement item : allItems) {
            if (item.getText().equals(equal)){
                item.click();
            }
        }
    }

    public void clickToAddReviewLink() {
        clickToElement(driver, SearchUI.ADD_YOUR_REVIEW);
    }
}
