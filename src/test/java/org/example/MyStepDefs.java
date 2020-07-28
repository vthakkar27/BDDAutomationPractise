package org.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();

    @Given("^user is on homepage$")
    public void user_is_on_homepage()  {


    }

    @When("^user clicks on register button$")
    public void user_clicks_on_register_button()  {
        homePage.clickOnRegisterButton();


    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details()  {
        registrationPage.userEntersRegistrationDetails();

    }

    @When("^user clicks on register-submit button$")
    public void user_clicks_on_register_submit_button()  {
        registrationPage.userClickOnRegisterSubmitButton();

    }

    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully()  {
        registerSuccessPage.verifyUserRegisterSuccessfully();

    }

}
