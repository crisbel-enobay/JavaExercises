package SelfTraining;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String words = "madam";
        System.out.println(reverseSentence(words));
    }

    public static String reverseSentence(String sentence) {
        char[] words = sentence.toCharArray();
        char[] newWords = new char[words.length];
        int count = 0;

        for (int i = words.length - 1; i >= 0; i--) {
            newWords[count++] = words[i];
        }
        String reverse = new String(newWords);
        if (reverse.equals(sentence)) {
            return sentence + " is a palindrome";
        } else {
            return sentence + " is not a palindrome";
        }
    }
}
