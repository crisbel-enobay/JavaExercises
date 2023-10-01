package Codewars;

public class SumOfPositive {
    public static void main(String[] args) {
        int[] numbers = { 1, -2, -3, 4, 5 };
        System.out.print(sum(numbers));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }
}
