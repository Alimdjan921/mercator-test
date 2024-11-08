package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourInformationPage {

    public YourInformationPage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(name = "firstName")
    public WebElement firstName_inputbx;

    @FindBy(name = "lastName")
    public WebElement lastName_inputbx;

    @FindBy(name = "postalCode")
    public WebElement postcode_inputbx;

    @FindBy(name = "continue")
    public WebElement continue_button;


}
