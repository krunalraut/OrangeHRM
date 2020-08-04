package org.example;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {
    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Given("^user is on login page$")
    public void user_is_on_login_page()  {
        loginPage.verifyUserOnLoginPage();
    }



    @Then("^user should login successfully$")
    public void user_should_login_successfully()
    {
        dashBoardPage.verifyDashboardPage();
    }

    @When("^user enter \"([^\"]*)\"$")
    public void user_enter(String Username)  {
        loginPage.enterUsername(Username);
    }

    @When("^user enter password \"([^\"]*)\"$")
    public void user_enter_password(String password)
    {
        loginPage.enterPassword(password);
    }

    @And("^click on login button$")
    public void clickOnLoginButton()
    {
        loginPage.clickOnSubmitButton();
    }


    @Then("^user should see \"([^\"]*)\"$")
    public void userShouldSee(String message)
    {
       loginPage.loginUnsuccessful(message);
    }
}
