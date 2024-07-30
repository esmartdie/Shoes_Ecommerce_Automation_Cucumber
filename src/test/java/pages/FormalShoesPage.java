package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BrowserDriver;

public class FormalShoesPage {

    private WebDriver driver;

    @FindBy(xpath="//center/h1")
    private WebElement header;

    @FindBy(xpath="//tbody/tr[1]/td/button[1]")
    private WebElement classicCheltenhamButton;

    public FormalShoesPage(WebDriver driver) {
        this.driver = BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    public String getHeader(){
        return header.getText();
    }

    public void classicCheltenhamButtonClick(){
        classicCheltenhamButton.click();
    }
}
