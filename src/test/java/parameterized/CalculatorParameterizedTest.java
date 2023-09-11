package parameterized;

import classes.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class CalculatorParameterizedTest {
    Calculator calculator = new Calculator(); // create new object
    private final int firstNumber;
    private final int secondNumber;
    private final int expected;

//    Create Constructor
    public CalculatorParameterizedTest(int firstNumber, int secondNumber, int expected) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.expected = expected;
    }

//    Create Parameterized data
    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {1, 9, 10},
                {1, 0, 1},
        };
    }

//    Create test
    @Test
    public void shouldBeSum() {
        int actualResult = calculator.sum(firstNumber, secondNumber);
        assertEquals(actualResult, expected);
    }
}