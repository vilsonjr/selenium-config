package br.com.selenium.browser;

import org.openqa.selenium.WebDriver;

/**
 * Created by Vilson on 31/07/2015.
 */
public class BrowserFactory {
    public static WebDriver create(String browser){
        if (browser.equals("Chrome")){
            return new ChromeConfig().config();
        } else if (browser.equals("Firefox")){
            return new FirefoxConfig().config();
        } else if (browser.equals("Safari")){
            return new SafariConfig().config();
        }
        return null;
    }
}
