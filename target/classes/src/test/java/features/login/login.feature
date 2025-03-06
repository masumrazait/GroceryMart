Feature: Login Page

    Background:
        Given I am on the login page

  Scenario: Login with valid credentials
    When I enter valid credentials
    Then I should be redirected to the home page

  Scenario: Login with invalid credentials
    When I enter invalid credentials
    Then I should see an error message

  Scenario: Login with empty credentials
    When I enter empty credentials
    Then I should see an error message