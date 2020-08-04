package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Util {
private By _userName = By.id("txtUsername");
private By _password = By.id("txtPassword");
private By _LoginButton = By.id("btnLogin");
private By _TextOnLoginPage = By.id("logInPanelHeading");
private By _textOnloginUnsuccessful = By.id("spanMessage");
//verify user is on login page
    public void verifyUserOnLoginPage()
    {
        getTextFromElement(_TextOnLoginPage, 30);
    }

//enter username
    public void enterUsername(String username)
    {
        typeText(_userName,username,30);
    }
    public void enterPassword(String password)
    {
        typeText(_password,password,30);
    }
    public void clickOnSubmitButton()
    {
        clickOnWebElement(_LoginButton,30);
    }
    public void loginUnsuccessful(String message)
    {
        Assert.assertEquals(getTextFromElement(_textOnloginUnsuccessful,30),message);
    }
}
