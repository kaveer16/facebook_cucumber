package com.facebook.Stepdefs;

import com.facebook.page.HomePage;
import com.facebook.page.LoginPage;
import com.facebook.page.SignUpPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FbStepdefs {

    @Given("^I am on home page$")
    public void iAmOnHomePage(){

        }
    @And("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new HomePage().clickOnAcceptCookies();
    }

    @When("^I click on create new account link$")
    public void iClickOnCreateNewAccountLink() {
            new HomePage().clickOnCreateNewAccount();
    }

    @Then("^I should navigate to sign up page successfully$")
    public void iShouldNavigateToSignUpPageSuccessfully() {
        Assert.assertEquals("It's quick and easy.", new SignUpPage().getItsEQuickEasyText());
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassWord(password);
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogInButton();
    }

    @Then("^I should see error message$")
    public void iShouldSeeErrorMessage() {
        Assert.assertEquals("Sign up for an account.", new LoginPage().getSignUpAccountText());

    }
}

