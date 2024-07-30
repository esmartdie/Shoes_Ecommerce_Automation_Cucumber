package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pages.*;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class AddANewProductOnCartSteps {

    private WebDriver driver;

    private HomePage homePage;
    private SignInPage signInPage;
    private ProductCategoryPage productCategoryPage;
    private FormalShoesPage formalShoesPage;
    private ProductAddedSuccessfullyPage productAddedSuccessfullyPage;

    public AddANewProductOnCartSteps() {
        this.driver = BrowserDriver.getDriver();
        this.homePage = new HomePage(driver);
        this.signInPage= new SignInPage(driver);
        this.productCategoryPage= new ProductCategoryPage(driver);
        this.formalShoesPage= new FormalShoesPage(driver);
        this.productAddedSuccessfullyPage= new ProductAddedSuccessfullyPage(driver);
    }

    @Given("I view the product category page")
    public void iViewTheProductCategoryPage() {
        assertEquals(productCategoryPage.getCurrentUrl(), "https://anupdamoda.github.io/AceOnlineShoePortal/ShoeTypes.html");
    }
    @And("I click on the formal shoes button")
    public void iClickOnTheFormalShoesButton() {
        productCategoryPage.formalShowsCollectionClick();
    }
    @When("I click on the Add to Cart button")
    public void iClickOnTheButton() {
        formalShoesPage.classicCheltenhamButtonClick();
    }
    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String string) {
        assertEquals(formalShoesPage.getHeader(), "Added to Cart Successfully !!!");
    }
}
