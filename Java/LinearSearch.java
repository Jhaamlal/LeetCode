package Java;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3, 4, 6 },
                { 4, 3, 2, 5 },
                { 65, 3, 2, 2 }
        };
        int target = 65;
        int res = search(arr, target);
        System.out.println(res);

    }

    // static int search(int[] arr, int target) {
    // if (arr.length == 0) {
    // return -1;
    // }
    // for (int i : arr) {
    // if (i == target) {
    // return 1;
    // }
    // }
    // return -1;
    // }

    // static boolean search(String str, char target) {
    // if (str.length() == 0) {
    // return false;
    // }
    // for (int i = 0; i < str.length(); i++) {
    // if (target == str.charAt(i)) {
    // return true;
    // }

    // }
    // return false;

    // }

    static int minNumber(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int search(int[][] arr, int target) {
        int res = 0;
        for (int[] is : arr) {
            for (int is2 : is) {
                if (is2 % 2 == 0) {
                    res++;
                }
            }
        }
        return res;

    }
}
