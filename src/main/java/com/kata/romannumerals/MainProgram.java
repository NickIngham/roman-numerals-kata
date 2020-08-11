package com.kata.romannumerals;

import java.text.MessageFormat;
import java.util.Random;
import java.util.logging.Logger;

public class MainProgram {
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        var max = 3999;
        var min = 1;
        var random = new Random();
        var number = random.nextInt(max - min + 1) + min;
        var converter = new RomanNumeralConverter();

        var numerals = converter.convert(number);
        LOGGER.info(MessageFormat.format("\nNumber: {0} \n" +
                "Numerals: {1}",
                number,
                numerals));
    }
}
