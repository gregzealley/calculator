package gregzealley.calculator.steps;

import gregzealley.calculator.Calculator;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class CucumberSteps {

    private int result;

    @When("I add two numbers {string} and {string}")
    public void iAddTwoNumbersAnd(final String firstNumberParam, final String secondNumberParam) {
        //need to convert to int - unable to pass int from Cucumber Expressions
        int firstNumber = Integer.parseInt(firstNumberParam);
        int secondNumber = Integer.parseInt(secondNumberParam);

        Calculator calculator = new Calculator();
        result = calculator.add(firstNumber, secondNumber);
    }

    @Then("I am returned the correct {string}")
    public void iAmReturnedTheCorrect(final String expectedResultParam) {
        final int expectedResult = Integer.parseInt(expectedResultParam);

        assertThat(result)
                .as("Addition is correct")
                .isEqualTo(expectedResult);
    }
}
