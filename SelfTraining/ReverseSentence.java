package SelfTraining;

//import java.util.Arrays;

public class ReverseSentence {

    // reverse sentence using StringBuilder
    public static void main(String[] args) {
        String words = "this is a sample";
        System.out.println(reverseSentence(words));
    }

    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reverseWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverseWords.append(words[i] + " ");
        }
        return reverseWords.toString().trim();
    }

    /*
     * without using StringBuilder
     * public static void main(String[] args) {
     * String words = "My name is crisbel";
     * System.out.println(reverseSentence(words));
     * }
     * 
     * public static String reverseSentence(String sentence) {
     * String[] words = sentence.split(" ");
     * String[] newWords = new String[words.length];
     * int count = 0;
     * 
     * for (int i = words.length - 1; i >= 0; i--) {
     * newWords[count++] = words[i];
     * }
     * return String.join(" ", newWords);
     * }
     */
}
