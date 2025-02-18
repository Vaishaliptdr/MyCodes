Feature: To test login functionality

  Scenario: To check login with valid credentials
    Given User is on login page
    When User enters login and password
    And Clicks on login button
    Then User is navigated to home page
