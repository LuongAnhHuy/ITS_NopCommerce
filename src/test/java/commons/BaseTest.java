package commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeSuite;
import testdata.GlobalContants;

import java.io.File;

public class BaseTest extends AbstractPage {
    private WebDriver driver;
    protected final Logger logger;

    public BaseTest(){
        logger = LogManager.getLogger(getClass());
    }

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeSuite
    public void deleteFileInReport() {
        deleteAllFileInFolder("allure-json");
    }

    public WebDriver getBrowserDriver(String browserName) {
        switch (browserName) {
            case "chrome":
                //WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                //WebDriverManager.chromedriver().clearDriverCache().setup();
                WebDriverManager.chromedriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new RuntimeException("Please enter the correct Browser name!!!");
        }

        maximizeBrowsers(driver);
        implicitWaitBrowser(driver);
        return driver;
    }


    public WebDriver quitBrowser() {
        closeBrowsers(driver);
        return driver;
    }
    public void deleteAllFileInFolder(String folderName) {
        try {
            String pathFolderDownload = GlobalContants.PROJECT_PATH + File.separator + folderName;
            File file = new File(pathFolderDownload);
            File[] listOfFiles = file.listFiles();
            for (int i = 0; i < (listOfFiles != null ? listOfFiles.length : 0); i++) {
                if (listOfFiles[i].isFile() && !listOfFiles[i].getName().equals("environment.properties")) {
                    new File(listOfFiles[i].toString()).delete();
                }
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

}

