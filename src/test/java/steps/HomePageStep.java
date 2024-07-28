package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import utility.BrowserDriver;

import static org.junit.Assert.assertTrue;

public class HomePageStep extends BrowserDriver {

    private WebDriver driver;
    private HomePage homePage;

    public HomePageStep() {
        this.driver = BrowserDriver.getDriver();
        this.homePage = new HomePage(driver);
    }

    @Given("I open the home page")
    public void iOpenTheHomePage() {
        assertTrue(homePage.isTitleDisplayed("Ace Online Shoe Portal"));
    }

    @Then("I should see the header {string}")
    public void iShouldSeeTheHeader(String headerText) {
        assertTrue(homePage.isHeaderDisplayed(headerText));
    }

    @Then("I should see the main banner with text {string}")
    public void iShouldSeeTheMainBannerWithText(String bannerText) {
        assertTrue(homePage.isMainBannerDisplayed(bannerText));
    }
}
