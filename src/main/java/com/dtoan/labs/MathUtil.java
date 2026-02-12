package com.dtoan.labs;

public class MathUtil {

    public static long getFactorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Invalid number. " + "N must be between 0 and 20");
        }

        if (number == 0) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }
}
