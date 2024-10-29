Feature: Search Product Validation

  Scenario: Search product on the home page by shortname
    Given I search for a product on the homepage using the shortname "TOM"
    When the product is visible on the grid and stored
    Then I search for the same product on the offer page using the shortname "TOMA" and validate to the homepage product