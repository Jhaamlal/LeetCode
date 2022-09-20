package Java;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.println(Arrays.toString(arr));
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
