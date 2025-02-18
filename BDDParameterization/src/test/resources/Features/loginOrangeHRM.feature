Feature: To test login functionality

  Scenario Outline: To check login with valid credentials
    Given User is on login page
    When User enters "<username>" and "<password>"
    And Clicks on login button
    Then User is navigated to home page

    Examples: 
      | username | password  |
      | Admin    | admin123  |
      | user1    | password1 |
      | user2    | password2 |
