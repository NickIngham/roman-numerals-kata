package com.kata.romannumerals;
import java.util.TreeMap;

public class RomanNumeralConverter {

    private TreeMap<Integer, String> numerals;

    public RomanNumeralConverter() {
        numerals = new TreeMap<>();
        numerals.put(1, "I");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(40, "XL");
        numerals.put(50, "L");
        numerals.put(90, "XC");
        numerals.put(100, "C");
        numerals.put(400, "CD");
        numerals.put(500, "D");
        numerals.put(900, "CM");
        numerals.put(1000, "M");
    }

    public String convert(int number) {
        if (number == 0) return "";
        var entry = numerals.floorEntry(number);
        number -= entry.getKey();
        return entry.getValue() + convert(number);
    }
}
