package SelfTraining;

public class WordVowels {
    public static void main(String[] args) {
        String word = "Kaizoku Ou ni, ore wa naru!";
        System.out.println(countVowels(word));

        String testCase1 = "hi thEre";
        System.out.println(countVowels(testCase1));

        String testCase2 = "happy NEw YeAr";
        System.out.println(countVowels(testCase2));
    }

    // using split method
    public static int countVowels(String words) {
        String vowels = "aeiou";
        int count = 0;
        String[] strWord = words.split("");
        for (String word : strWord) {
            if (vowels.contains(word.toLowerCase())) {
                count++;
            }
        }
        return count;
    }

    // using charAt method
    // public static int countVowels(String word) {
    // String vowels = "aeiou";
    // int count = 0;
    // for (int i = 0; i < word.length(); i++) {
    // char chWord = word.charAt(i);
    // if (vowels.contains(String.valueOf(chWord).toLowerCase())) {
    // count++;
    // }
    // }
    // return count;
    // }

}
