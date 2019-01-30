package gregzealley.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void addTwoPositiveNumbersReturnsCorrectResult() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void addTwoZeroNumbersReturnsZero() {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    public void addTwoLargeNumbersReturnsCorrectResult() {
        assertEquals(40000, calculator.add(20000, 20000));
    }

    @Test
    public void deleteTwoPositiveNumbersReturnsCorrectResult() {
        assertEquals(5, calculator.delete(10, 5));
    }

    @Test
    public void deleteZeroFromNumberReturnsCorrectResult() {
        assertEquals(10, calculator.delete(10, 0));
    }

    @Test
    public void deleteValueFromZeroReturnsCorrectResult() {
        assertEquals(-34, calculator.delete(0, 34));
    }

    @Test
    public void deleteZeroFromZeroReturnsCorrectResult() {
        assertEquals(0, calculator.delete(0, 0));
    }

}