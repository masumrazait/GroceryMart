Feature: Search and Place the order for products

  Scenario Outline: Search Experience for product search in both home and offers page
    Given User is on GreenCart Landing page
    When user searched with Shortname <Name> and extracted actual name of product
    Then user searched for <Name> shortname in offers page
    And validate product name in offer page matches with Landing Page

    Examples:
      | Name  |
      | Tom   |
      | Pota  |
      | Man   |
      | Brinj |
      | Carr  |
      | Bea   |
      | Oran  |