package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Util.getTextFromElement;

public class RegisterSuccessPage extends Util {

    private By _registerSuccessMessage = By.xpath("//div[@class=\"result\"]");
    String expectedRegisterSuccessMessage = "Your registration completed";

    public void verifyUserRegisterSuccessfully(){
        Assert.assertEquals(getTextFromElement(_registerSuccessMessage),expectedRegisterSuccessMessage);
    }

}
