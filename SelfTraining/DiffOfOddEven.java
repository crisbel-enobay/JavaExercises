package SelfTraining;

public class DiffOfOddEven {
    public static void main(String[] args) {
        int[] testCase1 = { 12, 5, 3, 8, 10, 9, 20, 1, 13, 30 };
        System.out.println(diffOfArray(testCase1));

        int[] testCase2 = { 12, 20, 23, 45, 55, 23, 66, 99, 1, 2 };
        System.out.println(diffOfArray(testCase2));
    }

    public static int diffOfArray(int[] numbers) {
        int resultEven = 0;
        int resultOdd = 0;
        int result = 0;
        for (int number : numbers) {
            result = (number % 2 == 0) ? (resultEven += 1) : (resultOdd += 1);
        }
        result = resultOdd - resultEven;
        return Math.abs(result);
    }
}
