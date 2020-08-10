package com.kata.romannumerals;

public class RomanNumeralConverter {

    public String convert(int i) {
        switch (i) {
            case 3:
                return "III";
            case 2:
                return "II";
            default:
                return "I";
        }
    }
}
