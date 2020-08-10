package com.kata.romannumerals;

import java.util.HashMap;

public class RomanNumeralConverter {

    private HashMap<Integer, String> numerals;

    public RomanNumeralConverter() {
        numerals = new HashMap<>();
        numerals.put(1, "I");
        numerals.put(2, "II");
        numerals.put(3, "III");
        numerals.put(4, "IV");
        numerals.put(5, "V");

    }

    public String convert(int number) {
        return numerals.get(number);
    }
}
