package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.BrowserDriver;

import javax.xml.xpath.XPath;

public class HomePage extends BrowserDriver {

    @FindBy(xpath="//div[@id=\"menuToggle\"]/input")
    public static WebElement hamburgerMenuXpath;
    @FindBy(xpath="//*[@id=\"menu\"]/a/li[text()=\"Sign In Portal\"]")
    public static WebElement signInLinkXpath;
    @FindBy(xpath="//*[@id=\"menu\"]/a/li[text()=\"Online Products\"]")
    public static WebElement onlineProductsXpath;
    @FindBy(xpath="//*[@id=\"menu\"]/a/li[text()=\"About\"]")
    public static WebElement about;


    public static void clickHamburgerMenu() throws InterruptedException{
        WebElement hamburgerMenu = wait.until(ExpectedConditions.visibilityOf((hamburgerMenuXpath)));
        hamburgerMenu.click();
    }

    public static void clickSignInLink() throws InterruptedException{
        WebElement signInLink = wait.until(ExpectedConditions.visibilityOf(signInLinkXpath));
        signInLink.click();
    }

    public static void clickOnlineProductsLink() throws InterruptedException{
        WebElement OnlineProductsLink = wait.until(ExpectedConditions.visibilityOf(onlineProductsXpath));
        OnlineProductsLink.click();
    }
    public static void clickAboutLink() throws InterruptedException{
        WebElement AboutLink = wait.until(ExpectedConditions.visibilityOf(about));
        AboutLink.click();
    }

}
