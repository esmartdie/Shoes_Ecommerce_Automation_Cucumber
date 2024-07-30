Feature: New User

  Scenario: Successful user registration
    Given I am on the registration page
    When I select "Mrs." from Salutions dropdown
    And I enter "Ana" as first name
    And I enter "QA" as last name
    And I enter "ana.qa@qa.com" as email
    And I enter "666777888" as contact number
    And I enter "QA" as username
    And I enter "password123" as password
    And I click the register button
    Then I should see the registration success message "User Registered Successfully !!!"