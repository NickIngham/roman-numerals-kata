package com.kata.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    @Test
    void givenAValueOfOneEntered_WhenConverterIsCalled_ThenIisReturned(){
        var number = 1;
        var converter = new RomanNumeralConverter();
        var expected = "I";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfTwoEntered_WhenConverterIsCalled_ThenIIisReturned(){
        var number = 2;
        var converter = new RomanNumeralConverter();
        var expected = "II";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfThreeEntered_WhenConverterIsCalled_ThenIIIisReturned(){
        var number = 3;
        var converter = new RomanNumeralConverter();
        var expected = "III";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }
}