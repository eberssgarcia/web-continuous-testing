@test-execution
Feature: Test different on the static Table Page

  Rule: The user can return values from the table and validate them.

    Background: navigate to table web app.
      Given I navigate to static table

    @test-execution @table-group @table-001
    Scenario: As a test Engineer, I want to retrieve the value of an static table
      Then I can return the I wanted

    @test-execution @table-group @table-002
    Scenario: As a test Engineer, I want to retrieve the value of an static table
      Then I can validate the table is displayed