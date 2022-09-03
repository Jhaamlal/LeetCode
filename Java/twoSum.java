package Java;

import java.util.Arrays;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));

    }

    public static int[] twoSum(int[] nums, int target) {
        int pointer1 = 0;
        int[] result = {};
        while (pointer1 < nums.length) {
            int pointer2 = pointer1 + 1;
            while (pointer2 < nums.length) {
                if (nums[pointer1] + nums[pointer2] == target) {
                    int[] result1 = { pointer1, pointer2 };
                    return result1;
                } else {
                    pointer2 += 1;
                }
            }
            pointer1 += 1;
        }
        return result;
    }
}
