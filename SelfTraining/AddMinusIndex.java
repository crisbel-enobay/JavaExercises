package SelfTraining;

import java.util.Arrays;

public class AddMinusIndex {
    public static void main(String[] args) {
        int[] numbers = { 3, 7, 8, 4, 9 };
        System.out.println(Arrays.toString(addMinus(numbers)));
    }

    public static int[] addMinus(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        int count = 0;
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        for (int i = 0; i < numbers.length; i++) {
            newNumbers[count++] = total - numbers[i];
        }
        return newNumbers;
    }
}