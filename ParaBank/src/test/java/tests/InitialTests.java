package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.Constants;

public class InitialTests extends BaseTest {
    @Test
    public void successfulRegister() {

        driver.findElement(By.partialLinkText("Register")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys(Constants.CLIENT_FIRST_NAME);
        driver.findElement(By.id("customer.lastName")).sendKeys(Constants.CLIENT_LAST_NAME);
        driver.findElement(By.id("customer.address.street")).sendKeys(Constants.CLIENT_STREET);
        driver.findElement(By.id("customer.address.city")).sendKeys(Constants.CLIENT_CITY);
        driver.findElement(By.id("customer.address.state")).sendKeys(Constants.CLIENT_STATE);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys(Constants.CLIENT_ZIP);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys(Constants.CLIENT_PHONE);
        driver.findElement(By.id("customer.ssn")).sendKeys(Constants.CLIENT_SSN);
        driver.findElement(By.id("customer.username")).sendKeys(Constants.CLIENT_USERNAME);
        driver.findElement(By.id("customer.password")).sendKeys(Constants.CLIENT_PWD);
        driver.findElement(By.id("repeatedPassword")).sendKeys(Constants.CLIENT_PWD);
        driver.findElement(By.xpath("//*[@value='Register']")).click();


    }
}
