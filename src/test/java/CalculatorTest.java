import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

// Test sum positive numbers
    @Test
    public void shouldBeSumPositive() {
        Calculator calculator = new Calculator(); // create new object
        int firstNumber = 1;
        int secondNumber = 9;
        int actualResult = calculator.sum(firstNumber, secondNumber); // called the method being tested
        int expectedResult = 10; // actual result
        assertEquals(actualResult, expectedResult); // compare actual && expected results
    }
//    Test sum positive number && zero
    @Test
    public void shouldBeSumPositiveAndZero() {
        Calculator calculator = new Calculator();
        int firstNumber = 1;
        int secondNumber = 0;
        int actualResult = calculator.sum(firstNumber, secondNumber);
        int expectedResult = 1;
        assertEquals(actualResult, expectedResult);
    }
}