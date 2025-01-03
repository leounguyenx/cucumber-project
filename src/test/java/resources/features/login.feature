Feature: Login page Automation of saucedemo App
  Scenario: Check login is successful with valid credential
    Given User is on Login page
    When User enters valid username and password
    And Click on Login Button
    Then User is navigated to Homepage
    And Close the browser