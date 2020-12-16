package com.facebook.page;

import com.facebook.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {


    @FindBy(xpath = "//input[@id='email']")
    WebElement _enterEmailId;

    @FindBy(xpath = "//input[@id='pass']")
    WebElement _enterPassWord;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement _logInButton;

    @FindBy(xpath = "//h2[@class = 'uiHeaderTitle']")
    WebElement _troubleLoggingInText;

    @FindBy(xpath = "//a[contains(text(),'Sign up for an account.')]")
    WebElement _signUpAccountText;

    //method to enter email Id
    public void enterEmailId(String email) {
        sendTextToElement(_enterEmailId, email);
    }
    //method to enter password
    public void enterPassWord(String password) {
        sendTextToElement(_enterPassWord, password);
    }
    //method to click on login button
    public void clickOnLogInButton() {
        clickOnElement(_logInButton);
    }
    //method to verify trouble logging in text
    public String getTroubleLoggingInText() {
        return getTextFromElement(_troubleLoggingInText);
    }
    //method to verify Sign UP ACCOUNT text
    public String getSignUpAccountText() {
        return getTextFromElement(_signUpAccountText);
    }
}
