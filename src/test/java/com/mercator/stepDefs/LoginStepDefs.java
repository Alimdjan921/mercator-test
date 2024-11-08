package com.mercator.stepDefs;

import com.mercator.page.LoginPage;
import com.mercator.until.BrowserUtil;
import com.mercator.until.ConfigurationReader;
import com.mercator.until.Driver;
import  io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginStepDefs {

    LoginPage loginPage =new LoginPage();
    @Given("navigate saucedemo website")
    public void navigate_saucedemo_website() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtil.waitFor(1);
    }

    @When("user on the {string} page")
    public void user_on_the_page(String pagTitle) {
        assertEquals("verify the product page title", pagTitle, Driver.get().getTitle());
    }

    @When("User input userName {string}")
    public void user_input_userName(String userName) {
        assertTrue(loginPage.username.isDisplayed());
        loginPage.username.sendKeys(userName);

    }

    @Then("User input password {string}")
    public void user_input_password(String password) {
        assertTrue(loginPage.password.isDisplayed());
        loginPage.password.sendKeys(password);
    }

    @Then("User Clicks signIn button")
    public void user_Clicks_signIn_button() {
        assertTrue(loginPage.loginButton.isDisplayed());
        loginPage.loginButton.click();
    }

    @Then("Screen display error massage {string}")
    public void screen_display_error_massage(String errorMassage) {
       assertEquals(errorMassage,loginPage.txt_errorMassage.getText());
    }

}
