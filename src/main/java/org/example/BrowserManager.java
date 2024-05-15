package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Class Name
public class BrowserManager extends Utils {

    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();
    String sauceUrl = "https://oauth-aj.ajsinghhh-559a5:8c0f26a5-44f0-4153-80d0-f3ae57ae1693@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    //String browser = loadProp.getProperty("browser");
    String browser = System.getProperty("browser");
    // boolean cloud = true;
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));


    //Open Browser method And Type Url
    public void openBrowser() {

        //Running in cloud machine if the parameter cloud is true
        if (cloud) {
            System.out.println("Running in Cloud Machine");

            if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("Your Browser is Chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("121");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }

            } else if (browser.equalsIgnoreCase("safari")) {
                System.out.println("Your Browser is Safari");
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 12");
                browserOptions.setBrowserVersion("15");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }

            } else if (browser.equalsIgnoreCase("FireFox")) {
                System.out.println("Your Browser is Firefox");
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("browserName", "firefox");
                caps.setCapability("platform", "Windows 11");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), caps);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Incorrect Browser");
            }
        }

        // Running in local Machine if  the parameter cloud is false

        else {
            System.out.println("Running On Local Machine");

            if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("Your Browser is Chrome");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("safari")) {
                System.out.println("Your Browser is Safari");
                driver = new SafariDriver();
            } else if (browser.equalsIgnoreCase("FireFox")) {
                System.out.println("Your Browser is Firefox");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Incorrect Browser");
            }
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(loadProp.getProperty("url"));
    }

    public void closeBrowser() {
        driver.quit();
    }
}







