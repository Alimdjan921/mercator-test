package com.mercator.page;

import com.mercator.until.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


    public ProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".product_sort_container")
    public WebElement filterDropdown;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement button_addCart;

    @FindBy(xpath = "//div[@class='inventory_item_price']//text()[2]")
    public WebElement txt_price;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement icon_shoppingCar;

    @FindBy(className = "title")
    public WebElement subTitle;



}
