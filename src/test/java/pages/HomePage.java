package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburgerMenuXpath = "//div[@id=\"menuToggle\"]/input";
    public static String signInLinkXpath = "//*[@id=\"menu\"]/a/li[text()=\"Sign In Portal\"]";

    public static void clickHamburgerMenu() throws InterruptedException{
        Thread.sleep(2000); //implement wait
        driver.findElement(By.xpath(hamburgerMenuXpath)).click();
    }

    public static void clickSignInLink() throws InterruptedException{
        Thread.sleep(2000); //implement wait
        driver.findElement(By.xpath(signInLinkXpath)).click();
    }
}
