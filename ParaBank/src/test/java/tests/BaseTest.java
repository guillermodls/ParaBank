package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.LandingPage;

public class BaseTest {
    public WebDriver driver;
    public LandingPage landingPage;

    @BeforeSuite
    public void suiteSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        landingPage = new LandingPage(driver);
    }
    @BeforeMethod
    public void testSetup(){
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
