package Java;

import java.util.Arrays;

public class Missingnumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 0 };
        int numOut = firstPositiveNumber(nums);
        System.out.println(numOut);

    }

    public static int firstPositiveNumber(int[] nums) {
        Arrays.sort(nums);
        int realNumber = 1;
        for (int i : nums) {
            if (i > 0 && realNumber <= i) {
                if (realNumber == i) {
                    realNumber++;
                } else {
                    return realNumber;
                }
            }
        }

        return realNumber;
    }
}
