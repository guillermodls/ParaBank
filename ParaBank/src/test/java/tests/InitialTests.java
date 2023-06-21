package tests;

import org.testng.annotations.Test;

public class InitialTests extends BaseTest {
    @Test
    public void successfulRegister() {
        landingPage.clickOnRegisterButton();
        registrationPage.successfullyEnterRegistrationInformation();
        registrationPage.clickRegisterButton();
    }
}
