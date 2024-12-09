Feature: Search Product Validation

  Scenario Outline: Search product on the home page by shortname
    Given user is on GreenCart Landing page
    When user searched with shortname <Name> and extracted actual name of product
    Then user searched for <Name> shortname in offers page
    And validate product name in offers page match with landing page

    Examples: 
      | Name    |
      | Tomato  |
     # | Potato  |
     # | Brinjal |

  Scenario: Search product<Tom> on home page
    When user search product by shortname<Tom>
    Then user clicked on add to cart
    And user click on bag
    Then user click on checkout the product
