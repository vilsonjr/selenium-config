package br.com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Vilson on 31/07/2015.
 */
public class SafariConfig implements BrowserConfig {
    public WebDriver config() {
        System.setProperty("webdriver.safari.noinstall", "true");
        WebDriver driver = new SafariDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
