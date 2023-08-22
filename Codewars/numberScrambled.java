import java.util.Arrays;

public class numberScrambled {
    public static void main(String[] args) {
        System.out.println(shuffle(21));
    }

    public static int shuffle(int n) {
        String numStr = Integer.toString(n);
        if (numStr.length() <= 1) {
            return n;
        }

        char[] midDigits = numStr.substring(1, numStr.length() - 1).toCharArray();

        Arrays.sort(midDigits);

        String scrambledStr = numStr.charAt(numStr.length() - 1) + new String(midDigits) + numStr.charAt(0);

        return Integer.parseInt(scrambledStr);
    }
}
