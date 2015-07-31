package br.com.selenium.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Vilson on 31/07/2015.
 */
public class ChromeConfig implements BrowserConfig {

    public WebDriver config() {
        System.setProperty("webdriver.chrome.driver", getChromeDriver());
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    private String getChromeDriver() {
        String driver = System.getProperty("selenium_chrome_driver");
        return driver != null ? driver : "C:\\chromedriver.exe";

    }
}
