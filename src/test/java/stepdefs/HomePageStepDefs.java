package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;


public class HomePageStepDefs {

    public static WebDriver driver;
    HomePage homepage;


    @Before
    public void initialisation() {
        // set chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yujin.Matsutoya\\Documents\\chromedriver_win32\\chromedriver.exe");
        // create a Chrome driver
        driver = new ChromeDriver();
        // maximise window
        driver.manage().window().maximize();
    }

    @After
    public void close_browser() {
        driver.close();
        driver.quit();
    }


    @Given("^I open the BBC Sounds Homepage$")
    public void i_open_bbc_sounds_homepage() throws Throwable {
        homepage = new HomePage(driver);
        homepage.openHomePage();
        homepage.waitForHomePageLoad();
    }

    @When("^I select the 'Listen' logo$")
    public void iSelectTheListenLogo() throws Throwable {
        homepage.waitForHomePageLoad();
        homepage.clickListen();
    }

    @Then("^I am on the BBC Sounds Homepage$")
    public void i_am_on_bbc_sounds_homepage() throws Throwable {
        homepage.waitForHomePageLoad();
        Assert.assertTrue(homepage.listenLiveHeaderDisplayed());
    }

    @And("^I can see the Radio 1 logo$")
    public void iCanSeeTheRadioLogo() throws Throwable {
        homepage.waitForHomePageLoad();
        Assert.assertTrue(homepage.radioOneLogoDisplayed());
    }

    @And("^I can see the Radio 2 logo$")
    public void iCanSeeThRadioLogo() throws Throwable {
        homepage.waitForHomePageLoad();
        Assert.assertTrue(homepage.radioTwoLogoDisplayed());
    }

}
