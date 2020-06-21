package com.signalTelecom.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    //this driver is for cross browser test and read the driver type from xml file
    private Driver() {
    }
    private static WebDriver driver;
    //This one I am calling from the test base cross browser
    public static WebDriver getDriver(String browser) {
        String hubURL="http://ec2-100-26-169-123.compute-1.amazonaws.com:4444/wd/hub";
        if (driver == null) {
            //if xml browser is not null, it will use it in the xml file
            //if xml browser is null, the browser will come from Config Properties File
            browser = browser == null ? ConfigReader.getProperty("browser") : browser;
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver=new SafariDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "remotehub":
                    DesiredCapabilities capabilities =new DesiredCapabilities();
                    capabilities.setBrowserName("chrome");
                    capabilities.setPlatform(Platform.ANY);
                    ChromeOptions options=new ChromeOptions();
                    options.merge(capabilities);
                    try {
                        driver=new RemoteWebDriver(new URL(hubURL),options);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
            }
        }
        return driver;
    }
    public static WebDriver getDriver() {

        return getDriver(null);
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
