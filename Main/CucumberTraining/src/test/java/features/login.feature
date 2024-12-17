@tags
Feature: Book cart application

  Background: 
    Given User should navigate to the application
    And User clicks on the login link

  Scenario Outline: Login should be success
    And User enter the username as <name>
    And User enter the password <password>
    When User click on the login button to bookcart
    Then User login successfully

    Examples: 
      | name   | password |
      | ortoni | pass1234 |

@smoke
  Scenario Outline: Login should be fail
    Given User enter the username "ortoni22"
    Given User enter the password as "kyoshik"
    When User click on the login button
    But User login must failed
