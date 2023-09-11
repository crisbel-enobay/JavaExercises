package SelfTraining;

public class StringRotation {
    public static void main(String[] args) {
        String origTest1 = "abcde";
        String toCompare1 = "cdeab";
        System.out.println(isStringRotation(origTest1, toCompare1));

        String origTest2 = "abcde";
        String toCompare2 = "abced";
        System.out.println(isStringRotation(origTest2, toCompare2));
    }

    public static boolean isStringRotation(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() != text2.length()) {
            return false;
        }
        StringBuilder comparison = new StringBuilder(text1);
        comparison.append(text1);
        return comparison.toString().contains(text2);
    }
}
