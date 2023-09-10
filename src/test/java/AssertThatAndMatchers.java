import org.junit.Test;
import org.hamcrest.MatcherAssert;

import static org.hamcrest.CoreMatchers.*;

public class AssertThatAndMatchers {

    //    AssertThat && Matcher


    //    Matcher for Strings "containsString"
    @Test
    public void shouldBeContainString() {
        String actual = "Java";
        String expected = "va";
        MatcherAssert.assertThat(actual, containsString(expected));
    }

    //    Matcher for Strings "startsWith"
    @Test
    public void shouldBeStartWithJ() {
        String actual = "Java";
        String jSign = "J";
        MatcherAssert.assertThat(actual, startsWith(jSign));
    }

    //    Matcher for Strings "endsWith"
    @Test
    public void shouldBeEndsWithVa() {
        String actual = "Java";
        String jSign = "J";
        MatcherAssert.assertThat(actual, startsWith(jSign));
    }

    //    Matcher for Strings "allOf"
    @Test
    public void shouldBeAllOfConditions() {
        String actual = "Java";
        String JSign = "J";
        String vaLetters = "va";
        MatcherAssert.assertThat(actual, allOf(containsString(vaLetters), startsWith(JSign)));
    }

    //    Matcher for Strings "anyOf"
    @Test
    public void shouldBeAnyOfConditions() {
        String actual = "Java";
        String JSign = "J";
        String vaLetters = "va";
        MatcherAssert.assertThat(actual, anyOf(endsWith(vaLetters), startsWith(JSign)));
    }

    //    Matcher "notNullValue"
    @Test
    public void shouldBeNotNullValue() {
        String actual = "Java";
        MatcherAssert.assertThat(actual, notNullValue());
    }

    //    Matcher "is"
    @Test
    public void shouldBeBooleanIs() {
        MatcherAssert.assertThat(10, is(10));
    }

    //    Matcher "isNot"
    @Test
    public void shouldBeBooleanIsNot() {
        MatcherAssert.assertThat(10, is(not(11)));
    }
}