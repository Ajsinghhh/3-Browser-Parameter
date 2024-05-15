package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Class Name
public class EmailAFriendResultPage extends Utils {

    //Object class for LoadProp
    static LoadProp loadProp = new LoadProp();

    static String expectedEmailSentMessage = "Your email has been sent ";

    //Method For Verifying the Correct Message Displayed
    public void verifyEmailHasBeenSent() {
        Assert.assertEquals(getTextFromElement(By.className("result")), expectedEmailSentMessage, "Your email has been sent ");

        driver.get(loadProp.getProperty("expectedEmailSentMessage"));

    }

}




