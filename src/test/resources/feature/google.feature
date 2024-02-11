@test-execution
Feature: Probar la busqueda en google

  @test-execution @test-group @google-001
  Scenario Outline: Busco algo en google
    Given I am on the Google page
    When I enter a search "<criteria>"
    And click on the search button
    Then the results match the criteria
    Examples:
      | criteria  |
      | Argentina |

  @test-execution @test-group @sandbox-002
  Scenario: As a test Engineer, I try out different actions on a sandbox page.
    Given I navigate to sandbox page
    And select a value from the dropdown

  @test-execution @test-group @list-003
  Scenario: As a test Engineer, I want that a text is present inside the list.
    Given I navigate to the list page
    When I search the list
    Then I can find the text in the list