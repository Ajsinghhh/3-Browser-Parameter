package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

//Class Name
public class ShoppingCartResultPAge extends Utils {

    //Object class for LoadProp
    LoadProp loadProp = new LoadProp();

    //Message For Product In Shopping cart


    //Method To verify Correct Message Displayed On Shopping Cart Page
    public void VerifyProductNameAndMessageDisplayedInShoppingCart() {
        String expectedMessageDisplayed = "Build your own computer ";
        String actual = getTextFromElement(By.className("product-name"));
        Assert.assertEquals(getTextFromElement(By.className("product-name")), expectedMessageDisplayed, "Build your own computer ");

        driver.get(loadProp.getProperty("expectedMsgDisplayedInShoppingCart"));
    }
//

}

