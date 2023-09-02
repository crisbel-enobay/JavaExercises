package SelfTraining;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.print(Arrays.toString(reverseArray(numbers)));
    }

    public static int[] reverseArray(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reverseNumbers[count++] = numbers[i];
        }
        return reverseNumbers;
    }
}
