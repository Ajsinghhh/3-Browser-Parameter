package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Class Name
public class BaseTest extends Utils {

    //Object for Browser Manager Class
    BrowserManager browserManager = new BrowserManager();

    //Before Method Using TestNG Annotation
    @BeforeMethod
    public void setup() {
        browserManager.openBrowser();
    }

    //After Method Using TestNG Annotation
    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            takeScreenShot(result.getName());
        }
        browserManager.closeBrowser();
    }


}
