package tests;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTests extends BaseTests {


    @Test
    public void radioOneLogoIsDisplayed() {
        // open Homepage
        homepage.openHomePage();
        //wait for Homepage to load
        homepage.waitForHomePageLoad();
        // click Listen
        homepage.clickListen();
        // check on homepage
        homepage.waitForHomePageLoad();
        // check logos are present
        Assert.assertEquals(true, homepage.radioOneLogoDisplayed());
        Assert.assertEquals(true, homepage.radioTwoLogoDisplayed());
        // go to Stations page
        homepage.clickStations();
        // check logos are not present
        Assert.assertEquals(false, homepage.radioOneLogoDisplayed());
        Assert.assertEquals(false, homepage.radioTwoLogoDisplayed());

    }


}
