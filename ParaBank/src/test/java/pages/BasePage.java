package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver remoteDriver){
        this.driver = remoteDriver;
        PageFactory.initElements(this.driver, this);
    }
}
