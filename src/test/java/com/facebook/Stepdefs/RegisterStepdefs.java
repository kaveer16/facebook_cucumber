package com.facebook.Stepdefs;

import com.facebook.page.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class RegisterStepdefs {
    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstname) {
       new SignUpPage().enterFirstName(firstname);

    }

    @And("^I enter surname \"([^\"]*)\"$")
    public void iEnterSurname(String surname ) {
        new SignUpPage().enterSurname(surname);

    }

    @And("^I enter Day \"([^\"]*)\"$")
    public void iEnterDay(String day) {
        new SignUpPage().enterDay(day);
    }

    @And("^I enter Month \"([^\"]*)\"$")
    public void iEnterMonth(String month) {
        new SignUpPage().enterMonth(month);

    }

    @And("^I enter Year \"([^\"]*)\"$")
    public void iEnterYear(String year) {
        new SignUpPage().enterYear(year);
    }

    @And("^I select Male option$")
    public void iSelectMaleOption() {
        new SignUpPage().selectMale();
    }

    @Then("^I should be able to click on sign up button$")
    public void iShouldBeAbleToClickOnSignUpButton() {
        new SignUpPage().clickOnSignUpButton();
    }

    @And("^I enter email address \"([^\"]*)\"$")
    public void iEnterEmailAddress(String email)  {
        new SignUpPage().enterEmailAddress(email);

    }

    @And("^I re enter email address \"([^\"]*)\"$")
    public void iReEnterEmailAddress(String email) {
        new SignUpPage().reEnterEmailAddress(email);
    }

    @And("^I enter passWord \"([^\"]*)\"$")
    public void iEnterPassWord(String password) {
        new SignUpPage().enterPassword(password);


    }
}
