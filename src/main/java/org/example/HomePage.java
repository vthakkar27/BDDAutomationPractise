package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util {

    private By _registerButton = By.linkText("Register");


    public void clickOnRegisterButton() {

        clickOnElement(_registerButton,20);


    }











}
