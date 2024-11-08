package com.mercator.stepDefs;

import com.mercator.page.*;
import com.mercator.until.BrowserUtil;
import com.mercator.until.ConfigurationReader;
import com.mercator.until.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;
import java.util.Map;

public class checkout_happyPath_stepDefs {

    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    YourCartPage yourCartPage = new YourCartPage();
    YourInformationPage yourInformationPage = new YourInformationPage();
    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Given("navigate to the saucedemo website")
    public void navigate_to_the_saucedemo_website() {
       Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtil.waitFor(1);
    }

    @When("user log in with the following")
    public void user_log_in_with_the_following(Map<String,String> loginInfo) {
       loginPage.username.sendKeys(loginInfo.get("username"));
       loginPage.password.sendKeys(loginInfo.get("password"));
       loginPage.loginButton.click();
    }

    @Then("user should able to see the {string} page")
    public void user_should_able_to_see_the_page(String pageSubTitle) {
        assertEquals("verify the product page title", pageSubTitle, productPage.subTitle.getText());
    }

    @Then("user selects {string} option from the filter dropdown")
    public void user_selects_option_from_the_filter_dropdown(String highToLow) {
        Select filterDropdown = new Select(productPage.filterDropdown);
        filterDropdown.selectByVisibleText(highToLow);
    }

    @Then("user clicks {string} button from the highest price item")
    public void user_clicks_button_from_the_highest_price_item(String addToCart) {
        productPage.button_addCart.click();
        BrowserUtil.waitFor(2);
    }

    @Then("user clicks the cart icon from product page")
    public void user_clicks_the_cart_icon_from_product_page() {
       productPage.icon_shoppingCar.click();

    }

    @Then("user should able to see {string} on the cart page")
    public void user_should_able_to_see_on_the_cart_page(String productName) {
        assertEquals("verify the product name",productName, yourCartPage.productName.getText());

    }

    @Then("user clicks the checkout button")
    public void user_clicks_the_checkout_button() {
        yourCartPage.checkout_button.click();

    }

    @Then("user should able to see {string} and fill the checkout information")
    public void user_should_able_to_see_and_fill_the_checkout_information(String pageSubTitle, Map<String,String> userInfo) {
        assertEquals(pageSubTitle, productPage.subTitle.getText());
        yourInformationPage.firstName_inputbx.sendKeys(userInfo.get("firstName"));
        yourInformationPage.lastName_inputbx.sendKeys(userInfo.get("lastName"));
        yourInformationPage.postcode_inputbx.sendKeys(userInfo.get("postalCode"));

    }

    @Then("user click continue button")
    public void user_click_continue_button() {
        yourInformationPage.continue_button.click();

    }

    @Then("{string} and {string} should be appear on the screen")
    public void and_should_be_appear_on_the_screen(String paymentInfo, String shippingInfo) {
        assertEquals("verify the payment information",paymentInfo, checkoutOverviewPage.paymentInformation.getText());
        assertEquals("verify the shipping information",shippingInfo, checkoutOverviewPage.shippingInformation.getText());

    }

    @Then("user clicks the finish button")
    public void user_clicks_the_finish_button() {

        checkoutOverviewPage.finish_button.click();
    }

    @Then("user should be able to see {string} massage")
    public void user_should_be_able_to_see_massage(String thanksForOrderMassage) {
        assertEquals("verify the thanks massage",thanksForOrderMassage, checkoutCompletePage.thanksForTheOrder_txt.getText());
    }

}
