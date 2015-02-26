package leetcode.java;

import java.util.HashMap;
import java.util.Map;

// leetcode - two sum
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(numbers[0], 1);

        for (int i = 1; i < numbers.length; i++) {
            int lookup = target - numbers[i];
            Integer next = map.get(lookup);

            if (next != null) {
                if (i+1 > next) {
                    return new int[] { next, i+1 };
                } else {
                    return new int[] { i+1, next };
                }
            } else {
                map.put(numbers[i], i+1);
            }
        }

        return null;

    }

}
