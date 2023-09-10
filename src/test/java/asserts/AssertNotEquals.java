package asserts;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;


public class AssertNotEquals {

    //    Compare integers
    @Test
    public void shouldBeNotTwoNumbersEqual() {
        int actual = 5;
        int expected = 6;
        assertNotEquals("This message will be shown, if test failed", actual, expected);
    }

    //    Compare Double
    @Test
    public void shouldBeNotTwoDoubleEquals() {
        double actual = 150.00;
        double expected = 150.05;
        double delta = 0.05; // Delta is max difference between actual and expected result
        assertNotEquals("This message will be shown, if test failed", actual, expected, delta);
    }

    //    Compare Strings
    @Test
    public void shouldBeNotTwoStringEqual() {
        String actual = "Hello World in Java";
        String expected = "Hello World in Python";
        assertNotEquals("This message will be shown, if test failed", actual, expected);
    }
}