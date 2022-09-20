package Java;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] array = { 1, 4, 35, 3, 2, 5 };
        Bubble(array);
        System.out.println(Arrays.toString(array));

    }

    public static void Bubble(int[] array) {
        boolean swapped;
        // It's take the array and compare to it's previous number and swap if required
        for (int i = 0; i < array.length; i++) {
            // If element is already in order don't touch it
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                System.out.println(Arrays.toString(array));
                System.out.println((array[j]));
                System.out.println((array[j - 1]));
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
