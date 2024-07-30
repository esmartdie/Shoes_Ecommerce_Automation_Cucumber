Feature: Shopping Cart
  Scenario: Add a new product on Cart
    Given User navigates to the Login page
    And I enter "QA" as username
    And I enter "password123" as password
    And I click on login button
    And I view the product category page
    And I click on the formal shoes button
    When I click on the Add to Cart button
    Then I should see the message "Added to Cart Successfully !!!"