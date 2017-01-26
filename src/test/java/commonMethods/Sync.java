package test.java.commonMethods;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Sync {

    private static WebDriver driver;

    public Sync(WebDriver driver) {

        this.driver = driver;

    }

    public void verificarPaginaAtualURL(String URL) throws Exception {

        try {

            URL = driver.getCurrentUrl();

        } catch (Exception e) {

            throw new Exception("URL atual não confere com a passada: " + URL + " Erro: " + e);

        }
    }

    public void waitElementBy(final By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public WebElement fluentWaitElementBy(final By locator) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(5, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(
                new Function<WebDriver, WebElement>() {
                    public WebElement apply(WebDriver driver) {
                        return driver.findElement(locator);
                    }
                }
        );
        return foo;
    };
}
