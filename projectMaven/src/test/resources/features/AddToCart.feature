Feature: To check add to cart functionality

  Scenario: Adding boo to cart
    Given User is present on home page
    When User clicks on Books option and sort it
    And Select book and Clicks on add to cart
    Then Verifies success message
