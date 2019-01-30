package gregzealley.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/gregzealley/calculator/features",
        glue = "gregzealley.calculator.steps",
        tags = "@Calculator",
        plugin = {"pretty", "json:target/cucumber/results.json"}
)
public class CalculatorRunnerIT {
}
