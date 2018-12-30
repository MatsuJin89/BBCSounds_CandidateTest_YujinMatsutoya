package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StationsPage extends BasePage {

    // constructor
    public StationsPage(WebDriver driver){
        super(driver);
    }

    // page elements
    By bbcRadioOneLogo = By.xpath("//img[@alt=\'BBC Radio 1\']");

    // page methods
    public void waitForStationsPageToLoad(){
        waitVisibility(driver.findElement(bbcRadioOneLogo));
    }

    public int countRadioStations(){
        // populate List with station logo elements
        List <WebElement> stations =  driver.findElements(By.xpath("//img[@class=\'station-logo\']"));
        return stations.size();
    }

}
