package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SignInSteps {

    private WebDriver driver;

    private HomePage homePage;
    private SignInPage signInPage;
    private ProductCategoryPage productCategoryPage;

    public SignInSteps() {
        this.driver = BrowserDriver.getDriver();
        this.homePage = new HomePage(driver);
        this.signInPage = new SignInPage(driver);
        this.productCategoryPage = new ProductCategoryPage(driver);
    }


    @Given("User navigates to the Login page")
    public void userNavigatesToTheLoginPage() {
        homePage.clickHamburgerMenu();
        homePage.clickSignInLink();
        assertTrue(signInPage.isUserNameFieldVisible());
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        signInPage.clickLoginButton();
    }
    @Then("User should be able to view the product category page")
    public void userShouldBeAbleToViewTheProductCategoryPage() {
        assertEquals(productCategoryPage.getCurrentUrl(), "https://anupdamoda.github.io/AceOnlineShoePortal/ShoeTypes.html");
    }
}
