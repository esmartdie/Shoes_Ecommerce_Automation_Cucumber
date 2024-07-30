package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.RegistrationPage;
import pages.RegistrationSuccessfulPage;
import pages.SignInPage;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegistrationPageStep {

    private WebDriver driver;
    private RegistrationPage registrationPage;
    private HomePage homePage;
    private SignInPage signInPage;

    private RegistrationSuccessfulPage registrationSuccessfulPage;

    public RegistrationPageStep() {
        this.driver = BrowserDriver.getDriver();
        this.registrationPage = new RegistrationPage(driver);
        this.homePage = new HomePage(driver);
        this.signInPage = new SignInPage(driver);
        this.registrationSuccessfulPage= new RegistrationSuccessfulPage(driver);
    }

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        homePage.clickHamburgerMenu();
        homePage.clickSignInLink();
        signInPage.clickNewRegistrationButton();
        assertEquals("User Registration Page", registrationPage.getHeader());
    }

    @When("I select {string} from Salutions dropdown")
    public void iSelectFromSalutionsDropdown(String salutation) {
        registrationPage.selectSalutation(salutation);
    }

    @When("I enter {string} as first name")
    public void iEnterAsFirstName(String firstName) {
        registrationPage.enterFirstName(firstName);
    }

    @When("I enter {string} as last name")
    public void iEnterAsLastName(String lastName) {
        registrationPage.enterLastName(lastName);
    }
    @When("I enter {string} as email")
    public void iEnterAsEmail(String email) {
        registrationPage.enterEmail(email);
    }
    @When("I enter {string} as contact number")
    public void iEnterContactNumber(String contactNumber) {
        registrationPage.enterContactNumber(contactNumber);
    }

    @When("I enter {string} as username")
    public void iEnterUsername(String username) {
        registrationPage.enterUsername(username);
    }

    @When("I enter {string} as password")
    public void iEnterPassword(String password) {
        registrationPage.enterPassword(password);
    }
    @When("I click the register button")
    public void iClickTheRegisterButton() {
        registrationPage.clickRegisterButton();
    }

    @Then("I should see the registration success message {string}")
    public void iShouldSeeTheRegistrationSuccessMessage(String expectedMessage) {
        assertEquals(registrationSuccessfulPage.getCurrentUrl(), "https://anupdamoda.github.io/AceOnlineShoePortal/RegistrationSuccessfulmessage.html");
        assertEquals(expectedMessage, registrationSuccessfulPage.getSuccessMessage());
    }



}
