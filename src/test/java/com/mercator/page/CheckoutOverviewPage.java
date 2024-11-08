package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

    public CheckoutOverviewPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[text()='Payment Information:']")
    public WebElement paymentInformation;

    @FindBy(xpath = "//div[text()='Shipping Information:']")
    public WebElement shippingInformation;

    @FindBy(name = "finish")
    public WebElement finish_button;


}
