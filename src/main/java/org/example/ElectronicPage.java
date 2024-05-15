package org.example;

import org.openqa.selenium.By;

//Class Name
public class ElectronicPage extends Utils {


    //Method For Click On Camera & Photo Located On Electronic Page
    public void clickOnCameraPhotoButton() {
        clickOnElement(By.xpath("//a[@title='Show products in category Camera & photo'][normalize-space()='Camera & photo']"));
    }

}
