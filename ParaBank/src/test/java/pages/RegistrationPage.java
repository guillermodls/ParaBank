package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class RegistrationPage extends BasePage {
    @FindBy (id = "customer.firstName")
    public WebElement firstNameField;
    @FindBy (id = "customer.lastName")
    public WebElement lastNameField;
    @FindBy (id = "customer.address.street")
    public WebElement streetField;
    @FindBy (id = "customer.address.city")
    public WebElement cityField;
    @FindBy (id = "customer.address.state")
    public WebElement stateField;
    @FindBy (id = "customer.address.zipCode")
    public WebElement zipCodeField;
    @FindBy (id = "customer.phoneNumber")
    public WebElement phoneNumberField;
    @FindBy (id = "customer.ssn")
    public WebElement ssnField;
    @FindBy (id = "customer.username")
    public WebElement usernameField;
    @FindBy (id = "customer.password")
    public WebElement passwordField;
    @FindBy (id = "repeatedPassword")
    public WebElement confirmPwdField;
    @FindBy (xpath = "//*[@value='Register']")
    public WebElement registerButton;

    public RegistrationPage(WebDriver remoteDriver) {
        super(remoteDriver);
    }

    public void successfullyEnterRegistrationInformation() {
        firstNameField.sendKeys(Constants.CLIENT_FIRST_NAME);
        lastNameField.sendKeys(Constants.CLIENT_LAST_NAME);
        streetField.sendKeys(Constants.CLIENT_STREET);
        cityField.sendKeys(Constants.CLIENT_CITY);
        stateField.sendKeys(Constants.CLIENT_STATE);
        zipCodeField.sendKeys(Constants.CLIENT_ZIP);
        phoneNumberField.sendKeys(Constants.CLIENT_PHONE);
        ssnField.sendKeys(Constants.CLIENT_SSN);
        usernameField.sendKeys(Constants.CLIENT_USERNAME);
        passwordField.sendKeys(Constants.CLIENT_PWD);
        confirmPwdField.sendKeys(Constants.CLIENT_PWD);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
