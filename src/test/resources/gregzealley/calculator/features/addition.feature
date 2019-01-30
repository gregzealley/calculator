@Calculator
Feature: Addition functionality in the calculator

  Scenario Outline: Adding two positive numbers
    When I add two numbers "<number_one>" and "<number_two>"
    Then I am returned the correct "<result>"

    Examples:
      | number_one | number_two | result |
      | 1          | 1          | 2      |
      | 1          | 0          | 1      |
      | 0          | 0          | 0      |
      | 1000       | 20000      | 21000  |
