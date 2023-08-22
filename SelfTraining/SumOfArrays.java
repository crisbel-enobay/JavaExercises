package SelfTraining;

public class SumOfArrays {
    public static void main(String[] args) {
        int[] testCase1 = { 1, 2, 3, 4, 5 };
        System.out.println(sumOfArray(testCase1));

        int[] testCase2 = { 2, 4, 6, 8, 10 };
        System.out.println(sumOfArray(testCase2));
    }

    public static int sumOfArray(int[] number) {
        int totalSum = 0;
        for (int n : number) {
            totalSum += n;
        }
        return totalSum;
    }
}