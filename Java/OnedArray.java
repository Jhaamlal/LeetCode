package Java;

import java.lang.reflect.Array;

public class OnedArray {
    public static int[] main(String[] args) {
        int[] nums = new int[5];
        int prev = 0;
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prev = nums[i];
                newArr[i] = prev;
            } else {
                prev = prev + nums[i];
                newArr[i] = prev;
            }

        }
        return newArr;
    }
}
