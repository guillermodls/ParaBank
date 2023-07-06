package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.LandingPage;
import pages.RegistrationPage;
import pages.WelcomePage;
import utils.Variables;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public LandingPage landingPage;
    public RegistrationPage registrationPage;
    public WelcomePage welcomePage;
    //no me acordaba de hacer esto
    public Variables variable;

    @BeforeSuite
    public void suiteSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        landingPage = new LandingPage(driver);
        registrationPage = new RegistrationPage(driver);
        welcomePage = new WelcomePage(driver);
        variable = new Variables();

        //no me acordaba de que tenia que hacer esto
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
