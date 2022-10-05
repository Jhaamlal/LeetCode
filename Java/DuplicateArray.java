// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> x = findDuplicates(nums);
        System.out.println(x);

    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (i < nums.length) {
            System.out.println(Arrays.toString(nums));
            if (nums[i] != i + 1) {
                i++;
            } else if (nums[i] == nums[nums[i] - 1]) {
                if (!list.contains(nums[i])) {
                    list.add(nums[i]);
                }
                i++;
            } else {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }

        }

        return list;
    }
}

// Time error for java solution in the leetcode