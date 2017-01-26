package test.java.commonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static test.java.utils.Path.getPathDriver;

public class DriverInstanceWeb {

    private static WebDriver driver;

    public static WebDriver instance(){

        if (driver == null) {

            System.setProperty("webdriver.gecko.driver", getPathDriver() + "geckodriver.exe");
            DesiredCapabilities dc = DesiredCapabilities.firefox();
            dc.setCapability("marionette", true);
            driver = new FirefoxDriver(dc);
            driver.manage().window().maximize();
            return driver;
        }

        return driver;
    }

}
