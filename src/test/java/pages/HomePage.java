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
    By listenLink = By.xpath("//span[text()=\'Listen\']");
    By stationsLink = By.xpath("//header//span[text()=\'Stations\']");
    By categoriesHipHop = By.xpath("//h2[text()=\'Hip Hop\']");

    // page methods
    public HomePage openHomePage() {
        driver.get(baseURL);
        waitVisibility(driver.findElement(listenLink));
        return this;
    }

    public void waitForHomePageLoad() {
        waitVisibility(driver.findElement(listenLink));
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
}
