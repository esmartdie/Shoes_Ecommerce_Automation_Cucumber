package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;

import java.time.Duration;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(xpath="//center/h1")
    private WebElement header;

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "lastname")
    private WebElement lastNameInput;

    @FindBy(id = "emailId")
    private WebElement emailInput;

    @FindBy(id="contactNumber")
    private WebElement contactNumberInput;

    @FindBy(id = "usr")
    private WebElement userInput;

    @FindBy(id = "pwd")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
    private WebElement registerButton;


    @FindBy(id = "Salutation")
    private WebElement salutation;

    public RegistrationPage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void selectSalutation(String pronoun) {
        Select dropdown = new Select(salutation);
        dropdown.selectByVisibleText(pronoun);
    }

    public void enterContactNumber(String contactNumber) {
        contactNumberInput.sendKeys(contactNumber);
    }
    public void enterUsername(String username) {
        userInput.sendKeys(username);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }
    public String getHeader() {
        return header.getText();
    }


}
