package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {

    public static WebDriver driver;
    public static ChromeOptions options;

    public static WebDriverWait wait;

    public BrowserDriver(){
        if(driver==null){
            options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            System.setProperty("webdriver.chrome.drvier", System.getProperty("user.dir")+"/src/test/resources/driver/chromedriver.exe");
            this.driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
            wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        }
    }

    public void close(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
