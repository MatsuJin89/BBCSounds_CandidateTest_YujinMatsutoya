package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    //constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //Wait Wrapper Method
    public void waitVisibility(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }

    //click method
    public void click(WebElement webElement) {
        waitVisibility(webElement);
        webElement.click();
    }

    //enter text into field method
    public void writeText(WebElement webElement, String text) {
        waitVisibility(webElement);
        webElement.sendKeys(text);
    }

    //read text
    public String readText(WebElement webElement){
        waitVisibility(webElement);
        return webElement.getText();
    }

}
