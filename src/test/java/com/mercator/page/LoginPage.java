package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement username;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = "#login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[@data-test='error']//text()")
    public WebElement txt_errorMassage;





}
