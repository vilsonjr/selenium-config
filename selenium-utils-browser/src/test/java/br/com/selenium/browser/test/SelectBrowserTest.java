package br.com.selenium.browser.test;

import br.com.selenium.browser.BrowserFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vilson on 31/07/2015.
 */
public class SelectBrowserTest {
    private WebDriver driver;

    @Test
    public void selectChromeBrowserTest(){
        driver = BrowserFactory.create("Chrome");
    }

    @Test
    public void selectFirefoxBrowserTest(){
        driver = BrowserFactory.create("Firefox");
    }

    @Test
    public void selectSafariBrowserTest(){
        driver = BrowserFactory.create("Safari");
    }
}
