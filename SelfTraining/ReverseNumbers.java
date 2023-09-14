package SelfTraining;

public class ReverseNumbers {
    public static void main(String[] args) {
        int test1 = 12345;
        reverseNumber(test1);
    }

    public static void reverseNumber(int number) {
        // --------- FIRST TRY ---------------------
        String reverse = Integer.toString(number);
        for (int i = reverse.length() - 1; i >= 0; i--) {
            System.out.print(reverse.charAt(i));
        }
        // --------- SECOND TRY --------------------
        // while (number != 0) {
        // int reverse = number % 10;
        // System.out.print(reverse);
        // number /= 10;
        // }
    }
}
