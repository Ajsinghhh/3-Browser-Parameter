package org.example;

import org.openqa.selenium.By;

//Class Name
public class EmailAFriendPage extends Utils {

    //Object class for LoadProp
    static LoadProp loadProp = new LoadProp();

    //Method For Email A Friend
    public void enterEmailAFriendDetails() {

        // Type Friends Email
        typeIn(By.id("FriendEmail"), friendsEmail);
        driver.get(loadProp.getProperty("friendsEmail1"));
        driver.get(loadProp.getProperty("friendsEmail2"));

        //Type Your Email
        typeIn(By.id("YourEmailAddress"), email);
        driver.get(loadProp.getProperty("email1"));
        driver.get(loadProp.getProperty("email2"));


        //Type A Personal Message
        typeIn(By.id("PersonalMessage"), "Recommending This Product");
        driver.get(loadProp.getProperty("personalMessage"));
        //Click On Send Email Button
        //clickOnElement(By.xpath("//button[normalize-space()='Send email']"));
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));

        sleep(20);


    }

}



