package ca.automation.glue;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

/**
 * created by Shoby on 2019-11-28
 **/

public class StepHooks {

    public static WebDriver driver;


    @Before
    public void launchBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver");
        if(ConfigReader.getPropertyvalue("browser").equals("chrome")) {
            driver=new ChromeDriver();
        }
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }
}
