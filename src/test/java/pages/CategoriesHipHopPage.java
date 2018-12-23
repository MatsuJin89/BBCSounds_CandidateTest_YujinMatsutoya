package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesHipHopPage extends BasePage {

    // constructor
    public CategoriesHipHopPage(WebDriver driver){super(driver);}


    // page elements
    By categoriesTitle = By.xpath("//a[contains(text(),\'Categories\')]");
    By sortOrderPopular = By.xpath("//a[@data-istats-sort_order_criteria = \'popular\']/../..");
    By sortOrderLatest = By.xpath("//a[@data-istats-sort_order_criteria = \'-available_from_date\']/../..");
    By sortOrderAz = By.xpath("//a[@data-istats-sort_order_criteria = \'title\']/../..");


    // page methods
    public void waitForCategoriesHipHopPageToLoad(){
        waitVisibility(driver.findElement(categoriesTitle));
    }

    public boolean sortPopularSelected(){
        return driver.findElement(sortOrderPopular).getAttribute("class").equals("sort-links__link active");
    }

    public void clickSortOrderPopular(){
        click(driver.findElement(sortOrderPopular));
    }

    public void clickSortOrderLatest(){
        click(driver.findElement(sortOrderLatest));
    }

    public void clickSortOrderAz(){
        click(driver.findElement(sortOrderAz));
    }


}
