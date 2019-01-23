package calculator.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {
    @Given("I have two numbers {string} and {string}")
    public void iHaveTwoNumbersAnd(final String firstNumber, final String secondNumber) {
        throw new PendingException();
    }

    @When("I add the numbers together")
    public void iAddTheNumbersTogether() {
        throw new PendingException();
    }

    @Then("I am returned the correct {string}")
    public void iAmReturnedTheCorrect(final String expectedResult) {
        throw new PendingException();
    }
}
