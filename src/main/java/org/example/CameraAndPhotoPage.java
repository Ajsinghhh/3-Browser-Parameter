package org.example;

import org.openqa.selenium.By;

//Class Name
public class CameraAndPhotoPage extends Utils {

    //Method To Click On  Leica T Mirrorless Digital Camera
    public void clickOnLeicaTMirrorlessDigitalCameraButton() {
        clickOnElement(By.xpath("//h2[@class='product-title']//a[normalize-space()='Leica T Mirrorless Digital Camera']"));
    }
}
