Feature: LoggedIn User View

  Scenario: Validate user is able to view after log in

    Given User navigates to the Login page
    When I enter "QA" as username
    And I enter "password123" as password
    And I click on login button
    Then User should be able to view the product category page