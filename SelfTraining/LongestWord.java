package SelfTraining;

public class LongestWord {
    public static void main(String[] args) {
        String test1 = "Today is the day";
        System.out.println(longestWord(test1));

        String test2 = "A combination or group of words that gives a complete meaning, thought or idea is called a sentence.";
        System.out.println(longestWord(test2));

    }

    public static String longestWord(String words) {
        String[] word = words.split(" ");
        String longestWord = "";
        for (String w : word) {
            if (w.length() == longestWord.length()) {
                System.out.println(longestWord);
                longestWord = w;
            }
            if (w.length() > longestWord.length()) {
                longestWord = w;
            }
        }
        return longestWord;
    }
}
