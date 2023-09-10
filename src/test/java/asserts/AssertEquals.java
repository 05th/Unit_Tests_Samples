package asserts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssertEquals {

    //    Compare integers
    @Test
    public void shouldBeTwoNumbersEqual() {
        int actual = 5;
        int expected = 5;
        assertEquals(actual, expected);
    }

    //    Compare Double
    @Test
    public void shouldBeTwoDoubleEquals() {
        double actual = 150.00;
        double expected = 150.04;
        double delta = 0.05; // Delta is max difference between actual and expected result
        assertEquals(actual, expected, delta);
    }

    //    Compare Strings
    @Test
    public void shouldBeTwoStringEqual() {
        String actual = "Hello World in Java";
        String expected = "Hello World in Java";
        assertEquals("This message will be shown, if test failed", actual, expected);
    }
}