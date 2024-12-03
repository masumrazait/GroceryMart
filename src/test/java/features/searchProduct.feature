Feature: Search Product Validation

  Scenario Outline: Search product on the home page by shortname
    Given user is on GreenCart Landing page
    When user searched with shortname <Name> and extracted actual name of product
    Then user searched for <Name> shortname in offers page
    And validate product name in offers page match with landing page
    Examples:
      | Name    |
      | Tomato  |
      | Potato  |
      | Brinjal |