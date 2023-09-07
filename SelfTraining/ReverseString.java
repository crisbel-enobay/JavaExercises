package SelfTraining;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String words = "example";
        System.out.println(reverseString(words));
    }

    public static String reverseString(String words) {
        char[] newStr = words.toCharArray();
        char[] newCharArray = new char[newStr.length];
        int count = 0;

        for (int i = newStr.length - 1; i >= 0; i--) {
            newCharArray[count++] = newStr[i];
        }
        return new String(newCharArray);
    }
}
