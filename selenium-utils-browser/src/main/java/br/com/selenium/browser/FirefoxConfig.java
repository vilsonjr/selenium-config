package br.com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Vilson on 31/07/2015.
 */
public class FirefoxConfig implements BrowserConfig {
    public WebDriver config() {
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
