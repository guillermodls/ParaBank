package pages;

import com.beust.ah.A;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
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
    @FindBy (id = "customer.firstName.errors")
    public WebElement firstNameError;
    @FindBy (id = "customer.lastName.errors")
    public WebElement lastNameError;
    @FindBy(id = "customer.address.street.errors")
    public WebElement addressError;
    @FindBy (id = "customer.address.city.errors")
    public WebElement cityError;
    @FindBy(id = "customer.address.state.errors")
    public WebElement stateError;
    @FindBy(id = "customer.address.zipCode.errors")
    public WebElement zipCodeError;
    @FindBy(id = "customer.ssn.errors")
    public WebElement ssnError;
    @FindBy(id = "customer.username.errors")
    public WebElement usernameError;
    @FindBy(id = "customer.password.errors")
    public WebElement pwdError;
    @FindBy (id = "repeatedPassword.errors")
    public WebElement pwdConfError;


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
    public void verifyFirstNameError(){
        Assert.assertTrue(firstNameError.isDisplayed());
    }
    public void verifyLastNameError(){
        Assert.assertTrue(lastNameError.isDisplayed());
    }
    public void verifyAddressError(){
        Assert.assertTrue(addressError.isDisplayed());
    }
    public void verifyCityError(){
        Assert.assertTrue(cityError.isDisplayed());
    }
    public void verifyStateError(){
        Assert.assertTrue(stateError.isDisplayed());
    }
    public void verifyZipCodeError(){
        Assert.assertTrue(zipCodeError.isDisplayed());
    }
    public void verifySsnError(){
        Assert.assertTrue(ssnError.isDisplayed());
    }
    public void verifyUsernameError(){
        Assert.assertTrue(usernameError.isDisplayed());
    }
    public void verifyPwdError(){
        Assert.assertTrue(pwdError.isDisplayed());
    }
    public void verifyPwdConfError(){
        Assert.assertTrue(pwdConfError.isDisplayed());
    }

}
