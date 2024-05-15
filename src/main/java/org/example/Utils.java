package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.random;

//Class Name
public class Utils extends BasePage  {

    //Store Password
    public static String password = "Singh1";

    //Store Users Email With Time Stamp
    public static String email = "abed" + random() + "ajsingh@gmail.com";

    //Store Friends Email with Time Stamp
    public static String friendsEmail = "abed" + random() + "ajsingh123@gmail.com";

    //Object Class For LoadProp
    static LoadProp loadProp = new LoadProp();

    //Method For RandomDate Or Time Stamp
    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyMMddhhmm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //Method for Click Action
    public static void clickOnElement(By by) {
        driver.findElement(by).click();

    }

    //Method For Type Action
    public static void typeIn(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Method for Get Text Or Capture Text
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //method for verify URL
    public static void verifyURLContains(String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url), "Incorrect URL");
    }

    //Method For Drop Down By Index Selection
    public static void selectByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    //Method For Drop Down By Value Selection
    public static void selectByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //Method For Drop Down By Text Selection
    public static void selectByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    //Method For Implicit Wait
    public static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //Method For Explicit Wait
    public static void explicitWaitMethod(By by, int time) {
        WebElement driverWait = new WebDriverWait(driver, Duration.ofSeconds(time)).until(ExpectedConditions.elementToBeClickable(by));
    }

    //method for sleep
    public static void sleep(int time) {
        try {
            Thread.sleep(time * 20L);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Method For Taking The Screen Shot
    public static void takeScreenShot(String text) {
        //convert web driver object to TakeScreenShot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //call get ScreenShot as a method to create image file
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile, new File("src\\ScreenShot\\" + text + randomDate() + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Method For wait Until Element To Be Clickable
    public static void waitUntilElementToBeClickable() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
    }

    //Method  For Wait Until An  Element Is become visible
    public static void waitUntilElementToBecomeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
    }

    //Method For Wait For An Element To Be Present In The DOM
    public static void waitForAnElementToBePresentInTheDom() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("elementId")));
    }


    //Method For Wait, Text to Be Present in Element
    public static void waitForSpecificTextToBePresentInAnElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement((WebElement) By.id("elementId"), "Expected Text"));
    }

    //Method For Wait, For Element Attribute Value
    public static void waitForASpecificAttributeValueOfAnElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBe(By.id("elementId"), "attributeName", "expectedValue"));
    }

    //Method For Wait, For Frame To Be Available and Switch To It
    public static void waitForAFrameToBeAvailableAndSwitchToIt() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frameId")));
    }


    //Method For Wit, Wait for Element to Be Invisible
    public static void waitForAnElementToBecomeInvisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("elementId")));
    }

    //Method For wait, Wait for Alert to Be Present
    public static void waitForAlertToBePresent() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //Method For Wait , Wait for Element to Be Clickable with Custom Polling Interval
    public static void WaitForElementToBeClickAbleWithCustomPollingInterval() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(500)); // Custom polling interval
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#submitButton")));
    }

    //Method For Wait, Wait For Element To Be Selected
    public static void WaitForElementToBeSelected() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeSelected(By.name("myCheckbox")));
    }



}

