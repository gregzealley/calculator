@Calculator
Feature: Deletion functionality in the calculator

  Scenario Outline: Deleting two numbers
    When I delete two numbers "<number_one>" and "<number_two>"
    Then I am returned the correct "<result>"

    Examples:
      | number_one | number_two | result |
      | 1          | 1          | 0      |
      | 1          | 0          | 1      |
      | 4          | 2          | 2      |
      | 503342     | 28883      | 474459 |
