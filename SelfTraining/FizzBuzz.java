package SelfTraining;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.print(fizzBuzz(30));
    }

    public static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "not a dividend of either 3 or 5";
        }
    }
}
