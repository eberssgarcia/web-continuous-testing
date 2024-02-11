@test-execution
Feature: TradeMe UI and API Tests

  Rule: This is a good place to put which business rule we are this feature.

#    Navegar a la pagina y ver la cantidad de marcas que tenemos dentro de un dropdown
    @test-execution @test-group @TradeMe-001
    Scenario: "As a user, I can all the car makes on the dropdown"
      Given I navigate to the TradeMe Motor Page
      Then I can verifu that of car makes is 82

#    @test-execution @test-group @TradeMe-002
#    Scenario Outline: "As a user, I can validate that each make has the right amount of cars listed"
#      Given I navigate to the TradeMe Motor Page
#      When I select the car make "<Make>"
#      Then I can see it has "<Amount>" records in the results
#      Examples:
#        | Make    | Amount |
#        | Ferrari | 32     |
#        | BMW     | 3,660  |
#        | Mazda   | 6,389  |
#        | Honda   | 2,802  |
#
#    @test-execution @test-group @TradeMe-003
#    Scenario: "As a user, I want to verify the amount of car makes throught the API"
#      Given I send request to the endpoint
#      Then I can there are 78 car makes