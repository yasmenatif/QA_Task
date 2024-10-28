Feature:E-Shop Cart Functionality

  Scenario: Add items to the cart
    Given I open the eShop website
    And I login to my account
    When I select and add items to the cart
    Then I should see the items in my cart