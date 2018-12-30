package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    // constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // page variables
    String baseURL = "https://www.bbc.co.uk/sounds";

    //page elements

    By radioOneLogo = By.xpath("//*[name()=\'title\' and text()=\'Radio 1\']/parent::*[name()=\'svg\']");
    By radioTwoLogo = By.xpath("//*[name()=\'title\' and text()=\'Radio 2\']/parent::*[name()=\'svg\']");
    By listenLink = By.id("sn__listen-text");
    By stationsLink = By.xpath("//header//span[text()=\'Stations\']");
    By categoriesHipHop = By.xpath("//h2[text()=\'Hip Hop\']");
    By listenLiveHeader = By.xpath("//h2[text()=\'Listen Live\']");

    // page methods
    public HomePage openHomePage() {
        driver.get(baseURL);
        waitVisibility(driver.findElement(listenLiveHeader));
        return this;
    }

    public void waitForHomePageLoad() {
        waitVisibility(driver.findElement(listenLiveHeader));
    }

    public HomePage clickListen() {
        click(driver.findElement(listenLink));
        return this;
    }

    public StationsPage clickStations() {
        click(driver.findElement(stationsLink));
        return new StationsPage(driver);
    }

    public CategoriesHipHopPage clickCategoriesHipHop() {
        click(driver.findElement(categoriesHipHop));
        return new CategoriesHipHopPage(driver);
    }

    public boolean radioOneLogoDisplayed() { return driver.findElements(radioOneLogo).size() > 0; }

    public boolean radioTwoLogoDisplayed() {
        return driver.findElements(radioTwoLogo).size() > 0;
    }

    public boolean listenLiveHeaderDisplayed() {
        return driver.findElements(listenLiveHeader).size() > 0;
    }
}
