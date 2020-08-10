package com.kata.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    @Test
    void givenAValueOfOneEntered_WhenConverterIsCalled_ThenIisReturned(){
        var number = 1;
        var converter = new RomanNumralConverter();
        var expected = "I";

        var result = converter.convert(1);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfTwoEntered_WhenConverterIsCalled_ThenIIisReturned(){
        var number = 1;
        var converter = new RomanNumralConverter();
        var expected = "II";

        var result = converter.convert(2);

        assertEquals(expected, result);
    }
}