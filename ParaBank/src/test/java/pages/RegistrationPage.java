package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;
import utils.Variables;

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

    public void successfullyEnterRegistrationInformation(String firstName,String lastName,String address,String zipCode,String city,String state,String ssn,String phoneNumber,String username,String password) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        streetField.sendKeys(address);
        cityField.sendKeys(city);
        stateField.sendKeys(state);
        zipCodeField.sendKeys(zipCode);
        phoneNumberField.sendKeys(phoneNumber);
        ssnField.sendKeys(ssn);
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        confirmPwdField.sendKeys(password);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}
