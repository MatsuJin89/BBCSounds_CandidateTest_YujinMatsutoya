package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.CategoriesHipHopPage;

public class CategoriesHipHopPageTests extends BaseTests{

    @Test
    public void sortedByPopular(){
        // open Homepage
        homepage.openHomePage();
        // wait for Homepage to load
        homepage.waitForHomePageLoad();
        // go to Categories: Hip Hop Page
        CategoriesHipHopPage hiphoppage = homepage.clickCategoriesHipHop();
        // wait for Categories: Hip Hop page to load
        hiphoppage.waitForCategoriesHipHopPageToLoad();
        // check that Sort by Popular is selected
        Assert.assertEquals(true,hiphoppage.sortPopularSelected());
        // click Sort by Latest
        hiphoppage.clickSortOrderLatest();
        // check that Sort by Popular is not selected
        Assert.assertEquals(false,hiphoppage.sortPopularSelected());
        // click Sort by Name
        hiphoppage.clickSortOrderAz();
        // check that Sort by Popular is not selected
        Assert.assertEquals(false,hiphoppage.sortPopularSelected());
        // click Sort by Popular
        hiphoppage.clickSortOrderPopular();
        // check that Sort by Popular is selected
        Assert.assertEquals(true,hiphoppage.sortPopularSelected());
    }
}
