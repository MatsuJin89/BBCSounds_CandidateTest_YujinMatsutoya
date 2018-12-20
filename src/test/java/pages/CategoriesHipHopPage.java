package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesHipHopPage extends BasePage {

    // constructor
    public CategoriesHipHopPage(WebDriver driver){super(driver);}

    // page elements
    By categoriesTitle = By.xpath("//a[text()=\'Categories:\']");
    By sortOrderPopular = By.xpath("//ul[@class=\'list-inline sort-links\']//a[contains(@href,\'popular\')]/../..");
    By sortOrderLatest = By.xpath("//ul[@class=\'list-inline sort-links\']//a[contains(@href,\'available\')]/../..");
    By sortOrderAz = By.xpath("//ul[@class=\'list-inline sort-links\']//a[contains(@href,\'title\')]/../..");

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
