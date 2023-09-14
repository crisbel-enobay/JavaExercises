package SelfTraining;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] numbers = { 2, 2, 4, 3, 3 };
        System.out.print(singleNumber(numbers));
    }

    public static int singleNumber(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            int count = map.containsKey(number) ? map.get(number) : 0;
            map.put(number, count + 1);
        }
        for (int number : numbers) {
            if (map.get(number) == 1) {
                return number;
            }
        }
        return 0;
    }
}
