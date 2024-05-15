package org.example;

import org.openqa.selenium.By;

//Class Name
public class RegistrationPage extends Utils  {


    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();

    //Method For Registration
    public void enterRegistrationDetails() {

        //Click On Register Button
        clickOnElement(By.className("ico-register"));

        //Type First Name
        //typeIn(By.id("FirstName"), "Aj");
       driver.get(loadProp.getProperty("firstName"));

        //TypeLast Name
       // typeIn(By.id("LastName"), "lastName");
        driver.get(loadProp.getProperty("lastName"));

        //Select Date From Date of Birth By Using Select By Visible Text
       // selectByVisibleText(By.name("DateOfBirthDay"), "3");
        driver.get(loadProp.getProperty("dateOfBirthDay"));
        //Select Month From Date Of Birth By Using SelectByValue
       // selectByVisibleText(By.name("DateOfBirthMonth"), "October");
        driver.get(loadProp.getProperty("dateOfBirthMonth"));
        //Select Year From Date Of Birth By Using SelectByIndex
       // selectByVisibleText(By.name("DateOfBirthYear"), "1998");
        driver.get(loadProp.getProperty("dateOfBirthYear"));

        //Type Email Address
       // typeIn(By.id("Email"), email);
        driver.get(loadProp.getProperty("email1"));
        driver.get(loadProp.getProperty("email2"));
        //Type Password
      //  typeIn(By.id("Password"), password);
        driver.get(loadProp.getProperty("password"));

        //Confirm Password
      //  typeIn(By.id("ConfirmPassword"), password);
        driver.get(loadProp.getProperty("confirmPassword"));

        //Click On Register Submit Button
        clickOnElement(By.id("register-button"));
    }
}
