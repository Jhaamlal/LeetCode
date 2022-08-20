package Java;

import java.util.Arrays;

public class Firstlast {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 3, 3, 4, 5, 9 };
        int target = 3;
        int[] positions = getPosition(nums, target);
        System.out.println(Arrays.toString(positions));
    }

    public static int[] getPosition(int[] nums, int target) {
        int[] item = { -1, -1 };
        int[] single = { 0, 0 };
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        if (start == end) {
            if (nums[0] == target) {
                return single;
            } else {
                return item;
            }
        }
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                break;
                // return mid;
            }
        }
        if (start > end) {
            return item;
        }
        for (int i = mid; i >= start; i--) {
            if (nums[i] < target) {
                item[0] = i + 1;
                break;
            } else if (nums[i] == target) {
                item[0] = i;
            }
        }

        for (int i = mid; i <= end; i++) {
            if (nums[i] > target) {
                item[1] = i - 1;
                break;
            } else if (nums[i] == target) {
                item[1] = i;
            } else {
                if (i > 0) {
                    item[1] = i - 1;
                }
            }
        }
        return item;
    }

}

// Question asked in facebook
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/