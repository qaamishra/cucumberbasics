Feature: Calculator
  As a user
  I want to pass direct values in the steps
  So that I use them in stepdef

  Scenario: Add two numbers
    Given I have a calculator
    When I add "2" and "3"
    Then the result should be 5