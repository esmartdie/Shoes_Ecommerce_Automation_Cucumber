Feature: Shopping Cart
  Scenario: Add a new product on Cart
    Given I open the home page
    And I click on a product with name "Product Name"
    When I click on the "Add to Cart" button
    Then I should see the message "Product Name has been added to your cart"