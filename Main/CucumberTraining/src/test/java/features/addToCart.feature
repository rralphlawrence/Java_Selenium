@tags
Feature: Book cart application

  Background: 
    Given User should navigate to the application login
    And User clicks on the login

  Scenario Outline: Add to Cart
    And user login into the application with <name> and <password>
    And user search for a book <book>
    When user add the book to the cart
    Then the cart badge should be updated

    Examples: 
      | name   | password | book            |
      | ortoni | pass1234 | Roomies         |
      | ortoni | pass1234 | The Simple Wild |
