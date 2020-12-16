package com.facebook.page;

import com.facebook.utility.Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {


    @FindBy(xpath = "//button[@title = 'Accept All']")
    WebElement _accept;

    @FindBy(xpath = "//a[@id='u_0_2']")
    WebElement _createNewAccountButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement _logInButton;


    //method to click on accept all cookies button
    public void clickOnAcceptCookies(){
        clickOnElement(_accept);
    }
    //method to click on create new account button
    public void clickOnCreateNewAccount() {
        clickOnElement(_createNewAccountButton);
    }
    //method to click on login button
    public void clickOnLogInButton() {
        clickOnElement(_logInButton);
    }
}
