package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Util {
    LoadProp loadProp = new LoadProp();
    private By _firstName = By.id("FirstName");
    private By _lastName = By.xpath("//input[@id=\"LastName\"]");
    private By _dateOfBirthday = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthyear = By.name("DateOfBirthYear");
    private By _emailId = By.name("Email");
    private By _CompanyName = By.id("Company");
    private By _password = By.id("Password");
    private By _confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private By _registerSubmitButton = By.id("register-button");


    public void userEntersRegistrationDetails() {
        typeText(_firstName,loadProp.getProperty("firstName"),20);
        typeText(_lastName,loadProp.getProperty("lastName"),10);
        selectFromDropDownByVisibleIndex(_dateOfBirthday,loadProp.getProperty("dateOfBirthday"));
        selectFromDropDownByVisibleText(_dateOfBirthMonth,loadProp.getProperty("dateOfBirthMonth"));
        selectFromDropDownByValue(_dateOfBirthyear,loadProp.getProperty("dateOfBirthYear"));
        //typeText(_emailField, "27vthakkar" + timestamp() + "@gmail.com",10);
        //typeText(_emailId,loadProp.getProperty("EmailId")+timestamp()+loadProp.getProperty("Email"));
        typeText(_emailId,loadProp.getProperty("emailId")+timestamp()+loadProp.getProperty("Email"),20);
        typeText(_CompanyName,loadProp.getProperty("CompanyName"),10);
        typeText(_password,loadProp.getProperty("password"),30);
        typeText(_confirmPassword,loadProp.getProperty("confirmPassword"),10);
    }
    public void userClickOnRegisterSubmitButton() {
        clickOnElement(_registerSubmitButton,30);

    }
}
