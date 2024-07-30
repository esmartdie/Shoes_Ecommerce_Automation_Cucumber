package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

public class ProductCategoryPage {

    private WebDriver driver;
    @FindBy(id="SmokeTests")
    private WebElement formalShoes;
    @FindBy(css = ".btn.btn-info.FormalShoes")
    private WebElement formalShowsCollection;
    @FindBy(id="RegressionTests")
    private WebElement sports;
    @FindBy(id="VanguardTests")
    private WebElement sneakers;

    public ProductCategoryPage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }

}
