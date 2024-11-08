@wip
Feature: Visit a page and click on a link


  Scenario: go to saucedemo page and selected highest price item to check out
    Given navigate to the saucedemo website
    When user log in with the following
      | username | standard_user |
      | password | secret_sauce  |
    Then user should able to see the "Products" page
    And user selects "Price (high to low)" option from the filter dropdown
    And user clicks "add to cart" button from the highest price item
    Then user clicks the cart icon from product page
    Then user should able to see the "Your Cart" page
    Then user should able to see "Sauce Labs Fleece Jacket" on the cart page
    Then user clicks the checkout button
    And user should able to see "Checkout: Your Information" and fill the checkout information
      | firstName  | test01 |
      | lastName   | test02 |
      | postalCode | 1000   |
    Then user click continue button
    And  "Payment Information:" and "Shipping Information:" should be appear on the screen
    Then user clicks the finish button
    And user should be able to see "Thank you for your order!" massage





