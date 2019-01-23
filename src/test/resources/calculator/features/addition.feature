@Calculator
Feature: Addition functionality in the calculator

  Scenario Outline: Adding positive numbers
    Given I have two numbers "<number_one>" and "<number_two>"
    When I add the numbers together
    Then I am returned the correct "<result>"

    Examples:
      | number_one | number_two | result |
      | 1          | 1          | 2      |
      | 1          | 0          | 1      |
      | 0          | 0          | 0      |
      | 1000       | 20000      | 21000  |
