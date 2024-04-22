package object;

import common.AbstractPage;
import org.openqa.selenium.WebDriver;
import ui.SearchUI;

public class SearchObject extends AbstractPage {
    WebDriver driver;
    public SearchObject(WebDriver driver){
        this.driver = driver;
    }

    public void inputToSearchBox(String value) {
        sendkeyToElement(driver, SearchUI.SEARCH_BOX, value);
    }

    public void selectToItemInSearchBox() {
        clickToElement(driver, SearchUI.SEARCH_ITEM);
    }

    public void clickToSearchButton() {
    }
}
