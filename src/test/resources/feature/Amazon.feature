@test-execution
Feature: Test Amazon search funcionality

  @test-execution @amamzon-group @amazon-001
  Scenario Outline: As a Customer when I search for Alexa, I want to see if the thrid option on the second page is available for purchase and can be added to the cart.
    Given the user navigates to www.amazon.com
    And searchs for "<Product>"
    And navigates to page number "2"
    And selects the thrid item
    Then the user is able to add it to the card

    Examples:
      | Product     |
      | Alexa   |
#      | playstation |