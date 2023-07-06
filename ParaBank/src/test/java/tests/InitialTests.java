package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InitialTests extends BaseTest {
    @Test
    public void successfulRegister() {
        landingPage.clickOnRegisterButton();
        String newUsername = variable.getUsername();
        String newPwd = variable.getPwd();
        String newFirstName = variable.getFirstName();
        String newLastName = variable.getLastName();
        String newAddress = variable.getAddress();
        String newZip = variable.getZip();
        String newCity = variable.getCity();
        String newState = variable.getState();
        String newSsn = variable.getSsn();
        String newPhone = variable.getPhone();
        registrationPage.successfullyEnterRegistrationInformation(newFirstName,newLastName,newAddress,newZip,newCity,newState,newSsn,newPhone,newUsername,newPwd);
        registrationPage.clickRegisterButton();
        welcomePage.verifyWelcomeMessage(newUsername);

    }
}
