package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

public class ProductAddedSuccessfullyPage {

    private WebDriver driver;

    @FindBy(xpath="//center/h1]")
    private WebElement header;

    public ProductAddedSuccessfullyPage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getHeader(){
        return header.getText();
    }

}
