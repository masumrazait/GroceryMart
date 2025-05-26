Feature: Place the order for products

  Scenario Outline: Search Experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with Shortname <Name> and extracted actual name of product
    And Added "3" items to the selected product to cart
    Then User proceeded to checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
      | Name |
      | Tom  |
      | Rot  |