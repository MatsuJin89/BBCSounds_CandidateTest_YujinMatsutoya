package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
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
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(webElement));
        wait.until(ExpectedConditions.visibilityOfAllElements(webElement));
    }

    //click method
    public void click(WebElement webElement) {
        waitVisibility(webElement);
//        driver.findElement(webElement).click();
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

    //asserts is visible
//    public boolean isVisible(WebElement webElement){
//        waitVisibility(webElement);
//        if( webElement!=null)
//            return true;
//        else if (webElement==null)
//            return false;
//    }


}
