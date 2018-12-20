package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class BaseTests {

    public static WebDriver driver;
    HomePage homepage = new HomePage(driver);

    @BeforeClass
    public static void setup(){
        // set chromedriver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Yujin.Matsutoya\\Documents\\chromedriver_win32\\chromedriver.exe");
        // create a Chrome driver
        driver = new ChromeDriver();
        // maximise window
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
