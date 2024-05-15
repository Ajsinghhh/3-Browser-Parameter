package org.example;

import org.openqa.selenium.By;

//Class Name
public class LeicaTMirrorlessDigitalCameraPage extends Utils {

    //Method For Clicking on Email A Friend
    public void clickOnEmailAFriend() {
        clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));
    }

}
