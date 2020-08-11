package com.kata.romannumerals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    private RomanNumeralConverter converter;

    @BeforeEach
    void init(){
        converter = new RomanNumeralConverter();
    }

    @Test
    void givenAValueOfOneEntered_WhenConverterIsCalled_ThenIisReturned(){
        var number = 1;
        var expected = "I";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfTwoEntered_WhenConverterIsCalled_ThenIIisReturned(){
        var number = 2;
        var expected = "II";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfThreeEntered_WhenConverterIsCalled_ThenIIIisReturned(){
        var number = 3;
        var expected = "III";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfFourEntered_WhenConverterIsCalled_ThenIVisReturned(){
        var number = 4;
        var expected = "IV";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfFiveEntered_WhenConverterIsCalled_ThenVisReturned(){
        var number = 5;
        var expected = "V";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfSixEntered_WhenConverterIsCalled_ThenVIisReturned(){
        var number = 6;
        var expected = "VI";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfNineEntered_WhenConverterIsCalled_ThenIXisReturned(){
        var number = 9;
        var expected = "IX";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfTenEntered_WhenConverterIsCalled_ThenXisReturned(){
        var number = 10;
        var expected = "X";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfFortyEntered_WhenConverterIsCalled_ThenXLisReturned(){
        var number = 40;
        var expected = "XL";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfFiftyEntered_WhenConverterIsCalled_ThenLisReturned(){
        var number = 50;
        var expected = "L";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

    @Test
    void givenAValueOfNinetyEntered_WhenConverterIsCalled_ThenXCisReturned(){
        var number = 90;
        var expected = "XC";

        var result = converter.convert(number);

        assertEquals(expected, result);
    }

}