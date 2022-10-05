package Java;

import java.util.Arrays;

// https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int x = dupliacte(nums);
        System.out.println(x);

    }

    public static int dupliacte(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i + 1) {
                i++;
            } else if (nums[i] == nums[nums[i] - 1]) {
                return nums[i];
            } else {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        return 0;

    }
}
