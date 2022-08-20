package Java;

import java.util.Arrays;

public class ArrayBuilder {
    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        int[] newArray = new int[nums.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(newArray));
    }

}
