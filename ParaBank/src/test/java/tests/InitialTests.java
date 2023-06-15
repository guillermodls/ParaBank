package tests;

import org.testng.annotations.Test;

public class InitialTests extends BaseTest {
    @Test
    public void test1() throws InterruptedException {
        Thread.sleep(5000);
        landingPage.clickOnRegisterButton();
    }
}
