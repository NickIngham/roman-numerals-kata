package com.kata.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RomanNumeralsParameterizedTests {

  private static RomanNumeralConverter converter;

  @BeforeAll
  static void setup() {
    converter = new RomanNumeralConverter();
  }

  @ParameterizedTest
  @MethodSource("proviideInputAndExpected")
  void parameterizedConverterTest(int input, String expected) {
    assertEquals(converter.convert(input), expected);
  }

  private static Stream<Arguments> proviideInputAndExpected() {
    return Stream.of(
        Arguments.of(1, "I"),
        Arguments.of(2, "II"),
        Arguments.of(3, "III"),
        Arguments.of(4, "IV"),
        Arguments.of(5, "V"),
        Arguments.of(6, "VI"),
        Arguments.of(9, "IX"),
        Arguments.of(10, "X"),
        Arguments.of(40, "XL"),
        Arguments.of(50, "L"),
        Arguments.of(50, "L"),
        Arguments.of(90, "XC"),
        Arguments.of(100, "C"),
        Arguments.of(400, "CD"),
        Arguments.of(500, "D"),
        Arguments.of(900, "CM"),
        Arguments.of(1000, "M"),
        Arguments.of(944, "CMXLIV")
    );
  }
}
