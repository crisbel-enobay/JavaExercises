package Codewars;

import java.lang.Math;

public class PositiveToNegative {
    public static void main(String[] args) {
        int positiveNumber = 6;
        System.out.println(makeNegative(positiveNumber));
    }

    public static int makeNegative(int number) {
        // Final Solution
        return -Math.abs(number);

        // Solution 2
        // return number < 0 ? number : -number;

        // Solution 1
        // if (number < 0) {
        // return number;
        // }
        // return -number;
    }
}
