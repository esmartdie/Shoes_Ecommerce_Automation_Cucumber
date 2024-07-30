package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class SignInPage {
    private WebDriver driver;

    @FindBy(id="usr")
    private WebElement usernameField;
    @FindBy(xpath="//*[@id=\"pwd\"]")
    private WebElement passwordField;
    @FindBy(xpath="//*[@id=\"second_form\"]/input")
    private WebElement loginButton;
    @FindBy(xpath="//*[@id=\"NewRegistration\"]")
    private WebElement registrationButton;

    public SignInPage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void sendKeysUsername()
    {
        usernameField.sendKeys("QA");
    }

    public void sendKeysPassword()
    {
        passwordField.sendKeys("666");
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

    public void clickNewRegistrationButton()
    {
        registrationButton.click();
    }

    public boolean isUserNameFieldVisible(){
        return usernameField.isDisplayed();
    }
}
