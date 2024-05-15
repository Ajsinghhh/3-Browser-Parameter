package org.example;

import org.testng.annotations.Test;

//Class Name
public class TestSuite extends BaseTest {

    //Object class for HomePage
    HomePage homePage = new HomePage();

    //Object Class For Registration Page
    RegistrationPage registrationPage = new RegistrationPage();

    //Object Class For Registration Result Page
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    //Object For Login Page
    LogInPage logInPage = new LogInPage();

    //Object Class For Electronic Page
    ElectronicPage electronicPage = new ElectronicPage();

    //Object Class For Camera & Photo Page
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    //Object Class For Leica T Mirrorless Digital Camera Page
    LeicaTMirrorlessDigitalCameraPage leicaTMirrorlessDigitalCameraPage = new LeicaTMirrorlessDigitalCameraPage();

    //Object Class For Email A Friend Page
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    //Object Class For Email A Friend Result Page
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();

    //Object Class For Build Your Own Computer Page
    BuildYourOwnComputerPage buildYourOwnComputerPage  = new BuildYourOwnComputerPage();

    //Object Class For Shopping Cart Result Page
    ShoppingCartResultPAge shoppingCartResultPAge = new ShoppingCartResultPAge();

    //Test Case Method Using TestNG
    @Test
    public void toVerifyUserShouldBeAbleToRegisterSuccessfully() {

        //Click On Register Button On HomePage, (Fetch From HomePage Class)
        //Type First Name, (Fetch From Registration Page Class)
        //TypeLast Name , (Fetch From Registration Page Class)
        //Type Email Address , (Fetch From Registration Page Class)
        //Type Password , (Fetch From Registration Page Class)
        //Confirm Password , (Fetch From Registration Page Class)
        //Click On Register Submit Button , (Fetch From Registration Page Class)
        //Verify Message displayed for successfully registration, (Fetch From Registration Result Page Class)


        //Click On Register Button
        homePage.clickOnRegisterButton();
        //Enter Registration Details
        registrationPage.enterRegistrationDetails();
        //Verify User Registered Successfully With Correct Message Displayed
        registrationResultPage.verifyUserRegisteredSuccessfully();
    }

    @Test
    public void toVerifyRegisteredUserShouldBeAbleToLogin() {

        //Click On Register Button On HomePage, (Fetch From HomePage Class)
        //Type First Name, (Fetch From Registration Page Class)
        //TypeLast Name , (Fetch From Registration Page Class)
        //Type Email Address , (Fetch From Registration Page Class)
        //Type Password , (Fetch From Registration Page Class)
        //Confirm Password , (Fetch From Registration Page Class)
        //Click On Register Submit Button , (Fetch From Registration Page Class)
        //Verify Message displayed for successfully registration, (Fetch From Registration Result Page Class)


        //Click On Continue Button On Registration Result Page, (Fetch From Registration Result Page Class)
        //Click On Log In Button Located On Home Page, (Fetch From HomePage Class)
        //Type Email , (Fetch From Login Page Class)
        //Type Password , (Fetch From Login Page Class)
        //Click On LOG IN Submit Button, (Fetch From Login Page)


        //Click On Register Button
        homePage.clickOnRegisterButton();
        //Enter Registration Details And Click ON Continue
        registrationPage.enterRegistrationDetails();
        //Verify User Registered Successfully With Correct Message Displayed
        registrationResultPage.verifyUserRegisteredSuccessfully();
        //Click On Login Button Located on Home Page
        homePage.clickOnLoginButton();
        //Enter Login Details And Click On LOGIN
        logInPage.enterLoginDetails();
    }


    @Test
    public void toVerifyRegisteredUserShouldBeAbleToReferAProductToAFriend() {


        //Click On Log In Button Located On Home Page, (Fetch From HomePage Class)
        //Type Email , (Fetch From Login Page Class)
        //Type Password , (Fetch From Login Page Class)
        //Click On LOG IN Submit Button, (Fetch From Login Page)

        //Click On Electronics Button Located On Login Page
        //Click On Camera & Photo Located On Electronic Page
        //Click Leica T Mirrorless Digital Camera Located On Camera & Photo Page
        //Click On Email A Friend Located On Leica T Mirrorless Digital Camera Page
        //Type Friends Email, (Fetch From Email A Friend Page Class)
        //Type Your Email, (Fetch From Email A Friend Page Class)
        //Type Personal Message, (Fetch From Email A Friend Page Class)
        //Click On SEND EMAIL Submit Button Located On Email A Friend Page Class
        //Verify Your Email Has Been Sent Message Displayed, (Fetch From Email A Friend Result Page Class)


        //Click On Login Button Located on Home Page
        homePage.clickOnLoginButton();
        //Enter Login Details And Click On LOGIN Submit Button
        logInPage.enterLoginDetails();
        //Click On Electronics Button Located On Login Page
        homePage.clickOnElectronicButton();
        //Click On Camera & Photo Located On Electronic Page
        electronicPage.clickOnCameraPhotoButton();
        //Click Leica T Mirrorless Digital Camera Located On Camera & Photo Page
        cameraAndPhotoPage.clickOnLeicaTMirrorlessDigitalCameraButton();
        //Click On Email A Friend Located On Leica T Mirrorless Digital Camera Page
        leicaTMirrorlessDigitalCameraPage.clickOnEmailAFriend();
        //Enter Details For Email A Friend
        emailAFriendPage.enterEmailAFriendDetails();
        //Verify Your Email Has Been Sent Message Displayed
        emailAFriendResultPage.verifyEmailHasBeenSent();
    }


    @Test
    public void buildYourOwnComputer() {


        //Click On Build Your Own Computer Located On Home Page
        //From The Processor Drop Down Select second Option
        //From The RAM Drop Down Select second Option
        //From The HDD Radio Button Select second Option
        //From The OS Radio Button Select second Option
        //From The Software Radio Button Select second Option
        //Click On ADD TO CART Submit Button
        //Click On Shopping CArt Button
        //Verify Product in The ShoppingCart Page With Correct Message Displayed

        //Click On Build Your Own Computer Located On Home PAge
        homePage.clickOnBuildYourOwnComputer();
        //Enter Details To Build Your Own Computer
        buildYourOwnComputerPage.selectDetailsToBuildYourOwnComputer();
        //Verify Product in The ShoppingCart Page With Correct Message Displayed
        shoppingCartResultPAge.VerifyProductNameAndMessageDisplayedInShoppingCart();
    }


}