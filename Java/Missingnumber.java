package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Missingnumber {
    // Will use Cyclic sort to solve the issue for learning purpose
    public static void main(String[] args) {
        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int number = missingNumber(nums);
        System.out.println(number);

    }

    public static int missingNumber(int[] nums) {
        // length of array
        // Then while loop to check
        // initite the integer for the element
        int arrLen = nums.length;
        int i = 0;
        while (i < arrLen) {
            // if the element is at right position then move forward ,else what you do is
            System.out.println(Arrays.toString(nums));
            if (i != nums[i]) {
                if (nums[i] > arrLen - 1) {
                    i++;
                } else {
                    // First is that it is storing ,which element at wrong position
                    // then figure out which element is at that position
                    int temp = nums[nums[i]];
                    // below What it does that
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j]) {
                return j;
            }
        }
        return arrLen;

    }

    // better solution of the things

    // public static int missNumber(int[] nums) {
    // List<Integer> list = Arrays.asList(nums);
    // System.out.println(list);
    // for (int i = 0; i < nums.length; i++) {
    // System.out.println(list.contains(i));
    // if (list.contains(i)) {

    // } else {
    // return i;
    // }
    // }
    // return nums.length;
    // }

}
