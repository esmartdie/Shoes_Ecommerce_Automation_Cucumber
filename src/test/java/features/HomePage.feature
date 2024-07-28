Feature: Home Page
  Scenario: The page loads successfully
    Given I open the home page
    Then I should see the header "Ace Online Shoe Portal"
    And I should see the main banner with text "One Stop Shop for all your Shoes needs!"