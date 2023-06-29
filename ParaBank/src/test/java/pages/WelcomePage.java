package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class WelcomePage extends BasePage {
    @FindBy(xpath = "//h1[contains(text(),'Welcome')]")
    public WebElement welcomeMessage;

    public WelcomePage(WebDriver remoteDriver) {
        super(remoteDriver);
    }
//esto lo copie pero no lo entendi

    //explicar parametros y variables locales (no entendi por que le poniamos el parametro username a VerifY....)
    public void verifyWelcomeMessage(String username){
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        Assert.assertTrue(welcomeMessage.isDisplayed());
        Assert.assertEquals(checkForUsername(),username);

    }
    private String checkForUsername(){
        return welcomeMessage.getText().split(" ")[1];
    }

}
