Feature: Menu Navigation
  Scenario: Navigate to "About" section
    Given I open the home page
    When I click on the "About" link in the menu
    Then I should see the section header "About Us"