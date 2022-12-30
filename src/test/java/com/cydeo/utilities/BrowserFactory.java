package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browserType) {


        if ((System.getProperty("os.name").equalsIgnoreCase("Windows 11") && browserType.equals("safari")) || (System.getProperty("os.name").equalsIgnoreCase("Mac") && browserType.equals("edge"))) {
            return null;
        }

        if (browserType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            //System.setProperty("webdriver.edge.driver", "C://EdgeDriver.exe");
            return new EdgeDriver();
        }  else if(browserType.equals("Safari")) {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }    else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }
}
