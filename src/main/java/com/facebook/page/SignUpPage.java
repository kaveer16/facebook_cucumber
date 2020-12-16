package com.facebook.page;

import com.facebook.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends Utility {


    @FindBy(xpath = "//div[contains(text(),\"It's quick and easy.\")]")
    WebElement _itsQuickAndEasyText;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
    WebElement _enterFirstName;

    @FindBy(xpath = "//input[@name ='lastname']")
    WebElement _enterSurname;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement _enterEmailAddress;

    @FindBy(xpath = "//input[@name ='reg_email_confirmation__']")
    WebElement _reEnterEmailAddress;

    @FindBy(xpath = "//input[@id='password_step_input']")
    WebElement _enterPassword;

    @FindBy(xpath = "//select[@id='day']")
    WebElement _enterDay;

    @FindBy(xpath = "//select[@id='month']")
    WebElement _enterMonth;

    @FindBy(xpath = "//select[@id='year']")
    WebElement _enterYear;

    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement _genderMale;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[10]/button[1]")
    WebElement _signUpButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
    WebElement _facebookText;

    //method to verify its quick and easy text
    public String getItsEQuickEasyText() {
        return getTextFromElement(_itsQuickAndEasyText);
    }

    //method to enter first name
    public void enterFirstName(String firstname) {
        sendTextToElement(_enterFirstName, firstname);

    }

    //method to enter Surname
    public void enterSurname(String surname) {
        sendTextToElement(_enterSurname, surname);

    }
    //method to enter email address
    public void enterEmailAddress(String email) {
        sendTextToElement(_enterEmailAddress, email);

    }
    //method to re-enter email address
    public void reEnterEmailAddress(String email) {
        sendTextToElement(_reEnterEmailAddress, email);
    }

    //method to enter password
    public void enterPassword(String password) {
        sendTextToElement(_enterPassword, password);
    }
    //method to enter day
    public void enterDay(String day) {
        sendTextToElement(_enterDay, day);
    }
    //method to enter month
    public void enterMonth(String month) {
        sendTextToElement(_enterMonth, month);
    }
    //method to enter year
    public void enterYear(String year) {
        sendTextToElement(_enterYear, year);
    }
    //method to select male
    public void selectMale() {
        clickOnElement(_genderMale);
    }
    //method to click on sign Up button
    public void clickOnSignUpButton() {
        clickOnElement(_signUpButton);
    }
    //method to verify the facebook text
    public String getFacebookText(){
        return getTextFromElement(_facebookText);

    }

}
