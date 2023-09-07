package SelfTraining;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {
        String words = "My name is crisbel";
        System.out.println(reverseSentence(words));
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        String[] newWords = new String[words.length];
        int count = 0;

        for (int i = words.length - 1; i >= 0; i--) {
            newWords[count++] = words[i];
        }
        return String.join(" ", newWords);
    }
}
