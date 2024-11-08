package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPage {

    public YourCartPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "inventory_item_name")
    public WebElement productName;



    @FindBy(id = "checkout")
    public WebElement checkout_button;

}
