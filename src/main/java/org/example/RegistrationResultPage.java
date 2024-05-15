package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Class Name
public class RegistrationResultPage extends Utils  {


    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();
    //Verify Message displayed for successfully registration
    String expectedRegistrationSuccessMessage = "Your registration completed";

    //Method For Successful Registration
    public void verifyUserRegisteredSuccessfully() {
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), expectedRegistrationSuccessMessage, "Your registration completed");

        //Click On Continue Button On THe Registration Result Page
        clickOnElement(By.xpath("//a[@class='button-1 register-continue-button']"));

        driver.get(loadProp.getProperty("expectedRegistrationMsg"));
    }

}
