package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BrowserDriver;


import java.time.Duration;
import java.util.logging.Logger;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath="//div[@id='menuToggle']/input")
    private WebElement hamburgerMenu;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='Sign In Portal']")
    private WebElement signInLink;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='Online Products']")
    private WebElement onlineProductsLink;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='About']")
    private WebElement aboutLink;

    @FindBy(xpath = "//font[@id='ShoePortalTitle']")
    private WebElement header;

    @FindBy(id="MainPageText")
    private WebElement mainBanner;

    @FindBy(tagName = "title")
    private WebElement title;

    public HomePage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void clickHamburgerMenu() {
        hamburgerMenu.click();
    }


    public void clickSignInLink() {
        signInLink.click();
    }

    public void clickOnlineProductsLink() {
        onlineProductsLink.click();
    }

    public void clickAboutLink() {
        aboutLink.click();
    }

    public boolean isHeaderDisplayed(String headerText) {
        return header.getText().equals(headerText);
    }

    public boolean isMainBannerDisplayed(String bannerText) {
        return mainBanner.getText().equals(bannerText);
    }

    public boolean isTitleDisplayed(String webTitle) {
        return driver.getTitle().equals(webTitle);
    }
}