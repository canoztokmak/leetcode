

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode - 3sum
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println("nums:"+ Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length-2; i++) {
            int start = i+1;
            int end = nums.length-1;

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    end--;
                    start++;
                    while (start < end && nums[end+1] == nums[end]) end--;
                    while (start < end && nums[start-1] == nums[start]) start++;
                } else if (sum > 0) {
                    end -= 1;
                } else {
                    start += 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        List<List<Integer>> result = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> result = threeSum(new int[]{-2, 0, 1, 1, 2});
        System.out.println(result.size());
        for (List<Integer> l : result) {
            System.out.println(Arrays.toString(l.toArray()));
        }
    }
}
