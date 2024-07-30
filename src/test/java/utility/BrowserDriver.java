package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    public static WebDriver driver;

    public BrowserDriver(){
        if(driver==null){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("disable-gpu");
            options.addArguments("no-sandbox");
            options.addArguments("remote-allow-origins=*");
            options.addArguments("disable-first-run-ui");
            options.addArguments("no-default-browser-check");
            options.addArguments("disable-default-apps");
            options.addArguments("disable-popup-blocking");
            options.addArguments("disable-infobars");
            options.addArguments("disable-notifications");
            options.addArguments("disable-search-engine-choice-screen");
            //System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.drvier", System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
            this.driver=new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");

        }
    }
    public static WebDriver getDriver() {
        return driver;
    }


    public static void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
