@login
Feature: Verify login functionality

  Background: go to saucedemo website
    Given navigate saucedemo website
    When user on the "Swag Labs" page


  Scenario Outline: Verify negative scenarios for login
    When User input userName "<userName>"
    Then User input password "<password>"
    And User Clicks signIn button
    And Screen display error massage "<error massage>"
    Examples:
      | userName       | password      | error massage                                                             |
      | standard_user1 | secret_sauce2 | Epic sadface: Username and password do not match any user in this service |
      | standard_user  |               | Epic sadface: Password is required                                        |
      |                | secret_sauce  | Epic sadface: Username is required                                        |
      |                |               | Epic sadface: Username is required                                        |

