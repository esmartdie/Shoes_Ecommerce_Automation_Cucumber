package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath="//div[@id='menuToggle']/input")
    private WebElement hamburgerMenuXpath;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='Sign In Portal']")
    private WebElement signInLinkXpath;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='Online Products']")
    private WebElement onlineProductsXpath;

    @FindBy(xpath="//*[@id='menu']/a/li[text()='About']")
    private WebElement about;

    @FindBy(xpath = "//font[@id=\"ShoePortalTitle\"]")
    private WebElement header;

    @FindBy(id="MainPageText")
    private WebElement mainBanner;

    @FindBy(tagName = "title")
    private WebElement title;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void clickHamburgerMenu() {
        WebElement hamburgerMenu = wait.until(ExpectedConditions.visibilityOf(hamburgerMenuXpath));
        hamburgerMenu.click();
    }

    public void clickSignInLink() {
        WebElement signInLink = wait.until(ExpectedConditions.visibilityOf(signInLinkXpath));
        signInLink.click();
    }

    public void clickOnlineProductsLink() {
        WebElement onlineProductsLink = wait.until(ExpectedConditions.visibilityOf(onlineProductsXpath));
        onlineProductsLink.click();
    }

    public void clickAboutLink() {
        WebElement aboutLink = wait.until(ExpectedConditions.visibilityOf(about));
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
