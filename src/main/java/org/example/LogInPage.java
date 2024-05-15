package org.example;

import org.openqa.selenium.By;

//Class Name
public class LogInPage extends Utils  {

    //Method for Login
    public void enterLoginDetails() {
        // Type Email
        typeIn(By.className("email"), email);

        //Type Password
        typeIn(By.id("Password"), password);

        //Click On LOG IN Button
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }
//
}
