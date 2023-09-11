package SelfTraining;

//import java.util.Arrays;

public class ReverseWord {
    // reverse a word using StringBuilder
    public static void main(String[] args) {
        String words = "example";
        System.out.println(reverseWord(words));
    }

    public static String reverseWord(String words) {
        char[] word = words.toCharArray();
        StringBuilder reverseWord = new StringBuilder();
        for (int i = word.length - 1; i >= 0; i--) {
            reverseWord.append(word[i]);
        }
        return reverseWord.toString();
    }

    /*
     * without StringBuilder
     * public static void main(String[] args) {
     * String words = "example";
     * System.out.println(reverseString(words));
     * }
     * 
     * public static String reverseString(String words) {
     * char[] newStr = words.toCharArray();
     * char[] newCharArray = new char[newStr.length];
     * int count = 0;
     * 
     * for (int i = newStr.length - 1; i >= 0; i--) {
     * newCharArray[count++] = newStr[i];
     * }
     * return new String(newCharArray);
     * }
     */
}
