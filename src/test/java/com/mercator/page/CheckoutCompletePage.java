package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutCompletePage {

    public CheckoutCompletePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(className = "complete-header")
    public WebElement thanksForTheOrder_txt;
}
