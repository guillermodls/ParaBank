package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage extends BasePage{

    @FindBy(name = "username")
    public WebElement usernameField;

    @FindBy(name = "password")
    public WebElement passwordField;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    public LandingPage (WebDriver remoteDriver){
        super(remoteDriver);
    }

    public void clickOnRegisterButton(){
        registerButton.click();
    }

    public void verifyUI(){
        Assert.assertTrue(usernameField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(registerButton.isDisplayed());
    }
}
