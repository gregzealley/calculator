@Calculator
Feature: Subtraction functionality in the calculator

  Scenario Outline: Subtracting two numbers
    When I subtract two numbers "<number_one>" and "<number_two>"
    Then I am returned the correct "<result>"

    Examples:
      | number_one | number_two | result |
      | 1          | 1          | 0      |
      | 1          | 0          | 1      |
      | 4          | 2          | 2      |
      | 503342     | 28883      | 474459 |
