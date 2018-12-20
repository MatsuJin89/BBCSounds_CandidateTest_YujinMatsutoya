package tests;

import org.junit.Assert;
import org.junit.Test;
import pages.StationsPage;

public class StationsPageTests extends BaseTests {

    @Test
    public void checkStationsLogosDisplayed(){
        // open Homepage
        homepage.openHomePage();
        // wait for Homepage to load
        homepage.waitForHomePageLoad();
        // go to Stations page
        StationsPage stationspage = homepage.clickStations();
        //wait for Stations Page to load
        stationspage.waitForStationsPageToLoad();
        // check that there are 17 network station logos
        Assert.assertEquals(17, stationspage.countRadioStations());
    }
}
