package org.example;

import org.openqa.selenium.By;

//Class Name
public class HomePage extends Utils  {

    //Method For Clicking On Resister Button On HomePage
    public void clickOnRegisterButton() {
        clickOnElement(By.linkText("Register"));
    }

    //Method To Click On Login Button Located On Home Page
    public void clickOnLoginButton() {
        clickOnElement(By.className("ico-login"));
    }

    //Method To Click On Electronic Button
    public void clickOnElectronicButton() {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
    }

    //Method For Click On Build Your Own Computer
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(By.xpath(" // img[@title='Show details for Build your own computer']"));

    }

}
