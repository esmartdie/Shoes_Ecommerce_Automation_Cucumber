package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

public class RegistrationSuccessfulPage {

    private WebDriver driver;

    @FindBy(xpath="//center/h1")
    private WebElement successMessage;

    public RegistrationSuccessfulPage (WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
